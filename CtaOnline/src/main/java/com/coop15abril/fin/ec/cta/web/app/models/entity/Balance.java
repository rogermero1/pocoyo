package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Balance {

    private double ingresoSueldo;
    private double ingresoNegocio;
    private double ingresoRenta;
    private double ingresoConyuge;
    private double ingresoOtros;
    private double egresosAlimentacion;
    private double egresosServiciosBasicos;
    private double egresosVehiculo;
    private double egresosTransporte;
    private double egresosSalud;
    private double egresosEducacion;
    private double egresosOtros;
    private String error;

    public Balance(double ingresoSueldo, double ingresoNegocio, double ingresoRenta, double ingresoConyuge, double ingresoOtros, double egresosAlimentacion, double egresosServiciosBasicos, double egresosVehiculo, double egresosTransporte, double egresosSalud, double egresosEducacion, double egresosOtros, String error) {
        this.ingresoSueldo = ingresoSueldo;
        this.ingresoNegocio = ingresoNegocio;
        this.ingresoRenta = ingresoRenta;
        this.ingresoConyuge = ingresoConyuge;
        this.ingresoOtros = ingresoOtros;
        this.egresosAlimentacion = egresosAlimentacion;
        this.egresosServiciosBasicos = egresosServiciosBasicos;
        this.egresosVehiculo = egresosVehiculo;
        this.egresosTransporte = egresosTransporte;
        this.egresosSalud = egresosSalud;
        this.egresosEducacion = egresosEducacion;
        this.egresosOtros = egresosOtros;
        this.error = error;
    }


    public double getIngresoSueldo() {
        return ingresoSueldo;
    }

    public void setIngresoSueldo(double ingresoSueldo) {
        this.ingresoSueldo = ingresoSueldo;
    }

    public double getIngresoNegocio() {
        return ingresoNegocio;
    }

    public void setIngresoNegocio(double ingresoNegocio) {
        this.ingresoNegocio = ingresoNegocio;
    }

    public double getIngresoRenta() {
        return ingresoRenta;
    }

    public void setIngresoRenta(double ingresoRenta) {
        this.ingresoRenta = ingresoRenta;
    }

    public double getIngresoConyuge() {
        return ingresoConyuge;
    }

    public void setIngresoConyuge(double ingresoConyuge) {
        this.ingresoConyuge = ingresoConyuge;
    }

    public double getIngresoOtros() {
        return ingresoOtros;
    }

    public void setIngresoOtros(double ingresoOtros) {
        this.ingresoOtros = ingresoOtros;
    }

    public double getEgresosAlimentacion() {
        return egresosAlimentacion;
    }

    public void setEgresosAlimentacion(double egresosAlimentacion) {
        this.egresosAlimentacion = egresosAlimentacion;
    }

    public double getEgresosServiciosBasicos() {
        return egresosServiciosBasicos;
    }

    public void setEgresosServiciosBasicos(double egresosServiciosBasicos) {
        this.egresosServiciosBasicos = egresosServiciosBasicos;
    }

    public double getEgresosVehiculo() {
        return egresosVehiculo;
    }

    public void setEgresosVehiculo(double egresosVehiculo) {
        this.egresosVehiculo = egresosVehiculo;
    }

    public double getEgresosTransporte() {
        return egresosTransporte;
    }

    public void setEgresosTransporte(double egresosTransporte) {
        this.egresosTransporte = egresosTransporte;
    }

    public double getEgresosSalud() {
        return egresosSalud;
    }

    public void setEgresosSalud(double egresosSalud) {
        this.egresosSalud = egresosSalud;
    }

    public double getEgresosEducacion() {
        return egresosEducacion;
    }

    public void setEgresosEducacion(double egresosEducacion) {
        this.egresosEducacion = egresosEducacion;
    }

    public double getEgresosOtros() {
        return egresosOtros;
    }

    public void setEgresosOtros(double egresosOtros) {
        this.egresosOtros = egresosOtros;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "ingresoSueldo=" + ingresoSueldo +
                ", ingresoNegocio=" + ingresoNegocio +
                ", ingresoRenta=" + ingresoRenta +
                ", ingresoConyuge=" + ingresoConyuge +
                ", ingresoOtros=" + ingresoOtros +
                ", egresosAlimentacion=" + egresosAlimentacion +
                ", egresosServiciosBasicos=" + egresosServiciosBasicos +
                ", egresosVehiculo=" + egresosVehiculo +
                ", egresosTransporte=" + egresosTransporte +
                ", egresosSalud=" + egresosSalud +
                ", egresosEducacion=" + egresosEducacion +
                ", egresosOtros=" + egresosOtros +
                ", error='" + error + '\'' +
                '}';
    }
}
