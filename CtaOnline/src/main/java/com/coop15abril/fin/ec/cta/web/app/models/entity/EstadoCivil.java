package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class EstadoCivil {

    private String codigoEstadoCivil;
    private String estadoCivil;

    public EstadoCivil(String codigoEstadoCivil, String estadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
        this.estadoCivil = estadoCivil;
    }

    public String getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(String codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
