package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class DependeciaLaboral {

    private String codigoTipoDependencia;
    private String descripcion;

    public DependeciaLaboral(String codigoTipoDependencia, String descripcion) {
        this.codigoTipoDependencia = codigoTipoDependencia;
        this.descripcion = descripcion;
    }

    public String getCodigoTipoDependencia() {
        return codigoTipoDependencia;
    }

    public void setCodigoTipoDependencia(String codigoTipoDependencia) {
        this.codigoTipoDependencia = codigoTipoDependencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
