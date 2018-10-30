package com.espe.edu.publicacion.controller;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.espe.edu.publicacion.model.TipoPublicaciones;
import com.espe.edu.publicacion.services.TipoPublicacionesService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/sisEventosWs")
public class TipoPublicacionController {

	@Autowired
	private TipoPublicacionesService tipoPublicacioneService;
	private ObjectMapper mapper;

	@RequestMapping("/hola")
	public String hola() {
		return "hola desde spring";
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/saveOrUpdateTipoPublicacion", method = RequestMethod.POST)
	public ResponseEntity saveOrUpdate(@RequestBody String tipoPublicacionesJson)
			throws JsonParseException, JsonMappingException, IOException {

		TipoPublicaciones tipoPublicaciones = new TipoPublicaciones();
		this.mapper = new ObjectMapper();
		try {
			tipoPublicaciones = this.mapper.readValue(tipoPublicacionesJson, TipoPublicaciones.class);
			System.out.println(tipoPublicaciones);

			if (!this.validate(tipoPublicaciones)) {
				System.out.println("if");
				return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			}
			this.tipoPublicacioneService.save(tipoPublicaciones);
			System.out.println("save");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getTipoPublicaciones", method = RequestMethod.GET)
	/* METODO BUSCAR */
	public List<TipoPublicaciones> getTpoPublicaciones() {
		return this.tipoPublicacioneService.findAll();
	}

	@RequestMapping(value = "/deleteTipoPublicacion", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String tipoPublicacionesJson) throws Exception {
		this.mapper = new ObjectMapper();
		TipoPublicaciones tipoPublicaciones = this.mapper.readValue(tipoPublicacionesJson, TipoPublicaciones.class);
		if (tipoPublicaciones.getTipPubId() == 0L) {
			throw new Exception("El Id esta nulo");
		}
		this.tipoPublicacioneService.deleteTipoPublicaciones(tipoPublicaciones.getTipPubId());
	}

	private boolean validate(TipoPublicaciones tipoPublicaciones) {
		boolean isValid = true;

		if (tipoPublicaciones.getNombre() == "" || tipoPublicaciones.getNombre() == null) {
			isValid = false;
		}
		return isValid;
	}
}
