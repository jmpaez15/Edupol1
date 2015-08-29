/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.CiudadesDAO;
import com.ethos.DAO.EstadoCivilDAO;
import com.ethos.DAO.NivelEstudiosDAO;
import com.ethos.model.ActualizaModel;
import com.ethos.model.CiudadModel;
import com.ethos.model.DireccionesModel;
import com.ethos.model.EstadoCivilModel;
import com.ethos.model.NivelEstudiosModel;
import com.ethos.model.TelefonosModel;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class FuncionesGenerales {
    
    
    
    AbstractDAO ciudadesDao;
    AbstractDAO estadoCivilDao;
    AbstractDAO nivelEstudiosDao;
    AbstractDAO tipoSolicitud;
    AbstractDAO tipoIdentificacion;
    
    
    TelefonosModel telefonoModel;
    ActualizaModel actualizaModel;
    DireccionesModel direccionesModel;

    public FuncionesGenerales() {
    }

    /**
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     *
     * @description Metodo utilizado para leer los datos desde un objeto tipo
     * JSON
     * @param jsonRq
     * @return JsonObject
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     */
    public JsonObject recibirDatos(BufferedReader jsonRq) {

        StringBuilder sb = new StringBuilder();
        JsonObject jObjData = new JsonObject();
        String line;
        JsonElement jelement;
        try {
            
            while ((line = jsonRq.readLine()) != null) {
                sb.append(line);
                jelement = new JsonParser().parse(sb.toString());
                jObjData = (JsonObject) jelement.getAsJsonObject();
            }
        } catch (IOException | JsonSyntaxException e) {
            e.printStackTrace();
        }
        return jObjData;
    }

    public String encripta(String sPalabra, boolean bTipo) {
        String sAlfabeto = "abcdefghijklmnÃopqrstuvwxyz 1234567890()";
        String sPalClave = "ethos simco plus 7";
        sPalClave = "ethos imcplus7";
        sPalClave = "ethos imcplu(7abdfgjknÃqrvwxyz)123456890";
        String sPalEncrip = "";
        if (!bTipo) //desencriptar
        {
            sPalEncrip = sAlfabeto;
            sAlfabeto = sPalClave;
            sPalClave = sPalEncrip;
        }
        int iLargo = sPalabra.length();
        sPalEncrip = "";
        int iPos = 0;
        int iPosEnc = 0;
        String sLetra = "";
        while (iPos < iLargo) {
            sLetra = sPalabra.substring(iPos, iPos + 1);
            iPosEnc = sPalClave.indexOf(sLetra);
            if (iPosEnc < 0 || sLetra.compareToIgnoreCase("%") == 0 || sLetra.compareToIgnoreCase("_") == 0) {
                sPalEncrip += sLetra;
            } else {
                sPalEncrip += sAlfabeto.substring(iPosEnc, iPosEnc + 1);
            }
            iPos++;
        }
        return sPalEncrip;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
   
     public ActualizaModel obtenerDatosActualizar(String idPersona) {

        List<CiudadModel> listCiudades;
        List<EstadoCivilModel> listEstadoCivil;
        List<NivelEstudiosModel> listNivelEstudio;
       

        
        ciudadesDao = new CiudadesDAO();
        estadoCivilDao = new EstadoCivilDAO();
        nivelEstudiosDao = new NivelEstudiosDAO();
        actualizaModel = new ActualizaModel();
        listCiudades = ciudadesDao.findAll();
        listEstadoCivil = estadoCivilDao.findAll();
        listNivelEstudio = nivelEstudiosDao.findAll();


        
        actualizaModel.setListCiudadModel(listCiudades);
        actualizaModel.setListEstadoCivilModel(listEstadoCivil);
        actualizaModel.setListNivelEstudiosModel(listNivelEstudio);
        return actualizaModel;
    }
}
