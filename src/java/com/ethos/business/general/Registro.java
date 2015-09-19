/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.IcfesDAO;
import com.ethos.DAO.RegistroEstudianteDAO;
import com.ethos.model.IcfesModel;
import com.ethos.model.RegistroEstudianteModel;
import com.google.gson.JsonObject;

/**
 *
 * @author Operaciones-GerenteC
 */
public class Registro {

    AbstractDAO AcudienteDAO;
    AbstractDAO telefonoDAO;
    AbstractDAO dirreccionDAO;
    AbstractDAO personaDAO;
    AbstractDAO referencias;

    public String guardarCodeudor(JsonObject codeudor) {
        String respuesta = "NOK";
        JsonObject tipoIndetificacionJsonObject;
        JsonObject paisResidenciaJsonObject;
        JsonObject depResidenciaJsonObject;
        JsonObject ciudadResidenciaJsonObject;
        JsonObject paisNacimientoJsonObject;
        JsonObject depNacimientoJsonObject;
        JsonObject ciudadNacimientoJsonObject;
        JsonObject generoJsonObject;
        JsonObject estadoCivilJsonObject;
        JsonObject tipoTrabajoJsonObject;
        JsonObject estudiosRealizadosJsonObject;

        tipoIndetificacionJsonObject = codeudor.get(respuesta).getAsJsonObject();
        paisResidenciaJsonObject = codeudor.get(respuesta).getAsJsonObject();
        paisNacimientoJsonObject = codeudor.get(respuesta).getAsJsonObject();
        depNacimientoJsonObject = codeudor.get(respuesta).getAsJsonObject();
        ciudadNacimientoJsonObject = codeudor.get(respuesta).getAsJsonObject();
        generoJsonObject = codeudor.get(respuesta).getAsJsonObject();
        estadoCivilJsonObject = codeudor.get(respuesta).getAsJsonObject();
        tipoTrabajoJsonObject = codeudor.get(respuesta).getAsJsonObject();
        estudiosRealizadosJsonObject = codeudor.get(respuesta).getAsJsonObject();
        paisResidenciaJsonObject = codeudor.get(respuesta).getAsJsonObject();

        return respuesta;
    }

    public IcfesModel getIcfes(String idPerson) {

        AbstractDAO icfesDAO = new IcfesDAO();
        IcfesModel icfesModel = (IcfesModel) icfesDAO.select(idPerson);
        
        return icfesModel;
    }
}
