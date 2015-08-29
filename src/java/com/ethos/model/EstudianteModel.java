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
 
    String sTipoSolicitud;
    String sTipoRol;
    String sTipoPersona; 
    String sTipoIdentificacion;
    String sNumeroIdentificacion;
    String sPaisExpedicion;
    String sCiudadExpedicion;
    Date dFechaExpedicion;
    String sFechaExpedicion;
    String sPrimerNombre;
    String sSegundoNombre;
    String sPrimerApellido;
    String sSegundoApellido;
    String sGenero;
    String sCategoriaSisben;
    String sNacionalidad;
    String sPaisResidencia;
    String sDepartamentoResidencia;
    String sCiudadResidencia;
    String sLocalidadResidencia;
    String sDireccionResidencia;
    String sBarrioResidencia;
    Date dFechaNacimiento;
    String sFechaNacimiento;
    String sPaisNacimiento;
    String sCiudadNacimiento;
    String sGrupoSaniguineo;
    Date dFechaInscripcion;
    String sFechaInscripcion; //Fecha de inscripcion o de actualizacion de datos
    String sEstadoCivil;
    String sLibretaMilitar;
    String sNumeroLibretaMilitar;
    String sNivelEducativo;

    public EstudianteModel() {
    }

    public EstudianteModel(String sTipoSolicitud, String sTipoRol, String sTipoPersona, String sTipoIdentificacion, String sNumeroIdentificacion, String sPaisExpedicion, String sCiudadExpedicion, Date dFechaExpedicion, String sFechaExpedicion, String sPrimerNombre, String sSegundoNombre, String sPrimerApellido, String sSegundoApellido, String sGenero, String sCategoriaSisben, String sNacionalidad, String sPaisResidencia, String sDepartamentoResidencia, String sCiudadResidencia, String sLocalidadResidencia, String sDireccionResidencia, String sBarrioResidencia, Date dFechaNacimiento, String sFechaNacimiento, String sPaisNacimiento, String sCiudadNacimiento, String sGrupoSaniguineo, Date dFechaInscripcion, String sFechaInscripcion, String sEstadoCivil, String sLibretaMilitar, String sNumeroLibretaMilitar, String sNivelEducativo) {
        this.sTipoSolicitud = sTipoSolicitud;
        this.sTipoRol = sTipoRol;
        this.sTipoPersona = sTipoPersona;
        this.sTipoIdentificacion = sTipoIdentificacion;
        this.sNumeroIdentificacion = sNumeroIdentificacion;
        this.sPaisExpedicion = sPaisExpedicion;
        this.sCiudadExpedicion = sCiudadExpedicion;
        this.dFechaExpedicion = dFechaExpedicion;
        this.sFechaExpedicion = sFechaExpedicion;
        this.sPrimerNombre = sPrimerNombre;
        this.sSegundoNombre = sSegundoNombre;
        this.sPrimerApellido = sPrimerApellido;
        this.sSegundoApellido = sSegundoApellido;
        this.sGenero = sGenero;
        this.sCategoriaSisben = sCategoriaSisben;
        this.sNacionalidad = sNacionalidad;
        this.sPaisResidencia = sPaisResidencia;
        this.sDepartamentoResidencia = sDepartamentoResidencia;
        this.sCiudadResidencia = sCiudadResidencia;
        this.sLocalidadResidencia = sLocalidadResidencia;
        this.sDireccionResidencia = sDireccionResidencia;
        this.sBarrioResidencia = sBarrioResidencia;
        this.dFechaNacimiento = dFechaNacimiento;
        this.sFechaNacimiento = sFechaNacimiento;
        this.sPaisNacimiento = sPaisNacimiento;
        this.sCiudadNacimiento = sCiudadNacimiento;
        this.sGrupoSaniguineo = sGrupoSaniguineo;
        this.dFechaInscripcion = dFechaInscripcion;
        this.sFechaInscripcion = sFechaInscripcion;
        this.sEstadoCivil = sEstadoCivil;
        this.sLibretaMilitar = sLibretaMilitar;
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
        this.sNivelEducativo = sNivelEducativo;
    }

    public String getsTipoSolicitud() {
        return sTipoSolicitud;
    }

    public void setsTipoSolicitud(String sTipoSolicitud) {
        this.sTipoSolicitud = sTipoSolicitud;
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

    public String getsTipoIdentificacion() {
        return sTipoIdentificacion;
    }

    public void setsTipoIdentificacion(String sTipoIdentificacion) {
        this.sTipoIdentificacion = sTipoIdentificacion;
    }

    public String getsNumeroIdentificacion() {
        return sNumeroIdentificacion;
    }

    public void setsNumeroIdentificacion(String sNumeroIdentificacion) {
        this.sNumeroIdentificacion = sNumeroIdentificacion;
    }

    public String getsPaisExpedicion() {
        return sPaisExpedicion;
    }

    public void setsPaisExpedicion(String sPaisExpedicion) {
        this.sPaisExpedicion = sPaisExpedicion;
    }

    public String getsCiudadExpedicion() {
        return sCiudadExpedicion;
    }

    public void setsCiudadExpedicion(String sCiudadExpedicion) {
        this.sCiudadExpedicion = sCiudadExpedicion;
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

    public String getsGenero() {
        return sGenero;
    }

    public void setsGenero(String sGenero) {
        this.sGenero = sGenero;
    }

    public String getsCategoriaSisben() {
        return sCategoriaSisben;
    }

    public void setsCategoriaSisben(String sCategoriaSisben) {
        this.sCategoriaSisben = sCategoriaSisben;
    }

    public String getsNacionalidad() {
        return sNacionalidad;
    }

    public void setsNacionalidad(String sNacionalidad) {
        this.sNacionalidad = sNacionalidad;
    }

    public String getsPaisResidencia() {
        return sPaisResidencia;
    }

    public void setsPaisResidencia(String sPaisResidencia) {
        this.sPaisResidencia = sPaisResidencia;
    }

    public String getsDepartamentoResidencia() {
        return sDepartamentoResidencia;
    }

    public void setsDepartamentoResidencia(String sDepartamentoResidencia) {
        this.sDepartamentoResidencia = sDepartamentoResidencia;
    }

    public String getsCiudadResidencia() {
        return sCiudadResidencia;
    }

    public void setsCiudadResidencia(String sCiudadResidencia) {
        this.sCiudadResidencia = sCiudadResidencia;
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

    public String getsPaisNacimiento() {
        return sPaisNacimiento;
    }

    public void setsPaisNacimiento(String sPaisNacimiento) {
        this.sPaisNacimiento = sPaisNacimiento;
    }

    public String getsCiudadNacimiento() {
        return sCiudadNacimiento;
    }

    public void setsCiudadNacimiento(String sCiudadNacimiento) {
        this.sCiudadNacimiento = sCiudadNacimiento;
    }

    public String getsGrupoSaniguineo() {
        return sGrupoSaniguineo;
    }

    public void setsGrupoSaniguineo(String sGrupoSaniguineo) {
        this.sGrupoSaniguineo = sGrupoSaniguineo;
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

    public String getsLibretaMilitar() {
        return sLibretaMilitar;
    }

    public void setsLibretaMilitar(String sLibretaMilitar) {
        this.sLibretaMilitar = sLibretaMilitar;
    }

    public String getsNumeroLibretaMilitar() {
        return sNumeroLibretaMilitar;
    }

    public void setsNumeroLibretaMilitar(String sNumeroLibretaMilitar) {
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
    }

    public String getsNivelEducativo() {
        return sNivelEducativo;
    }

    public void setsNivelEducativo(String sNivelEducativo) {
        this.sNivelEducativo = sNivelEducativo;
    }

    
}
