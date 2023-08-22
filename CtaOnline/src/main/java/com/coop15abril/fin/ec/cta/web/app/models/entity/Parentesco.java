package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Parentesco {

    private Integer  codigoReferenciaPersonal;
    private String   descripcion;

    public Parentesco(Integer codigoReferenciaPersonal, String descripcion) {
        this.codigoReferenciaPersonal = codigoReferenciaPersonal;
        this.descripcion = descripcion;
    }

    public Integer getCodigoReferenciaPersonal() {
        return codigoReferenciaPersonal;
    }

    public void setCodigoReferenciaPersonal(Integer codigoReferenciaPersonal) {
        this.codigoReferenciaPersonal = codigoReferenciaPersonal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
