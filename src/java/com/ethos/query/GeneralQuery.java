





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
}
