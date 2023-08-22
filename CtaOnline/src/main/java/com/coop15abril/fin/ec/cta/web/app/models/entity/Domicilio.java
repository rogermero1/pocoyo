package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Domicilio {

     private  Integer CodigoPais;
     private  Integer CodigoDepartamento;
     private  Integer codigoMunicipio;
     private  Integer codigoParroquia;
     private  Integer barrio;
     private  String calle;
     private  String nomenclatura;
     private  String email;
     private  String errors;


     public Domicilio(Integer codigoPais, Integer codigoDepartamento, Integer codigoMunicipio, Integer codigoParroquia, Integer barrio, String calle, String nomenclatura, String email, String errors) {
          this.CodigoPais = codigoPais;
          this.CodigoDepartamento = codigoDepartamento;
          this.codigoMunicipio = codigoMunicipio;
          this.codigoParroquia = codigoParroquia;
          this.barrio = barrio;
          this.calle = calle != null? calle:"";
          this.nomenclatura = nomenclatura != null? nomenclatura:"";
          this.email = email != null? email:"";
          this.errors = errors;
     }

     public Integer getCodigoPais() {
          return CodigoPais;
     }

     public void setCodigoPais(Integer codigoPais) {
          CodigoPais = codigoPais;
     }

     public Integer getCodigoDepartamento() {
          return CodigoDepartamento;
     }

     public void setCodigoDepartamento(Integer codigoDepartamento) {
          CodigoDepartamento = codigoDepartamento;
     }

     public Integer getCodigoMunicipio() {
          return codigoMunicipio;
     }

     public void setCodigoMunicipio(Integer codigoMunicipio) {
          this.codigoMunicipio = codigoMunicipio;
     }

     public Integer getCodigoParroquia() {
          return codigoParroquia;
     }

     public void setCodigoParroquia(Integer codigoParroquia) {
          this.codigoParroquia = codigoParroquia;
     }

     public Integer getBarrio() {
          return barrio;
     }

     public void setBarrio(Integer barrio) {
          this.barrio = barrio;
     }

     public String getCalle() {
          return calle.toUpperCase();
     }

     public void setCalle(String calle) {
          this.calle = calle;
     }

     public String getNomenclatura() {
          return nomenclatura.toUpperCase();
     }

     public void setNomenclatura(String nomenclatura) {
          this.nomenclatura = nomenclatura;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getErrors() {
          return errors;
     }

     public void setErrors(String errors) {
          this.errors = errors;
     }

     @Override
     public String toString() {
          return "Domicilio{" +
                  "CodigoPais=" + CodigoPais +
                  ", CodigoDepartamento=" + CodigoDepartamento +
                  ", codigoMunicipio=" + codigoMunicipio +
                  ", codigoParroquia=" + codigoParroquia +
                  ", barrio=" + barrio +
                  ", calle='" + calle + '\'' +
                  ", nomenclatura='" + nomenclatura + '\'' +
                  ", email='" + email + '\'' +
                  ", errors='" + errors + '\'' +
                  '}';
     }
}
