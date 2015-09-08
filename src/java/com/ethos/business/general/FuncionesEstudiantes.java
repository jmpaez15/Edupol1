

package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.AcudienteDAO;
import com.ethos.DAO.CentroAsociadoDAO;
import com.ethos.DAO.CiudadesDAO;
import com.ethos.DAO.EstudiantesDAO;
import com.ethos.DAO.GrupoProgramasDAO;
import com.ethos.DAO.NivelEstudiosDAO;
import com.ethos.DAO.NivelFormacionDAO;
import com.ethos.DAO.PersonasDAO;
import com.ethos.DAO.ProfesionesDAO;
import com.ethos.DAO.ProgramasDAO;
import com.ethos.model.AcudienteModel;
import com.ethos.model.DireccionesModel;
import com.ethos.model.EstudianteModel;
import com.ethos.model.GrupoProgramasModel;
import com.ethos.model.ListasGeneralesModel;
import com.ethos.model.NivelEstudiosModel;
import com.ethos.model.NivelFormacionModel;
import com.ethos.model.PersonaModel;
import com.ethos.model.ProgramasModel;
import com.ethos.model.TelefonosModel;
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Mary
 */


public class FuncionesEstudiantes {
    
    AbstractDAO estudianteDAO;
    AbstractDAO acudienteDAO;
    AbstractDAO personasDAO;
    AbstractDAO telefonosDAO;
    AbstractDAO direccionesDAO;
    AbstractDAO nivelFormacionDAO;
    AbstractDAO nivelEstudiosDAO;
    AbstractDAO grupoProgramaDAO;
    AbstractDAO programasDAO;
    AbstractDAO ciudadesDAO;
    AbstractDAO centroAsociadoDAO;
    
    PersonaModel personaEstudianteModel;
    PersonaModel personaAcudienteModel;
    EstudianteModel estudianteModel;
    AcudienteModel acudienteModel;
    TelefonosModel telefonoMovilEstModel;
    TelefonosModel telefonoEstModel;
    DireccionesModel direccionesModel;
    DireccionesModel direccionesAcudienteModel;
    TelefonosModel telefonoMovilAcudeienteModel;
    TelefonosModel telefonoAcudiente;
    ListasGeneralesModel listasGeneralesModel;
     
    
    
