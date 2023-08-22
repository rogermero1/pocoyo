package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class OperadoraCelular {

    private Integer CodigoTipoOperadora;
    private String  Descripcion;

    public OperadoraCelular(Integer codigoTipoOperadora, String descripcion) {
        CodigoTipoOperadora = codigoTipoOperadora;
        Descripcion = descripcion;
    }


    public Integer getCodigoTipoOperadora() {
        return CodigoTipoOperadora;
    }

    public void setCodigoTipoOperadora(Integer codigoTipoOperadora) {
        CodigoTipoOperadora = codigoTipoOperadora;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
