/**
 * 
 */
package com.coop15abril.fin.ec.cta.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coop15abril.fin.ec.cta.web.app.models.entity.ActividadEconomica;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Barrio;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Canton;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DependeciaLaboral;
import com.coop15abril.fin.ec.cta.web.app.models.entity.EstadoCivil;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Nacionalidad;
import com.coop15abril.fin.ec.cta.web.app.models.entity.NivelEstudio;
import com.coop15abril.fin.ec.cta.web.app.models.entity.OperadoraCelular;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Pais;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Parentesco;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Parroquia;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Profesion;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Provincia;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Residencia;
import com.coop15abril.fin.ec.cta.web.app.service.OpstionService;

/**
 * @author cristian.german
 *
 */

@Controller
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/opcion")
public class OpcionesController {
	
	   //private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);

		@Autowired
		private OpstionService opctionService;

		@GetMapping(value ="/nacionalidades", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Nacionalidad> nacionalidad() {
			return opctionService.getAllNacionalidad();
		}

		@GetMapping(value ="/residencias", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Residencia> residencia() {
			return opctionService.getAllResidencia();
		}

		@GetMapping(value="/estudios", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<NivelEstudio> nivelEstudio() {
			return opctionService.getAllNivelEstudios();
		}

		@GetMapping(value="/profesiones", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Profesion> profesiones() {
			return opctionService.getAllProfesion();
		}

		@GetMapping(value="/actividadEconomica", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<ActividadEconomica> actividadEconomica() {
			return opctionService.getAllActividadEconomica();
		}

		@GetMapping(value="/provincias", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Provincia> provincias() {
			return opctionService.getProvincia();
		}
		
		@GetMapping(value="/provincias/all", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Provincia> Allprovincias() {
			return opctionService.getAllProvincia();
		}

		@RequestMapping(value = "/getCantones/{provincia_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Canton> cantonesByProvincia(@PathVariable("provincia_id") Integer provincia_id) {
			return opctionService.getAllCantonByProvincia(provincia_id);
		}

		@RequestMapping(value = "/getParroquias/{provincia_id}/{canton_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Parroquia> parroquiasByCanton(@PathVariable("provincia_id") Integer provincia_id,
				@PathVariable("canton_id") Integer canton_id) {
			return opctionService.getAllParroquiaByCanton(provincia_id, canton_id);
		}

		@RequestMapping(value = "/getBarrios/{provincia_id}/{canton_id}/{parroquia_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Barrio> barriosByParroquia(@PathVariable("provincia_id") Integer provincia_id,
				@PathVariable("canton_id") Integer canton_id, @PathVariable("parroquia_id") Integer parroquia_id) {
			return opctionService.getAllBarriosByParroquias(provincia_id, canton_id, parroquia_id);
		}

		@GetMapping(value = "/dependenciaLaborales", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<DependeciaLaboral> dependeciaLaboral() {
			return opctionService.getAllDependenciaLaboral();
		}

		@GetMapping(value = "/parentescos", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Parentesco> parentescos() {
			return opctionService.getAllParentesco();
		}

		@GetMapping(value = "/estadoCivilList", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<EstadoCivil> estadoCivilList() {
			return opctionService.getALLEstadoCivil();
		}

		@GetMapping(value = "/OperadoraCelularList", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<OperadoraCelular> OperadoraCelularList() {
			return opctionService.getAllOperadora();
		}
		
		@GetMapping(value = "/PaisesList", produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<Pais> ListaPaises(){
			return opctionService.getAllPaises();
		}

		@GetMapping("/terminos/tarjeta/{dni}")
		public String terminoTarjeta(@PathVariable("dni") String dni, Model model) {
			model.addAttribute("dni", dni);
			return "Partials/terminos_tarjeta";
		}

		@GetMapping("/terminos/certificaciones/{dni}")
		public String terminoCertificaciones(@PathVariable("dni") String dni, Model model) {
			model.addAttribute("dni", dni);
			return "Partials/terminos_certificacion";
		}

		@GetMapping("/terminos/contrato/{dni}/{nombres}")
		public String terminoContrato(@PathVariable("dni") String dni, @PathVariable("nombres") String nombres,
				Model model) {
			model.addAttribute("dni", dni);
			model.addAttribute("nombre_cuenta", nombres);
			return "Partials/contrato_cuenta";
		}


}
