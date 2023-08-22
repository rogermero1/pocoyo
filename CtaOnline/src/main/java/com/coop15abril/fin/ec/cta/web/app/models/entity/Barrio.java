package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Barrio {

    private Integer codigoBarrio;
    private String nombre;

    public Barrio(Integer codigoBarrio, String nombre) {
        this.codigoBarrio = codigoBarrio;
        this.nombre = nombre;
    }

    public Integer getCodigoBarrio() {
        return codigoBarrio;
    }

    public void setCodigoBarrio(Integer codigoBarrio) {
        this.codigoBarrio = codigoBarrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
