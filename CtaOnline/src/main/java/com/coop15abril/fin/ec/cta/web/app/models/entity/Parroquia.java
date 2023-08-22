package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Parroquia {

    private Integer codigoParroquia;
    private String descripcion;

    public Parroquia(Integer codigoParroquia, String descripcion) {
        this.codigoParroquia = codigoParroquia;
        this.descripcion = descripcion;
    }


    public Integer getCodigoParroquia() {
        return codigoParroquia;
    }

    public void setCodigoParroquia(Integer codigoParroquia) {
        this.codigoParroquia = codigoParroquia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
