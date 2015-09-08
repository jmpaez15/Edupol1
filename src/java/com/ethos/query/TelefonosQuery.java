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
public class TelefonosQuery {

    public static final String queryDatosUpdate = "UPDATE TELEFONOS"
            + " SET I_CIUDAD = ?,"
            + "	C_NUMERO = ?"
            + " WHERE I_CLIENTE = ?"
            + " AND I_TIPO_TEL = ?;";
}
