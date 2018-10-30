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

import com.espe.edu.publicacion.model.Publicaciones;
import com.espe.edu.publicacion.services.PublicacionesService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/sisEventosWs")
public class PublicacionesController {

	@Autowired
	private PublicacionesService publicacionesService;
	private ObjectMapper mapper;

	

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/saveOrUpdatePublicaciones", method = RequestMethod.POST)
	public ResponseEntity saveOrUpdate(@RequestBody String publicacionesJson)
			throws JsonParseException, JsonMappingException, IOException {

		Publicaciones publicaciones = new Publicaciones();
		this.mapper = new ObjectMapper();
		try {
			publicaciones = this.mapper.readValue(publicacionesJson, Publicaciones.class);
			System.out.println(publicaciones);
			
			if (!this.validate(publicaciones)) {
				System.out.println("if");
				return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			}
			this.publicacionesService.save(publicaciones);
			System.out.println("save");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getPublicaciones", method = RequestMethod.GET)
	/* METODO BUSCAR */
	public List<Publicaciones> getPublicaciones() {
		return this.publicacionesService.findAll();
	}

	@RequestMapping(value = "/deletePublicaciones", method = RequestMethod.POST)
	public void deletePublicaciones(@RequestBody String publicacionesJson) throws Exception {
		this.mapper = new ObjectMapper();
		Publicaciones publicaciones = this.mapper.readValue(publicacionesJson, Publicaciones.class);
		if (publicaciones.getPubId() == 0L) {
			throw new Exception("El Id esta nulo");
		}
		this.publicacionesService.deletePublicaciones(publicaciones.getPubId());
	}

	private boolean validate(Publicaciones publicaciones) {
		boolean isValid = true;

		if (publicaciones.getPubNombre() == "" || publicaciones.getPubNombre() == null) {
			isValid = false;
		}
		return isValid;
	}
}
