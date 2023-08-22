package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class CuentaAhorro {

    private Long cuenta;
    private String  codigoError;

    public CuentaAhorro(Long cuenta, String codigoError) {
        this.cuenta = cuenta;
        this.codigoError = codigoError;
    }

    public CuentaAhorro() {
    }

    public Long getCuenta() {
        return cuenta;
    }

    public void setCuenta(Long cuenta) {
        this.cuenta = cuenta;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }
}
