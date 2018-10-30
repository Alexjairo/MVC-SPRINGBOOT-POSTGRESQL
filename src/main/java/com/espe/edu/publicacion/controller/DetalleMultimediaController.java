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

//import org.springframework.web.bind.annotation.RestController;
import com.espe.edu.publicacion.model.DetalleMultimedia;
import com.espe.edu.publicacion.services.DetalleMultimediaService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/sisEventosWs")
public class DetalleMultimediaController {

	@Autowired
	private DetalleMultimediaService detalleMultimediaService;
	private ObjectMapper mapper;

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/saveOrUpdateDetalleMultimedia", method = RequestMethod.POST)
	public ResponseEntity saveOrUpdate(@RequestBody String detalleMultimediaJson)
			throws JsonParseException, JsonMappingException, IOException {

		DetalleMultimedia detalleMultimedia = new DetalleMultimedia();
		this.mapper = new ObjectMapper();
		try {
			detalleMultimedia = this.mapper.readValue(detalleMultimediaJson, DetalleMultimedia.class);
			System.out.println(detalleMultimedia);
			if (!this.validate(detalleMultimedia)) {
				return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			}
			this.detalleMultimediaService.save(detalleMultimedia);
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getDetalleMultimedia", method = RequestMethod.GET)
	/* METODO BUSCAR */
	public List<DetalleMultimedia> getDetalleMultimedia() {
		return this.detalleMultimediaService.findAll();
	}

	@RequestMapping(value = "/deleteDetalleMultimedia", method = RequestMethod.POST)
	public void deleteDetalleMultimedia(@RequestBody String detalleMultimediaJson) throws Exception {
		this.mapper = new ObjectMapper();
		DetalleMultimedia detalleMultimedia = this.mapper.readValue(detalleMultimediaJson, DetalleMultimedia.class);
		if (detalleMultimedia.getDetId() == 0L) {
			throw new Exception("El Id esta nulo");
		}
		this.detalleMultimediaService.deleteDetalleMultimedia(detalleMultimedia.getDetId());
	}

	private boolean validate(DetalleMultimedia detalleMultimedia) {
		boolean isValid = true;

		if (detalleMultimedia.getNombreArchivo() == "" || detalleMultimedia.getNombreArchivo() == null) {
			isValid = false;
		}
		return isValid;
	}
}
