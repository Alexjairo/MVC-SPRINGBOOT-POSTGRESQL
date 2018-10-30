package com.espe.edu.publicacion.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.espe.edu.publicacion.model.Destino;
import com.espe.edu.publicacion.services.DestinoService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import constants.Constantes;

@CrossOrigin(origins = {Constantes.DOMAIN1})
@RestController
@RequestMapping("/sisEventosWs")
public class DestinoController {

	@Autowired
	private DestinoService destinoService;
	private ObjectMapper mapper;

	

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public ResponseEntity saveOrUpdate(@RequestBody String destinoJson)
			throws JsonParseException, JsonMappingException, IOException {

		Destino destino = new Destino();
		this.mapper = new ObjectMapper();
		try {
			destino = this.mapper.readValue(destinoJson, Destino.class);
			System.out.println(destino);
			
			if (!this.validate(destino)) {
				System.out.println("if");
				return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			}
			this.destinoService.save(destino);
			System.out.println("save");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getDestinos", method = RequestMethod.GET)
	/* METODO BUSCAR */
	public List<Destino> getDestinos() {
		return this.destinoService.findAll();
	}

	@RequestMapping(value = "/deleteDestinos", method = RequestMethod.POST)
	public void deleteDestino(@RequestBody String destinoJson) throws Exception {
		this.mapper = new ObjectMapper();
		Destino destino = this.mapper.readValue(destinoJson, Destino.class);
		if (destino.getDesId() == 0L) {
			throw new Exception("El Id esta nulo");
		}
		this.destinoService.deleteDestino(destino.getDesId());
	}

	private boolean validate(Destino destino) {
		boolean isValid = true;

		if (destino.getNombre() == "" || destino.getNombre() == null) {
			isValid = false;
		}
		return isValid;
	}
}
