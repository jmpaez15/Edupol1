

package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.CiudadesDAO;
import com.ethos.DAO.EstudiantesDAO;
import com.ethos.DAO.GrupoProgramasDAO;
import com.ethos.DAO.NivelEstudiosDAO;
import com.ethos.DAO.NivelFormacionDAO;
import com.ethos.DAO.PersonasDAO;
import com.ethos.DAO.ProfesionesDAO;
import com.ethos.DAO.ProgramasDAO;
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
    
    PersonaModel personaEstudianteModel;
    EstudianteModel estudianteModel;
    TelefonosModel telefonoMovilEstModel;
    TelefonosModel telefonoEstModel;
    DireccionesModel direccionesModel;
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

        estudianteDAO = new EstudiantesDAO();
        personasDAO = new PersonasDAO();                
      //  acudienteDAO = new TelefonosDAO();
        

        estudianteModel = new EstudianteModel();
        personaEstudianteModel = new PersonaModel();
      //  telefonoModel = new TelefonosModel();
      //  direccionesModel = new DireccionesModel();
        
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
               
        direccionesModel.setsTipoDir("2");
        direccionesModel.setsCliente(estudianteJObject.get("NumIdentificacion").getAsString());
        direccionesModel.setsDireccion(estadoCivilJsonObject.get("dirRes").getAsString());
        
        telefonoMovilEstModel.setsTipoTel("2");
        telefonoMovilEstModel.setsIdPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        telefonoMovilEstModel.setsNumero(estudianteJObject.get("telMovil").getAsString());
        
        telefonoEstModel.setsTipoTel("1");
        telefonoEstModel.setsIdPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        telefonoEstModel.setsNumero(estudianteJObject.get("tel").getAsString());
        try {
                String GuardarPersonaEstu = personasDAO.insert(personaEstudianteModel);
                String GuardarEstudiante = estudianteDAO.insert(estudianteModel);
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
         listasGeneralesModel = new ListasGeneralesModel();
         ciudadesDAO = new CiudadesDAO();
         List<Object> lisObjects= new ArrayList<>();
         lisObjects.add(object.get("sCodigo").getAsInt());
         listasGeneralesModel.setLisCiudadModels(ciudadesDAO.queryAll(lisObjects));
         return listasGeneralesModel;
     }
}
