/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.query;

/**
 *
 * @author operaciones
 */
public class DireccionesQuery {

    public static final String queryDatosUpdate = "UPDATE DIRECCIONES"
            + " SET C_DIRECCION = ?,"
            + "	I_CIUDAD = ?,"
            + "	C_BARRIO = ?"
            + " WHERE I_CLIENTE = ?"
            + " AND I_TIPO_DIR = ?;";
}
