package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class DatosComplementario {

       private String descripcionNegocio;
       private String tipoResidencia;
       private String codigoActividadEconomica;
       private Integer codigoProfesion;
       private String comentario;
       private String errors;

    public DatosComplementario(String descripcionNegocio, String tipoResidencia, String codigoActividadEconomica, Integer codigoProfesion, String comentario, String errors) {
        this.descripcionNegocio = descripcionNegocio != null? descripcionNegocio:"";
        this.tipoResidencia = tipoResidencia != null? tipoResidencia:"";
        this.codigoActividadEconomica = codigoActividadEconomica != null? codigoActividadEconomica:"";
        this.codigoProfesion = codigoProfesion;
        this.comentario = comentario != null? comentario:"";
        this.errors = errors;
    }

    public String getDescripcionNegocio() {
        return descripcionNegocio;
    }

    public void setDescripcionNegocio(String descripcionNegocio) {
        this.descripcionNegocio = descripcionNegocio;
    }

    public String getTipoResidencia() {
        return tipoResidencia;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public String getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    public void setCodigoActividadEconomica(String codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }

    public Integer getCodigoProfesion() {
        return codigoProfesion;
    }

    public void setCodigoProfesion(Integer codigoProfesion) {
        this.codigoProfesion = codigoProfesion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
}
