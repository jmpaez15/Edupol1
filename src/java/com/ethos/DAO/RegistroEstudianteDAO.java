/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.RegistroEstudianteModel;
import com.ethos.query.RegistroEstudianteQuery;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Operaciones-GerenteC
 */
public class RegistroEstudianteDAO extends AbstractDAO<RegistroEstudianteModel>{
    RegistroEstudianteModel registroEstudianteModel;
    
    public RegistroEstudianteDAO(){
        super(RegistroEstudianteModel.class);
    }

    @Override
    public RegistroEstudianteModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(RegistroEstudianteModel entityClass) {
        String query;
        String resultado="NOK";
        int idRegistro=1;
        int rs=0;
        try {
            conn=getConnectionDB().getConnection();
            psQuery=conn.prepareStatement(RegistroEstudianteQuery.QUERY_ULTIMO_CODIGO);
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                idRegistro+=rsT.getInt(1);
            }
            psQuery=null;
            query=RegistroEstudianteQuery.QUERY_GUARDAR_REGISTRO;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1, idRegistro);
            psQuery.setInt(2, entityClass.getiCodEstudiente());
            psQuery.setInt(3, entityClass.getiCodUniversidadPrograma());
            psQuery.setInt(4, entityClass.getiCodCentroAsociado());
            psQuery.setInt(5, entityClass.getiEstadoRegistro());
            psQuery.setString(6, entityClass.getFechaIncripcion());
            rs=psQuery.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }finally{
            closeConnection();
        }
        if(rs>0){
            resultado="OK";
        }
        
        return resultado;
    }

    @Override
    public boolean update(RegistroEstudianteModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistroEstudianteModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistroEstudianteModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistroEstudianteModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
