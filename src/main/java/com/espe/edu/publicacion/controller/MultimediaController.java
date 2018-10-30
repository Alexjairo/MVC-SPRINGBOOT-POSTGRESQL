package com.espe.edu.publicacion.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.espe.edu.publicacion.model.Multimedia;
import com.espe.edu.publicacion.services.MultimediaService;
import com.espe.edu.publicacion.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import constants.Constantes;

@CrossOrigin(origins = {Constantes.DOMAIN1})
@RestController
@RequestMapping("/sisEventosWs")
public class MultimediaController {

	@Autowired
	private MultimediaService multimediaService;
	private ObjectMapper mapper;

	

	@SuppressWarnings("all")
	@RequestMapping(value = "/saveOrUpdateMultimedia", method = RequestMethod.POST)
	public RestResponse saveOrUpdateMultimedia(@RequestBody String multimediaJson)
			throws JsonParseException, JsonMappingException, IOException {

		Multimedia multimedia = new Multimedia();
		this.mapper = new ObjectMapper();
		try {
			multimedia = this.mapper.readValue(multimediaJson, Multimedia.class);
			System.out.println(multimedia);
			
			if (!this.validate(multimedia)) {
				System.out.println("if");
				return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"error al guardar");
			}
			this.multimediaService.save(multimedia);
			System.out.println("save");
			return new RestResponse(HttpStatus.OK.value(), "Guardado con Exito!");
		} catch (Exception e) {
			System.out.println(e);
			return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "el id no existe");
		}
	}

	@RequestMapping(value = "/getMultimedia", method = RequestMethod.GET)
	/* METODO BUSCAR */
	public List<Multimedia> getMultimedia() {
		return this.multimediaService.findAll();
	}

	@RequestMapping(value = "/deleteMultimedia", method = RequestMethod.POST)
	public void deleteMultimedia(@RequestBody String multimediaJson) throws Exception {
		this.mapper = new ObjectMapper();
		Multimedia multimedia = this.mapper.readValue(multimediaJson, Multimedia.class);
		if (multimedia.getMulId() == 0L) {
			throw new Exception("El Id esta nulo");
		}
		this.multimediaService.deleteMultimedia(multimedia.getMulId());
	}

	private boolean validate(Multimedia multimedia) {
		boolean isValid = true;

		if (multimedia.getMulTipo() == "" || multimedia.getMulTipo() == null) {
			isValid = false;
		}
		return isValid;
	}
}
