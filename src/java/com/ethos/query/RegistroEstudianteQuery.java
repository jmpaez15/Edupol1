/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.query;

/**
 *
 * @author Operaciones-GerenteC
 */
public class RegistroEstudianteQuery {
    
    public static final String QUERY_GUARDAR_REGISTRO="INSERT INTO Edupol.dbo.REGISTRO_ESTUDIANTE (ID_REGISTO, ID_ESTUDIANTE, ID_UNIVERSIDAD_PROGRAMA, ID_CENTRO_ASOCIADO, ID_ESTADO_REGISTRO, FECHA_INSCRIPCION) VALUES (?,?,?,?,?,convert(datetime,?))"; 
    public static final String QUERY_ULTIMO_CODIGO="select max(id_registo)from REGISTRO_ESTUDIANTE";
}
