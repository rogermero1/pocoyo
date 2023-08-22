package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class ReferenciaCliente {

    private String primerApellidoRef;
    private String segundoApellidoRef;
    private String nombresRef;
    private Integer tipoRef;
    private String telefonoRef;
    private String direccionRef;
    private String error;

    public ReferenciaCliente(String primerApellidoRef, String segundoApellidoRef, String nombresRef, Integer tipoRef, String telefonoRef, String direccionRef, String error) {
        this.primerApellidoRef = primerApellidoRef;
        this.segundoApellidoRef = segundoApellidoRef;
        this.nombresRef = nombresRef;
        this.tipoRef = tipoRef;
        this.telefonoRef = telefonoRef;
        this.direccionRef = direccionRef;
        this.error = error;
    }

    public String getPrimerApellidoRef() {
        return primerApellidoRef;
    }

    public void setPrimerApellidoRef(String primerApellidoRef) {
        this.primerApellidoRef = primerApellidoRef;
    }

    public String getSegundoApellidoRef() {
        return segundoApellidoRef;
    }

    public void setSegundoApellidoRef(String segundoApellidoRef) {
        this.segundoApellidoRef = segundoApellidoRef;
    }

    public String getNombresRef() {
        return nombresRef;
    }

    public void setNombresRef(String nombresRef) {
        this.nombresRef = nombresRef;
    }

    public Integer getTipoRef() {
        return tipoRef;
    }

    public void setTipoRef(Integer tipoRef) {
        this.tipoRef = tipoRef;
    }

    public String getTelefonoRef() {
        return telefonoRef;
    }

    public void setTelefonoRef(String telefonoRef) {
        this.telefonoRef = telefonoRef;
    }

    public String getDireccionRef() {
        return direccionRef;
    }

    public void setDireccionRef(String direccionRef) {
        this.direccionRef = direccionRef;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ReferenciaCliente{" +
                "primerApellidoRef='" + primerApellidoRef + '\'' +
                ", segundoApellidoRef='" + segundoApellidoRef + '\'' +
                ", nombresRef='" + nombresRef + '\'' +
                ", tipoRef=" + tipoRef +
                ", telefonoRef='" + telefonoRef + '\'' +
                ", direccionRef='" + direccionRef + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
