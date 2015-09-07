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
public class AcudienteModel {

    String sTipoIdentificacion; //Identificacion Acudiente
    Date dFechaExpedicion;  //Fecha de expedicion del documento del acudiente
    String sFechaExpedicion; //Fecha de expedicion del documento del acudiente
    String sPrimerNombre;   //Primer Nombre del acudiente
    String sSegundoNombre; //Segundo Nombre del acudiente
    String sGenero; //Genero del acudiente
    String sMedioEdupol; //Medio por el que se entero de edupol
    String sTipoContrato;//Contrato Laboral
    String sTrabajaActual; //Trabaja actualmente
    String sTiempoTrabajando; //Cuanto tiempo lleva trabajando
    String sOcupacion; //Ocupacion actual del acudiente
    double dSalario; // Salario del acudiente
    String sEmpleado; //Empleado/independiente;
    double dIngArrendamiento; //Valor Ingresos Arrendamiento
    double dIngPension; //Valor Ingresos por pension
    double dOtrosIngresos1; // Valor Otros Ingresos
    double dOtrosIngresos2; // Valor Otros Ingresos
    double dOtrosIngresos3; // Valor Otros Ingresos
    String sTipoVivienda; // Vivienda PROPIA/FAMILIAR/ARRIENDO
    String sVehiculo; //Tiene Vehiculo SI/NO - Cual
    String sTipoCredito; // Tiene algun credito en el momento SI/NO - Cual
    double dValorObligaciones; // Obligaciones Financieras
    String sTarjetaCredito; // Tarjeta de Credito SI/NO -cual
    int iTelefonoFijo;
    int iTelefonoMovil;
    String sCorreo; // Correo Electronico

    public AcudienteModel() {
    }
    
    public AcudienteModel(String sTipoIdentificacion, Date dFechaExpedicion, String sFechaExpedicion, String sPrimerNombre, String sSegundoNombre, String sGenero, String sMedioEdupol, String sTipoContrato, String sTrabajaActual, String sTiempoTrabajando, String sOcupacion, double dSalario, String sEmpleado, double dIngArrendamiento, double dIngPension, double dOtrosIngresos1, double dOtrosIngresos2, double dOtrosIngresos3, String sTipoVivienda, String sVehiculo, String sTipoCredito, double dValorObligaciones, String sTarjetaCredito, int iTelefonoFijo, int iTelefonoMovil, String sCorreo) {
        this.sTipoIdentificacion = sTipoIdentificacion;
        this.dFechaExpedicion = dFechaExpedicion;
        this.sFechaExpedicion = sFechaExpedicion;
        this.sPrimerNombre = sPrimerNombre;
        this.sSegundoNombre = sSegundoNombre;
        this.sGenero = sGenero;
        this.sMedioEdupol = sMedioEdupol;
        this.sTipoContrato = sTipoContrato;
        this.sTrabajaActual = sTrabajaActual;
        this.sTiempoTrabajando = sTiempoTrabajando;
        this.sOcupacion = sOcupacion;
        this.dSalario = dSalario;
        this.sEmpleado = sEmpleado;
        this.dIngArrendamiento = dIngArrendamiento;
        this.dIngPension = dIngPension;
        this.dOtrosIngresos1 = dOtrosIngresos1;
        this.dOtrosIngresos2 = dOtrosIngresos2;
        this.dOtrosIngresos3 = dOtrosIngresos3;
        this.sTipoVivienda = sTipoVivienda;
        this.sVehiculo = sVehiculo;
        this.sTipoCredito = sTipoCredito;
        this.dValorObligaciones = dValorObligaciones;
        this.sTarjetaCredito = sTarjetaCredito;
        this.iTelefonoFijo = iTelefonoFijo;
        this.iTelefonoMovil = iTelefonoMovil;
        this.sCorreo = sCorreo;
    }

    public String getsTipoIdentificacion() {
        return sTipoIdentificacion;
    }

