package com.coop15abril.fin.ec.cta.web.app.interfacesService;

import org.springframework.web.multipart.MultipartFile;

import com.coop15abril.fin.ec.cta.web.app.models.entity.CorreoEmisor;

public interface Extras {

     boolean EnviarEmail(String nombreCuenta, String email, Long cuenta, CorreoEmisor emisor);
     boolean EnviaEmailEmpleado(String emailEmpleado, String cuenta, String nombreCuenta, String dni ,String fileNemcdF ,String fileNemcdP , String fileNemsb, CorreoEmisor emisor);
     boolean CrearContrato(String nombreCuenta, String dni,Long cuenta);
     String subirArchivo(MultipartFile file, String dni, String tipo);
}
