/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

/**
 *
 * @author Operaciones-GerenteC
 */
public class TipoTrabajoModel {
    private int iCodTipoTrabajo;
    private String sDescripcion;

    public TipoTrabajoModel() {
    }

    public TipoTrabajoModel(int iCodTipoTrabajo, String sDescripcion) {
        this.iCodTipoTrabajo = iCodTipoTrabajo;
        this.sDescripcion = sDescripcion;
    }

    public int getiCodTipoTrabajo() {
        return iCodTipoTrabajo;
    }

    public void setiCodTipoTrabajo(int iCodTipoTrabajo) {
        this.iCodTipoTrabajo = iCodTipoTrabajo;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
    
    
    
}