    public void setsTipoIdentificacion(String sTipoIdentificacion) {
        this.sTipoIdentificacion = sTipoIdentificacion;
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

    public String getsGenero() {
        return sGenero;
    }

    public void setsGenero(String sGenero) {
        this.sGenero = sGenero;
    }

    public String getsMedioEdupol() {
        return sMedioEdupol;
    }

    public void setsMedioEdupol(String sMedioEdupol) {
        this.sMedioEdupol = sMedioEdupol;
    }

    public String getsTipoContrato() {
        return sTipoContrato;
    }

    public void setsTipoContrato(String sTipoContrato) {
        this.sTipoContrato = sTipoContrato;
    }

    public String getsTrabajaActual() {
        return sTrabajaActual;
    }

    public void setsTrabajaActual(String sTrabajaActual) {
        this.sTrabajaActual = sTrabajaActual;
    }

    public String getsTiempoTrabajando() {
        return sTiempoTrabajando;
    }

    public void setsTiempoTrabajando(String sTiempoTrabajando) {
        this.sTiempoTrabajando = sTiempoTrabajando;
    }

    public String getsOcupacion() {
        return sOcupacion;
    }

    public void setsOcupacion(String sOcupacion) {
        this.sOcupacion = sOcupacion;
    }

    public double getdSalario() {
        return dSalario;
    }

    public void setdSalario(double dSalario) {
        this.dSalario = dSalario;
    }

    public String getsEmpleado() {
        return sEmpleado;
    }

    public void setsEmpleado(String sEmpleado) {
        this.sEmpleado = sEmpleado;
    }

    public double getdIngArrendamiento() {
        return dIngArrendamiento;
    }

    public void setdIngArrendamiento(double dIngArrendamiento) {
        this.dIngArrendamiento = dIngArrendamiento;
    }

    public double getdIngPension() {
        return dIngPension;
    }

    public void setdIngPension(double dIngPension) {
        this.dIngPension = dIngPension;
    }

    public double getdOtrosIngresos1() {
        return dOtrosIngresos1;
    }

    public void setdOtrosIngresos1(double dOtrosIngresos1) {
        this.dOtrosIngresos1 = dOtrosIngresos1;
    }

    public double getdOtrosIngresos2() {
        return dOtrosIngresos2;
    }

    public void setdOtrosIngresos2(double dOtrosIngresos2) {
        this.dOtrosIngresos2 = dOtrosIngresos2;
    }

    public double getdOtrosIngresos3() {
        return dOtrosIngresos3;
    }

    public void setdOtrosIngresos3(double dOtrosIngresos3) {
        this.dOtrosIngresos3 = dOtrosIngresos3;
    }

    public String getsTipoVivienda() {
        return sTipoVivienda;
    }

    public void setsTipoVivienda(String sTipoVivienda) {
        this.sTipoVivienda = sTipoVivienda;
    }

    public String getsVehiculo() {
        return sVehiculo;
    }

    public void setsVehiculo(String sVehiculo) {
        this.sVehiculo = sVehiculo;
    }

    public String getsTipoCredito() {
        return sTipoCredito;
    }

    public void setsTipoCredito(String sTipoCredito) {
        this.sTipoCredito = sTipoCredito;
    }

    public double getdValorObligaciones() {
        return dValorObligaciones;
    }

    public void setdValorObligaciones(double dValorObligaciones) {
        this.dValorObligaciones = dValorObligaciones;
    }

    public String getsTarjetaCredito() {
        return sTarjetaCredito;
    }

    public void setsTarjetaCredito(String sTarjetaCredito) {
        this.sTarjetaCredito = sTarjetaCredito;
    }

    public int getiTelefonoFijo() {
        return iTelefonoFijo;
    }

    public void setiTelefonoFijo(int iTelefonoFijo) {
        this.iTelefonoFijo = iTelefonoFijo;
    }

    public int getiTelefonoMovil() {
        return iTelefonoMovil;
    }

    public void setiTelefonoMovil(int iTelefonoMovil) {
        this.iTelefonoMovil = iTelefonoMovil;
    }

    public String getsCorreo() {
        return sCorreo;
    }

    public void setsCorreo(String sCorreo) {
        this.sCorreo = sCorreo;
    }
}

