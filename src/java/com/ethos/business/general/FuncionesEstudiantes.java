

package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.EstudiantesDAO;
import com.ethos.DAO.PersonasDAO;
import com.ethos.model.EstudianteModel;
import com.ethos.model.PersonaModel;
import com.ethos.model.TelefonosModel;
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Mary
 */


public class FuncionesEstudiantes {
    
    AbstractDAO estudianteDAO;
    AbstractDAO acudienteDAO;
    AbstractDAO personasDAO;
    
    PersonaModel personaEstudianteModel;
    EstudianteModel estudianteModel;
    TelefonosModel telefonoModel;
     
    
    
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
        SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy/MM/dd");

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
        
                
        
        
        
                
        
        estudianteModel.setiCodigoEst(estudianteJObject.get("NumIdentificacion").getAsInt());
        personaEstudianteModel.setsCodPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        estudianteModel.setiTipoSolicitud(tipoSolJObject.get("iId_tipoSolicitud").getAsInt());
        estudianteModel.setiNivelEducativo(nivelEducativoObject.get("sCodigo").getAsInt());
        estudianteModel.setiNacionalidad(nacionalidadObject.get("sCodigo").getAsInt());
        estudianteModel.setsCiudadNacimiento(estudianteJObject.get("ciudadNacimiento").getAsString());
        estudianteModel.setsLugarNacimiento(estudianteJObject.get("lugarNacimiento").getAsString());
         try {
             personaEstudianteModel.setdFechaNacimiento((Date)formatoFecha.parse(estudianteJObject.get("FechaNac").getAsString()));
             personaEstudianteModel.setdFechaExpedicion((Date)formatoFecha.parse(estudianteJObject.get("fechaExp").getAsString()));
         } catch (Exception e) {
             System.out.println("date " +e);
         }
 
        personaEstudianteModel.setiTipoIden(tipoIdenJsonObject.get("iId_Identificacion").getAsInt());
        personaEstudianteModel.setsIden(estudianteJObject.get("NumIdentificacion").getAsString());
        estudianteModel.setsLugarExpedicion(estudianteJObject.get("LugarExp").getAsString());
        
        personaEstudianteModel.setsNombre(estudianteJObject.get("PriNombre").getAsString()+" "+estudianteJObject.get("segNombre").getAsString());
        personaEstudianteModel.setsApellido(estudianteJObject.get("PriApellido").getAsString()+" "+estudianteJObject.get("SegApellido").getAsString());
        personaEstudianteModel.setsGenero(generoJsonObject.get("sInicial").getAsString());
        estudianteModel.setiCategoriaSisben(categoriaSisbenJsonObject.get("iIdCategoriaSisben").getAsInt());
        estudianteModel.setiPaisResidencia(paisResJsonObject.get("sCodigo").getAsInt());
        //estudianteModel.setiDepartamentoResidencia(departamentoResJsonObject.get("sCodigo").getAsInt());
        //estudianteModel.setiCiudadResidencia(ciudadResJsonObject.get("sCodigo").getAsInt());
       // estudianteModel.setsLocalidadResidencia(estudianteJObject.get("ocRes").getAsString());
        //estudianteModel.setsBarrioResidencia(estudianteJObject.get("BarrioRes").getAsString());
        //estudianteModel.setsDireccionResidencia(estudianteJObject.get("dirRes").getAsString());
        //estudianteModel.setiLibretaMilitar(estudianteJObject.get("LibretaMilitar").getAsInt());
        personaEstudianteModel.setsCodEstadoCivil(estadoCivilJsonObject.get("sCodigoEstadoCivil").getAsString());
        estudianteModel.setiGrupoSaniguineo(grupoSanquineoJsonObject.get("iCodigoTipoSangre").getAsInt());
    /*   rsonaModel.setsCorreoPer(persona.get("sCorreoPer").getAsString());
        personaModel.setSCorreoCor(persona.get("sCorreoCor").getAsString());
        personaModel.setiTipoActEcon(persona.get("iTipoActEcon").getAsInt());
        personaModel.setiNumPeraCargo(persona.get("iNumPeraCargo").getAsInt());
       personaModel.setSCodCiudadRes(persona.get("sCodCiudadRes").getAsString());
        personaModel.setsCodCiudadNac(persona.get("sCodCiudadNac").getAsString());
        personaModel.setsNomCiudadNc(persona.get("sNomCiudadNac").getAsString());
        personaModel.setsCodCiudadExp(persona.get("sCodCiudadExp").getAsString());
        personaModel.setsNomCiudadExp(persona.get("sNomCiudadExp").getAsString());
        personaModel.setsCodEstadoCivil(persona.get("sCodEstadoCivil").getAsString());

        
       
        

        personaModel.setiNivelEst(nivelEstudioJObject.get("sCodigo").getAsInt());
        personaModel.setsCodCiudadRes(ciudadJObject.get("sCodigo").getAsString());
        personaModel.setsCodEstadoCivil(estadoCivilJObject.get("sCodigoEstadoCivil").getAsString());

        telefonoModel.setsTipoTel("2");
        telefonoModel.setsIdPersona(id);
        telefonoModel.setsNumero(persona.get("sTelOfi").getAsString());
        telefonoModel.setsCiudad(ciudadJObject.get("sCodigo").getAsString());

        direccionesModel.setsCliente(id);
        direccionesModel.setsTipoDir("6");
        direccionesModel.setsBarrio("");
        direccionesModel.setsDireccion(persona.get("sCorreoCor").getAsString());
        direccionesModel.setsCiudad(ciudadJObject.get("sCodigo").getAsString());
        
//        direccionesModel.setsCliente(id);
//        direccionesModel.setsTipoDir("1");
//        direccionesModel.setsBarrio(persona.get("sBarrioOfi").getAsString());
//        direccionesModel.setsDireccion(persona.get("sDirOfi").getAsString());
//        direccionesModel.setsCiudad(ciudadJObject.get("sCodigo").getAsString());*/

        try {
            String Guardar = personasDAO.insert(personaEstudianteModel);
          
        } catch (Exception e) {
            System.out.println("Error durante actualizacion de datos: " + e);
        }
        return resultado;
    }
    
}
