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
public class EstudiantesQuery {
    
    public static final String GUARDAR_DATOS_ESTUDIANTE="INSERT INTO Edupol.dbo.ESTUDIANTES\n" +
       "(ID_ESTUDIANTE, "
       + "ID_CATEGORIA_SISBEN,"
       + " NACIONALIDAD, "
       + "ID_PAIS_RES,"
       + " ID_DEPARTAMENTO_RES, "
       + "ID_CIUDAD_RES,"
       + " ID_LOCALIDAD_RES, "
       + "ID_BARRIO_RES,"
       + " GRUPO_SANGUINEO, "
       + "NUM_LIBRETA, "
       + "FOTOGRAFIA, "
       + "ID_ACUDIENTE,"
       + " ID_PAIS_ESTUDIO,"
       + " ID_DEPARTAMENTO_ESTUDIO, "
       + "ID_CIUDAD_ESTUDIO,"
       + " ESTRATO)\n" +
       "VALUES \n" +
       "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
}
