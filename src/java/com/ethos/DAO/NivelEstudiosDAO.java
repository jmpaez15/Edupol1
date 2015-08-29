/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.NivelEstudiosModel;
import com.ethos.query.NivelEstudiosQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class NivelEstudiosDAO extends AbstractDAO<NivelEstudiosModel>{

    NivelEstudiosModel nivelEstudiosModel;
    
    public NivelEstudiosDAO() {
        super(NivelEstudiosModel.class);
    }

    @Override
    public NivelEstudiosModel select(Object id) {
        return null;
    }

    @Override
    public String insert(NivelEstudiosModel entityClass) {
        return "";
    }

    @Override
    public boolean update(NivelEstudiosModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<NivelEstudiosModel> findAll() {
        String query;
        List<NivelEstudiosModel> nivelEstudiosList = new ArrayList<>();

        try {
            conn = getConnectionDB().getConnection();
            query=NivelEstudiosQuery.queryGetNivelEstudio;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();

            while (rsT.next()) {

                nivelEstudiosModel = new NivelEstudiosModel();
                nivelEstudiosModel.setsCodigo(rsT.getString(1));
                nivelEstudiosModel.setsDescripcion(rsT.getString(2));
                nivelEstudiosList.add(nivelEstudiosModel);
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return nivelEstudiosList;
    }

    @Override
    public List<NivelEstudiosModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
