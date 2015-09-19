/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.TipoTrabajoModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Operaciones-GerenteC
 */
public class TipoTrabajoDAO extends AbstractDAO<TipoTrabajoModel>{
    
    TipoTrabajoModel tipoTrabajoModel;
    
    public TipoTrabajoDAO (){
        super(TipoTrabajoModel.class);
    }

    @Override
    public TipoTrabajoModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(TipoTrabajoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TipoTrabajoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoTrabajoModel> findAll() {
       String query;
        List<TipoTrabajoModel> tipoTrabajoList = new ArrayList<>();
        try {
            conn = getConnectionDB().getConnection();
            query = GeneralQuery.QUERY_GET_TIPO_TRABAJO;
            psQuery = conn.prepareStatement(query);
            
            rsT = psQuery.executeQuery();
            
            while (rsT.next()) {
                tipoTrabajoModel = new TipoTrabajoModel();
                tipoTrabajoModel.setiCodTipoTrabajo(rsT.getInt(1));
                tipoTrabajoModel.setsDescripcion(rsT.getString(2));
                tipoTrabajoList.add(tipoTrabajoModel);
            }
        } catch (SQLException ex) {
            System.out.println("exception " + ex);
        } finally {
            closeConnection();
        }
        return tipoTrabajoList;
    }

    @Override
    public List<TipoTrabajoModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoTrabajoModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
