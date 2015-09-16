





package com.ethos.query;

/**
 *
 * @author Mary
 */


public class GeneralQuery {
    
    public static final String QUERY_GETTIPOSOLICITUD="SELECT * FROM TIPO_SOLICITUD";
    public static final String QUERY_GET_GENERO="SELECT * FROM GENERO";
    public static final String QUERY_GET_CATEGORIA_GENERO=("SELECT * FROM CATEGORIA_SISBEN");
    public static final String QUERY_GETTIPO_IDENTIFICACON="SELECT * FROM tipos_iden ORDER BY I_CODIGO ASC";
    public static final String QUERY_MEDIOS_MASIVOS="SELECT * FROM MEDIOS_MASIVOS";
    public static final String QUERY_PROFESIONES="SELECT i_codigo,c_descripcion FROM PROFESIONES";
    public static final String QUERY_GET_CIUDADES= "SELECT I_CODIGO,C_NOMBRE FROM CIUDADES WHERE I_NIVEL=1 ORDER BY C_NOMBRE ASC";
    public static final String QUERY_GET_TIPO_SANGUINEO="SELECT* FROM  GRUPOS_SANGUINEO;";
    public static final String QUERY_GET_DEPENDENCIAS_CIUDADES="SELECT I_CODIGO,C_NOMBRE FROM CIUDADES where I_UBICACION=? ORDER BY C_NOMBRE ASC;";
    public static final String QUERY_GET_CENTRO_ASOCIADOS="SELECT I_CODIGO,C_NOMBRES\n" +
                                                          "FROM PERSONAS where I_TIPO_CLIENTE=7 and I_CIUDAD_RES=? ORDER BY  I_CODIGO ASC";
    public static final String QUERY_GET_COMUNIDAD="SELECT*FROM COMUNIDAD";
}
