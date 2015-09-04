/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.TelefonosModel;
import com.ethos.query.TelefonosQuery;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class TelefonosDAO extends AbstractDAO<TelefonosModel>{
    
    private String tipoConn;
    private TelefonosModel telefonosModel;
    private TelefonosQuery telefonosQuery;

    public TelefonosDAO() {
        super(TelefonosModel.class);
    }

    @Override
    public TelefonosModel select(Object id) {
        return null;
    }

    @Override
    public String insert(TelefonosModel entityClass) {
        return "";
    }

    @Override
    public boolean update(TelefonosModel entityClass) {
        String query;
        boolean resultado=false;
        int update=0;
        try {
            conn = getConnectionDB().getConnection();
            query=TelefonosQuery.queryDatosUpdate;
            
            psQuery = conn.prepareStatement(query);
            psQuery.setString(1, entityClass.getsCiudad());
            psQuery.setString(2, entityClass.getsNumero());
            psQuery.setString(3, entityClass.getsIdPersona());
            psQuery.setString(4, entityClass.getsTipoTel());
            update = psQuery.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        if(update > 0){
            resultado = true;
        }else{
            System.out.println("¡La tabla Telefonos no fue actualizada!");
        }
        return resultado;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<TelefonosModel> findAll() {
        return null;
    }

    @Override
    public List<TelefonosModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TelefonosModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
