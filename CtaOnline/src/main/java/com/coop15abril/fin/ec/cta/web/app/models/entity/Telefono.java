package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Telefono {

    private String  numeroConvencional;
    private String  numeroCelular;
    private Integer operadoraCelular;
    private String   error;

    public Telefono(String numeroConvencional, String numeroCelular, Integer operadoraCelular, String error) {
        this.numeroConvencional = numeroConvencional;
        this.numeroCelular = numeroCelular;
        this.operadoraCelular = operadoraCelular;
        this.error = error;
    }


    public String getNumeroConvencional() {
        return numeroConvencional;
    }

    public void setNumeroConvencional(String numeroConvencional) {
        this.numeroConvencional = numeroConvencional;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Integer getOperadoraCelular() {
        return operadoraCelular;
    }

    public void setOperadoraCelular(Integer operadoraCelular) {
        this.operadoraCelular = operadoraCelular;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numeroConvencional='" + numeroConvencional + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", operadoraCelular=" + operadoraCelular +
                ", error='" + error + '\'' +
                '}';
    }
}
