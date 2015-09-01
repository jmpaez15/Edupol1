/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

import java.util.Date;

/**
 *
 * @author operaciones
 */
public class EstudianteModel {

   
    private int iCodigoEst;
    private int iTipoSolicitud;

    String sTipoRol;
    String sTipoPersona; 
    private int iTipoIdentificacion;
    private int iNumeroIdentificacion;
    String sPaisExpedicion;
    String sLugarExpedicion;
    private Date dFechaExpedicion;
    String sFechaExpedicion;
    String sPrimerNombre;
    String sSegundoNombre;
    String sPrimerApellido;
    String sSegundoApellido;
    private int iGenero;
    private int iCategoriaSisben;
    private int iNacionalidad;
    private int iPaisResidencia;
    private int iDepartamentoResidencia;
    private int  iCiudadResidencia;
    String sLocalidadResidencia;
    String sDireccionResidencia;
    String sBarrioResidencia;
    private Date dFechaNacimiento;
    String sFechaNacimiento;
    private String sLugarNacimiento;
    private String sCiudadNacimiento;
    private int iGrupoSaniguineo;
    Date dFechaInscripcion;
    String sFechaInscripcion; //Fecha de inscripcion o de actualizacion de datos
    String sEstadoCivil;
    private int iLibretaMilitar;
    String sNumeroLibretaMilitar;
    private int iNivelEducativo;

    public EstudianteModel() {
    }

    public EstudianteModel(int iTipoSolicitud, String sTipoRol, String sTipoPersona, int iTipoIdentificacion, int iNumeroIdentificacion, String sPaisExpedicion, String sLugarExpedicion, Date dFechaExpedicion, String sFechaExpedicion, String sPrimerNombre, String sSegundoNombre, String sPrimerApellido, String sSegundoApellido, int iGenero, int iCategoriaSisben, int iNacionalidad, int iPaisResidencia, int iDepartamentoResidencia, int iCiudadResidencia, String sLocalidadResidencia, String sDireccionResidencia, String sBarrioResidencia, Date dFechaNacimiento, String sFechaNacimiento, String sLugarNacimiento, String sCiudadNacimiento, int iGrupoSaniguineo, Date dFechaInscripcion, String sFechaInscripcion, String sEstadoCivil, int iLibretaMilitar, String sNumeroLibretaMilitar, int iNivelEducativo) {
        this.iTipoSolicitud = iTipoSolicitud;
        this.sTipoRol = sTipoRol;
        this.sTipoPersona = sTipoPersona;
        this.iTipoIdentificacion = iTipoIdentificacion;
        this.iNumeroIdentificacion = iNumeroIdentificacion;
        this.sPaisExpedicion = sPaisExpedicion;
        this.sLugarExpedicion = sLugarExpedicion;
        this.dFechaExpedicion = dFechaExpedicion;
        this.sFechaExpedicion = sFechaExpedicion;
        this.sPrimerNombre = sPrimerNombre;
        this.sSegundoNombre = sSegundoNombre;
        this.sPrimerApellido = sPrimerApellido;
        this.sSegundoApellido = sSegundoApellido;
        this.iGenero = iGenero;
        this.iCategoriaSisben = iCategoriaSisben;
        this.iNacionalidad = iNacionalidad;
        this.iPaisResidencia = iPaisResidencia;
        this.iDepartamentoResidencia = iDepartamentoResidencia;
        this.iCiudadResidencia = iCiudadResidencia;
        this.sLocalidadResidencia = sLocalidadResidencia;
        this.sDireccionResidencia = sDireccionResidencia;
        this.sBarrioResidencia = sBarrioResidencia;
        this.dFechaNacimiento = dFechaNacimiento;
        this.sFechaNacimiento = sFechaNacimiento;
        this.sLugarNacimiento = sLugarNacimiento;
        this.sCiudadNacimiento = sCiudadNacimiento;
        this.iGrupoSaniguineo = iGrupoSaniguineo;
        this.dFechaInscripcion = dFechaInscripcion;
        this.sFechaInscripcion = sFechaInscripcion;
        this.sEstadoCivil = sEstadoCivil;
        this.iLibretaMilitar = iLibretaMilitar;
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
        this.iNivelEducativo = iNivelEducativo;
    }

     public int getiCodigoEst() {
        return iCodigoEst;
    }

    public void setiCodigoEst(int iCodigoEst) {
        this.iCodigoEst = iCodigoEst;
    }
    
    public int getiTipoSolicitud() {
        return iTipoSolicitud;
    }

    public void setiTipoSolicitud(int iTipoSolicitud) {
        this.iTipoSolicitud = iTipoSolicitud;
    }

    public String getsTipoRol() {
        return sTipoRol;
    }

    public void setsTipoRol(String sTipoRol) {
        this.sTipoRol = sTipoRol;
    }

    public String getsTipoPersona() {
        return sTipoPersona;
    }

    public void setsTipoPersona(String sTipoPersona) {
        this.sTipoPersona = sTipoPersona;
    }

    public int getiTipoIdentificacion() {
        return iTipoIdentificacion;
    }

    public void setiTipoIdentificacion(int iTipoIdentificacion) {
        this.iTipoIdentificacion = iTipoIdentificacion;
    }

    public int getiNumeroIdentificacion() {
        return iNumeroIdentificacion;
    }

    public void setiNumeroIdentificacion(int iNumeroIdentificacion) {
        this.iNumeroIdentificacion = iNumeroIdentificacion;
    }

    public String getsPaisExpedicion() {
        return sPaisExpedicion;
    }

    public void setsPaisExpedicion(String sPaisExpedicion) {
        this.sPaisExpedicion = sPaisExpedicion;
    }

