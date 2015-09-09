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
public class RegistroEstudianteModel {
    private int iCodRegistro;
    private int iCodEstudiente;
    private int iCodUniversidadPrograma;
    private int iCodCentroAsociado;
    private int iEstadoRegistro;
    private String FechaIncripcion;

    public RegistroEstudianteModel() {
    }

    public RegistroEstudianteModel(int iCodRegistro, int iCodEstudiente, int iCodUniversidadPrograma, int iCodCentroAsociado, int iEstadoRegistro, String FechaIncripcion) {
        this.iCodRegistro = iCodRegistro;
        this.iCodEstudiente = iCodEstudiente;
        this.iCodUniversidadPrograma = iCodUniversidadPrograma;
        this.iCodCentroAsociado = iCodCentroAsociado;
        this.iEstadoRegistro = iEstadoRegistro;
        this.FechaIncripcion = FechaIncripcion;
    }

    public int getiCodRegistro() {
        return iCodRegistro;
    }

    public void setiCodRegistro(int iCodRegistro) {
        this.iCodRegistro = iCodRegistro;
    }

    public int getiCodEstudiente() {
        return iCodEstudiente;
    }

    public void setiCodEstudiente(int iCodEstudiente) {
        this.iCodEstudiente = iCodEstudiente;
    }

    public int getiCodUniversidadPrograma() {
        return iCodUniversidadPrograma;
    }

    public void setiCodUniversidadPrograma(int iCodUniversidadPrograma) {
        this.iCodUniversidadPrograma = iCodUniversidadPrograma;
    }

    public int getiCodCentroAsociado() {
        return iCodCentroAsociado;
    }

    public void setiCodCentroAsociado(int iCodCentroAsociado) {
        this.iCodCentroAsociado = iCodCentroAsociado;
    }

    public int getiEstadoRegistro() {
        return iEstadoRegistro;
    }

    public void setiEstadoRegistro(int iEstadoRegistro) {
        this.iEstadoRegistro = iEstadoRegistro;
    }

    public String getFechaIncripcion() {
        return FechaIncripcion;
    }

    public void setFechaIncripcion(String FechaIncripcion) {
        this.FechaIncripcion = FechaIncripcion;
    }
    
    
    
}
