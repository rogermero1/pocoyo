package com.coop15abril.fin.ec.cta.web.app.models.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleo {

    private Integer codigoMunicipioEmpleo;
    private Integer codigoDepartamentoEmpleo;
    private String  tipoDependenciaEmpleo;
    private String  cargoEmpleo;
    private String  nombreEmpresaEmpleo;
    private Date fechaIngreso;
    private String error;


    public Empleo(Integer codigoMunicipioEmpleo, Integer codigoDepartamentoEmpleo, String tipoDependenciaEmpleo, String cargoEmpleo, String nombreEmpresaEmpleo, Date fechaIngreso, String error) {
        this.codigoMunicipioEmpleo = codigoMunicipioEmpleo;
        this.codigoDepartamentoEmpleo = codigoDepartamentoEmpleo;
        this.tipoDependenciaEmpleo = tipoDependenciaEmpleo !=null? tipoDependenciaEmpleo:"";
        this.cargoEmpleo = cargoEmpleo;
        this.nombreEmpresaEmpleo = nombreEmpresaEmpleo;
        this.fechaIngreso = fechaIngreso;
        this.error = error;
    }

    public Integer getCodigoMunicipioEmpleo() {
        return codigoMunicipioEmpleo;
    }

    public void setCodigoMunicipioEmpleo(Integer codigoMunicipioEmpleo) {
        this.codigoMunicipioEmpleo = codigoMunicipioEmpleo;
    }

    public Integer getCodigoDepartamentoEmpleo() {
        return codigoDepartamentoEmpleo;
    }

    public void setCodigoDepartamentoEmpleo(Integer codigoDepartamentoEmpleo) {
        this.codigoDepartamentoEmpleo = codigoDepartamentoEmpleo;
    }

    public String getTipoDependenciaEmpleo() {
        return tipoDependenciaEmpleo;
    }

    public void setTipoDependenciaEmpleo(String tipoDependenciaEmpleo) {
        this.tipoDependenciaEmpleo = tipoDependenciaEmpleo;
    }

    public String getCargoEmpleo() {
        return cargoEmpleo;
    }

    public void setCargoEmpleo(String cargoEmpleo) {
        this.cargoEmpleo = cargoEmpleo;
    }

    public String getNombreEmpresaEmpleo() {
        return nombreEmpresaEmpleo;
    }

    public void setNombreEmpresaEmpleo(String nombreEmpresaEmpleo) {
        this.nombreEmpresaEmpleo = nombreEmpresaEmpleo;
    }

    public String getFechaIngreso() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        return  fechaIngreso != null? formatter.format(fechaIngreso): null;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Empleo{" +
                "codigoMunicipioEmpleo=" + codigoMunicipioEmpleo +
                ", codigoDepartamentoEmpleo=" + codigoDepartamentoEmpleo +
                ", tipoDependenciaEmpleo='" + tipoDependenciaEmpleo + '\'' +
                ", cargoEmpleo='" + cargoEmpleo + '\'' +
                ", nombreEmpresaEmpleo='" + nombreEmpresaEmpleo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", error='" + error + '\'' +
                '}';
    }
}