    public String getsLugarExpedicion() {
        return sLugarExpedicion;
    }

    public void setsLugarExpedicion(String sLugarExpedicion) {
        this.sLugarExpedicion = sLugarExpedicion;
    }

    public Date getdFechaExpedicion() {
        return dFechaExpedicion;
    }

    public void setdFechaExpedicion(Date dFechaExpedicion) {
        this.dFechaExpedicion = dFechaExpedicion;
    }

    public String getsFechaExpedicion() {
        return sFechaExpedicion;
    }

    public void setsFechaExpedicion(String sFechaExpedicion) {
        this.sFechaExpedicion = sFechaExpedicion;
    }

    public String getsPrimerNombre() {
        return sPrimerNombre;
    }

    public void setsPrimerNombre(String sPrimerNombre) {
        this.sPrimerNombre = sPrimerNombre;
    }

    public String getsSegundoNombre() {
        return sSegundoNombre;
    }

    public void setsSegundoNombre(String sSegundoNombre) {
        this.sSegundoNombre = sSegundoNombre;
    }

    public String getsPrimerApellido() {
        return sPrimerApellido;
    }

    public void setsPrimerApellido(String sPrimerApellido) {
        this.sPrimerApellido = sPrimerApellido;
    }

    public String getsSegundoApellido() {
        return sSegundoApellido;
    }

    public void setsSegundoApellido(String sSegundoApellido) {
        this.sSegundoApellido = sSegundoApellido;
    }

    public int getiGenero() {
        return iGenero;
    }

    public void setiGenero(int iGenero) {
        this.iGenero = iGenero;
    }

    public int getiCategoriaSisben() {
        return iCategoriaSisben;
    }

    public void setiCategoriaSisben(int iCategoriaSisben) {
        this.iCategoriaSisben = iCategoriaSisben;
    }

    public int getiNacionalidad() {
        return iNacionalidad;
    }

    public void setiNacionalidad(int iNacionalidad) {
        this.iNacionalidad = iNacionalidad; 
    }

    public int getiPaisResidencia() {
        return iPaisResidencia;
    }

    public void setiPaisResidencia(int iPaisResidencia) {
        this.iPaisResidencia = iPaisResidencia;
    }

    public int getiDepartamentoResidencia() {
        return iDepartamentoResidencia;
    }

    public void setiDepartamentoResidencia(int iDepartamentoResidencia) {
        this.iDepartamentoResidencia = iDepartamentoResidencia;
    }

    public int getiCiudadResidencia() {
        return iCiudadResidencia;
    }

    public void setiCiudadResidencia(int iCiudadResidencia) {
        this.iCiudadResidencia = iCiudadResidencia;
    }

    public String getsLocalidadResidencia() {
        return sLocalidadResidencia;
    }

    public void setsLocalidadResidencia(String sLocalidadResidencia) {
        this.sLocalidadResidencia = sLocalidadResidencia;
    }

    public String getsDireccionResidencia() {
        return sDireccionResidencia;
    }

    public void setsDireccionResidencia(String sDireccionResidencia) {
        this.sDireccionResidencia = sDireccionResidencia;
    }

    public String getsBarrioResidencia() {
        return sBarrioResidencia;
    }

    public void setsBarrioResidencia(String sBarrioResidencia) {
        this.sBarrioResidencia = sBarrioResidencia;
    }

    public Date getdFechaNacimiento() {
        return dFechaNacimiento;
    }

    public void setdFechaNacimiento(Date dFechaNacimiento) {
        this.dFechaNacimiento = dFechaNacimiento;
    }

    public String getsFechaNacimiento() {
        return sFechaNacimiento;
    }

    public void setsFechaNacimiento(String sFechaNacimiento) {
        this.sFechaNacimiento = sFechaNacimiento;
    }

    public String getsLugarNacimiento() {
        return sLugarNacimiento;
    }

    public void setsLugarNacimiento(String sLugarNacimiento) {
        this.sLugarNacimiento = sLugarNacimiento;
    }

    public String getsCiudadNacimiento() {
        return sCiudadNacimiento;
    }

    public void setsCiudadNacimiento(String sCiudadNacimiento) {
        this.sCiudadNacimiento = sCiudadNacimiento;
    }

    public int getiGrupoSaniguineo() {
        return iGrupoSaniguineo;
    }

    public void setiGrupoSaniguineo(int iGrupoSaniguineo) {
        this.iGrupoSaniguineo = iGrupoSaniguineo;
    }

    public Date getdFechaInscripcion() {
        return dFechaInscripcion;
    }

    public void setdFechaInscripcion(Date dFechaInscripcion) {
        this.dFechaInscripcion = dFechaInscripcion;
    }

    public String getsFechaInscripcion() {
        return sFechaInscripcion;
    }

    public void setsFechaInscripcion(String sFechaInscripcion) {
        this.sFechaInscripcion = sFechaInscripcion;
    }

    public String getsEstadoCivil() {
        return sEstadoCivil;
    }

    public void setsEstadoCivil(String sEstadoCivil) {
        this.sEstadoCivil = sEstadoCivil;
    }

    public int getiLibretaMilitar() {
        return iLibretaMilitar;
    }

    public void setiLibretaMilitar(int iLibretaMilitar) {
        this.iLibretaMilitar = iLibretaMilitar;
    }

    public String getsNumeroLibretaMilitar() {
        return sNumeroLibretaMilitar;
    }

    public void setsNumeroLibretaMilitar(String sNumeroLibretaMilitar) {
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
    }

    public int getiNivelEducativo() {
        return iNivelEducativo;
    }

    public void setiNivelEducativo(int iNivelEducativo) {
        this.iNivelEducativo = iNivelEducativo;
    }

    
}