     public String guardarPreRegistro(JsonObject preRegistro) throws ParseException {

        String resultado = "NOK";
        JsonObject estudianteJObject;
        JsonObject acudienteObject;
        JsonObject tipoSolJObject;
        JsonObject nivelEducativoObject;
        JsonObject nacionalidadObject;
        JsonObject tipoIdenJsonObject;
        JsonObject generoJsonObject;
        JsonObject categoriaSisbenJsonObject;
        JsonObject paisResJsonObject;
        JsonObject departamentoResJsonObject;
        JsonObject ciudadResJsonObject;
        JsonObject estadoCivilJsonObject;
        JsonObject grupoSanquineoJsonObject;
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        
        JsonObject tipoIdenAcudienteJsonObject;
        JsonObject generoAcudienteJsonObject;
        JsonObject MedioMasivoJsonObject;

        estudianteDAO = new EstudiantesDAO();
        personasDAO = new PersonasDAO();                
      //  acudienteDAO = new TelefonosDAO();
        

        estudianteModel = new EstudianteModel();
        personaEstudianteModel = new PersonaModel();
      //  telefonoModel = new TelefonosModel();
      //  direccionesModel = new DireccionesModel();
        FuncionesGenerales funcionesGenerales=new FuncionesGenerales();
        
        estudianteJObject = preRegistro.get("estudiante").getAsJsonObject();
        tipoSolJObject = estudianteJObject.getAsJsonObject("TipoSol");
        nivelEducativoObject=estudianteJObject.getAsJsonObject("NivelEducativo");
        nacionalidadObject=estudianteJObject.getAsJsonObject("Nacionalidad");
        tipoIdenJsonObject=estudianteJObject.getAsJsonObject("Tipoiden");
        generoJsonObject= estudianteJObject.getAsJsonObject("genero");
        categoriaSisbenJsonObject=estudianteJObject.getAsJsonObject("categoriaSisben");
        paisResJsonObject=estudianteJObject.getAsJsonObject("paisRes");
        departamentoResJsonObject=estudianteJObject.getAsJsonObject("depRes");
        ciudadResJsonObject=estudianteJObject.getAsJsonObject("ciudadRes");
        estadoCivilJsonObject=estudianteJObject.getAsJsonObject("estCivil");
        grupoSanquineoJsonObject=estudianteJObject.getAsJsonObject("rh");
        
                
        
        
        
                
        
        String contraseña=funcionesGenerales.encripta(estudianteJObject.get("Contrasena").getAsString(), true);
        personaEstudianteModel.setsClavePersona(contraseña);
        personaEstudianteModel.setsCodPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        personaEstudianteModel.setStipoPersona("N");
        personaEstudianteModel.setIdPerfil(1);
                 try {
            personaEstudianteModel.setdFechaNacimiento(formatoFecha.parse(estudianteJObject.get("FechaNac").getAsString()));
            personaEstudianteModel.setdFechaExpedicion(formatoFecha.parse(estudianteJObject.get("fechaExp").getAsString()));
         } catch (Exception e) {
             System.out.println("date " +e);
         }
        personaEstudianteModel.setiTipoIden(tipoIdenJsonObject.get("iId_Identificacion").getAsInt());
        personaEstudianteModel.setsIden(estudianteJObject.get("NumIdentificacion").getAsString());
        personaEstudianteModel.setsNombre(estudianteJObject.get("PriNombre").getAsString()+" "+estudianteJObject.get("segNombre").getAsString());
        personaEstudianteModel.setsApellido(estudianteJObject.get("PriApellido").getAsString()+" "+estudianteJObject.get("SegApellido").getAsString());
        personaEstudianteModel.setsGenero(generoJsonObject.get("sInicial").getAsString());
        personaEstudianteModel.setsCodEstadoCivil(estadoCivilJsonObject.get("sCodigoEstadoCivil").getAsString());
        personaEstudianteModel.setiNivelEst(nivelEducativoObject.get("sCodigo").getAsInt());
       
        estudianteModel.setiCodigoEst(estudianteJObject.get("NumIdentificacion").getAsInt());
        estudianteModel.setiTipoSolicitud(tipoSolJObject.get("iId_tipoSolicitud").getAsInt());
        estudianteModel.setiNacionalidad(nacionalidadObject.get("sCodigo").getAsInt());
        estudianteModel.setsCiudadNacimiento(estudianteJObject.get("ciudadNacimiento").getAsString());
        estudianteModel.setsLugarNacimiento(estudianteJObject.get("lugarNacimiento").getAsString());       
        estudianteModel.setsLugarExpedicion(estudianteJObject.get("LugarExp").getAsString());        
        estudianteModel.setiCategoriaSisben(categoriaSisbenJsonObject.get("iIdCategoriaSisben").getAsInt());
        estudianteModel.setiPaisResidencia(paisResJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setiDepartamentoResidencia(departamentoResJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setiCiudadResidencia(ciudadResJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setsLocalidadResidencia(estudianteJObject.get("locRes").getAsString());
        estudianteModel.setsBarrioResidencia(estudianteJObject.get("BarrioRes").getAsString());
        estudianteModel.setiLibretaMilitar(estudianteJObject.get("LibretaMilitar").getAsInt());
        estudianteModel.setiGrupoSaniguineo(grupoSanquineoJsonObject.get("iCodigoTipoSangre").getAsInt());
         
        direccionesModel= new DireccionesModel();
        direccionesModel.setsTipoDir("2");
        direccionesModel.setsCliente(estudianteJObject.get("NumIdentificacion").getAsString());
        direccionesModel.setsDireccion(estudianteJObject.get("dirRes").getAsString());
        
        direccionesModel= new DireccionesModel();
        direccionesModel.setsTipoDir("3");
        direccionesModel.setsCliente(estudianteJObject.get("NumIdentificacion").getAsString());
        direccionesModel.setsDireccion(estudianteJObject.get("email").getAsString());
        
        telefonoMovilEstModel= new TelefonosModel();
        telefonoMovilEstModel.setsTipoTel("2");
        telefonoMovilEstModel.setsIdPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        telefonoMovilEstModel.setsNumero(estudianteJObject.get("telMovil").getAsString());
        
        telefonoEstModel= new TelefonosModel();
        telefonoEstModel.setsTipoTel("1");
        telefonoEstModel.setsIdPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        telefonoEstModel.setsNumero(estudianteJObject.get("tel").getAsString());
        
        acudienteObject=preRegistro.get("acudiente").getAsJsonObject();
        tipoIdenAcudienteJsonObject= acudienteObject.get("tipIden").getAsJsonObject();
        generoAcudienteJsonObject=acudienteObject.get("genero").getAsJsonObject();
        MedioMasivoJsonObject=acudienteObject.get("medioMasivo").getAsJsonObject();
        personaAcudienteModel = new PersonaModel();
        acudienteDAO=new AcudienteDAO();
        
        
        personaAcudienteModel.setsCodPersona(acudienteObject.get("numIden").getAsString());
        personaAcudienteModel.setiTipoIden(tipoIdenAcudienteJsonObject.get("iId_Identificacion").getAsInt());
        personaAcudienteModel.setsIden(acudienteObject.get("numIden").getAsString());
        personaAcudienteModel.setsFecExp(acudienteObject.get("fechExp").getAsString());
        personaAcudienteModel.setsGenero(generoAcudienteJsonObject.get("iIdGenero").getAsString());
        personaAcudienteModel.setsNombre(acudienteObject.get("priNombre").getAsString()+" "+acudienteObject.get("segNombre").getAsString());
        personaAcudienteModel.setsApellido(acudienteObject.get("priApellido").getAsString()+" "+acudienteObject.get("segApellido").getAsString());
           
        
        acudienteModel = new AcudienteModel();
        acudienteModel.setiCodAcudiente(acudienteObject.get("numIden").getAsInt());
        acudienteModel.setsPaisResidencia(acudienteObject.get("paisRes").getAsString());
        acudienteModel.setsCiudadResidencia(acudienteObject.get("ciudRes").getAsString());
        acudienteModel.setsDepartamento(acudienteObject.get("depRes").getAsString());
        acudienteModel.setsTrabajaActual(acudienteObject.get("tipTrabajo").getAsString());
        acudienteModel.setsTiempoTrabajando(acudienteObject.get("tiempoTrabajo").getAsString());
        acudienteModel.setsNombreEmpresa(acudienteObject.get("nomEmpresa").getAsString());
        acudienteModel.setsTipoContrato(acudienteObject.get("tipContrato").getAsString());
        acudienteModel.setsOcupacion(acudienteObject.get("ocupacion").getAsString());
        acudienteModel.setsTipoVivienda(acudienteObject.get("tipVivienda").getAsString());
        acudienteModel.setdSalario(acudienteObject.get("salario").getAsDouble());
        acudienteModel.setsVehiculo(acudienteObject.get("vehiculo").getAsString());
        acudienteModel.setdIngArrendamiento(acudienteObject.get("IngresosArr").getAsDouble());
        acudienteModel.setdIngPension(acudienteObject.get("ingresosPension").getAsDouble());
        acudienteModel.setdOtrosIngresos1(acudienteObject.get("otrosIngresos").getAsDouble());
        acudienteModel.setsNombreOtrosIngresos(acudienteObject.get("nombreIngresos").getAsString());
        acudienteModel.setsTarjetaCredito(acudienteObject.get("nomTarjeta").getAsString());
        acudienteModel.setsCreditoActual(acudienteObject.get("nomCredito").getAsString());
        acudienteModel.setdValorObligaciones(acudienteObject.get("valorObli").getAsDouble());
        acudienteModel.setsMedioEdupol(MedioMasivoJsonObject.get("iIdMediosMasivos").getAsString());
        
                      
        telefonoAcudiente = new TelefonosModel();
        telefonoAcudiente.setsTipoTel("1");
        telefonoAcudiente.setsNumero(acudienteObject.get("telFij").getAsString());
        telefonoAcudiente.setsIdPersona(acudienteObject.get("numIden").getAsString());
        
        telefonoMovilAcudeienteModel = new  TelefonosModel();
        telefonoMovilAcudeienteModel.setsTipoTel(acudienteObject.get("telMovil").getAsString());
        telefonoMovilAcudeienteModel.setsIdPersona(acudienteObject.get("numIden").getAsString());
        
        direccionesAcudienteModel = new DireccionesModel();
        direccionesAcudienteModel.setsTipoDir("2");
        direccionesAcudienteModel.setsDireccion(acudienteObject.get("dirRes").getAsString());
        direccionesAcudienteModel.setsCliente(acudienteObject.get("numIden").getAsString());
        
        direccionesAcudienteModel = new DireccionesModel();
        direccionesAcudienteModel.setsTipoDir("3");
        direccionesAcudienteModel.setsDireccion(acudienteObject.get("email").getAsString());
        direccionesAcudienteModel.setsCliente(acudienteObject.get("numIden").getAsString());
        
        try {
                String GuardarPersonaEstu = personasDAO.insert(personaEstudianteModel);
                String GuardarEstudiante = estudianteDAO.insert(estudianteModel);
                String GuardarPersonaAcudiente = personasDAO.insert(personaAcudienteModel);
                String GuardarAcudiente=acudienteDAO.insert(acudienteModel);
                String GuardarTelMovil = telefonosDAO.insert(telefonoMovilEstModel);
                String GuardarTel=telefonosDAO.insert(telefonoEstModel);
                String GuardarDir=direccionesDAO.insert(direccionesModel);
                
         } catch (Exception e) {
            System.out.println("Error durante actualizacion de datos: " + e);
        }
        return resultado;
    }
     
     public ListasGeneralesModel obtenerDependenciasUniversidades(JsonObject id){
         JsonObject idUniObject;
         JsonObject idNivelForObject;
         JsonObject idGrupoProgramaObject;
         JsonObject idProgramasObject;
         List<NivelFormacionModel>listNivelFormacionModel;
         List<NivelEstudiosModel>listNivelEstudiosModels;
         List<GrupoProgramasModel>listGrupoProgramasModels;
         List<ProgramasModel>listProgramasModels;
         List<Object> lisObjects= new ArrayList<>();
         listasGeneralesModel = new ListasGeneralesModel();
         try {
             switch(id.get("indiceUni").getAsInt()){
             
             case 1:
                 nivelFormacionDAO = new NivelFormacionDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 listNivelFormacionModel = nivelFormacionDAO.findAll((Object)idUniObject.get("iCodUniversidad").getAsString());
                 listasGeneralesModel.setListNivelFormacionModels(listNivelFormacionModel);
                 break;
             case 2:
                 nivelEstudiosDAO = new NivelEstudiosDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 idNivelForObject=id.get("NivelFormacion").getAsJsonObject();
                 lisObjects.add(idUniObject.get("iCodUniversidad").getAsInt());
                 lisObjects.add(idNivelForObject.get("iCod_NivelFormacion").getAsInt());
                 listNivelEstudiosModels=nivelEstudiosDAO.queryAll(lisObjects);
                 listasGeneralesModel.setLisNivelEstudiosModels(listNivelEstudiosModels);
                break;
             case 3:
                 grupoProgramaDAO = new GrupoProgramasDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 idNivelForObject=id.get("NivelFormacion").getAsJsonObject();
                 idGrupoProgramaObject=id.get("tipEstudio").getAsJsonObject();
                 lisObjects.add(idUniObject.get("iCodUniversidad").getAsInt());
                 lisObjects.add(idNivelForObject.get("iCod_NivelFormacion").getAsInt());
                 lisObjects.add(idGrupoProgramaObject.get("sCodigo").getAsInt());
                 listGrupoProgramasModels=grupoProgramaDAO.queryAll(lisObjects);
                 listasGeneralesModel.setListGrupoProgramasModels(listGrupoProgramasModels);
                 break;
                 
             case 4:
                 programasDAO= new ProgramasDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 idNivelForObject=id.get("NivelFormacion").getAsJsonObject();
                 idGrupoProgramaObject=id.get("tipEstudio").getAsJsonObject();
                 idProgramasObject=id.get("GrupoProgramaAcademico").getAsJsonObject();
                 lisObjects.add(idUniObject.get("iCodUniversidad").getAsInt());
                 lisObjects.add(idNivelForObject.get("iCod_NivelFormacion").getAsInt());
                 lisObjects.add(idGrupoProgramaObject.get("sCodigo").getAsInt());
                 lisObjects.add(idProgramasObject.get("iIdGrupo").getAsInt());
                 listProgramasModels=programasDAO.queryAll(lisObjects);
                 listasGeneralesModel.setListProgramasModels(listProgramasModels);        
         }
             
         } catch (Exception e) {
             System.out.println("error"+e);
         }
           return listasGeneralesModel;
     }
   
     public ListasGeneralesModel dependenciasPais(JsonObject object){
         List<Object> lisObjects= new ArrayList<>();
         listasGeneralesModel = new ListasGeneralesModel();
         if(object.get("indice").getAsInt()==3){
             centroAsociadoDAO = new CentroAsociadoDAO();
             lisObjects.add(object.get("sCodigo").getAsInt());
             listasGeneralesModel.setListCentroAsociadoModels(centroAsociadoDAO.queryAll(lisObjects));
         
         }else{
             ciudadesDAO = new CiudadesDAO();
             lisObjects.add(object.get("sCodigo").getAsInt());
             listasGeneralesModel.setLisCiudadModels(ciudadesDAO.queryAll(lisObjects));             
         }
         return listasGeneralesModel;
     }
}
