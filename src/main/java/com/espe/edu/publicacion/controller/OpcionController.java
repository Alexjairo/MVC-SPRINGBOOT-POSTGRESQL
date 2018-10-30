package com.espe.edu.publicacion.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.espe.edu.publicacion.model.Opcion;
import com.espe.edu.publicacion.services.OpcionService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/sisEventosWs")
	public class OpcionController{
		
		@Autowired
		private OpcionService opcionService;
		private ObjectMapper mapper;
		
		@SuppressWarnings("rawtypes")
		@RequestMapping(value = "/saveOrUpdateOpcion", method = RequestMethod.POST)
		public ResponseEntity saveOrUpdate (@RequestBody String opcionJson)
			throws JsonParseException, JsonMappingException, IOException {
			
			Opcion opcion = new Opcion();
			  this.mapper = new ObjectMapper();
				try {
					opcion=this.mapper.readValue(opcionJson, Opcion.class);
					System.out.println(opcion);
					if (!this.validate (opcion)) {
						return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
						
					}
					this.opcionService.save(opcion);
					return new ResponseEntity(HttpStatus.OK);
				} catch (Exception e) {
					System.out.println(e);				
					return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
				}
				}

	@RequestMapping(value = "/getOpcion", method = RequestMethod.GET)
		/*METODO BUSCAR*/
		public List<Opcion> getOpcion() {
			return this.opcionService.findAll();
		}
		@RequestMapping(value="/deleteOpcion", method = RequestMethod.POST)
		public void deleteOpcion(@RequestBody String opcionJson) 
		throws Exception 
		 {
		this.mapper = new ObjectMapper();
		  Opcion opcion = this.mapper.readValue(opcionJson, Opcion.class);
		   if (opcion.getOpcId()== 0L) {
			   throw new Exception ("El Id esta nulo");
		   }
		this.opcionService.deleteOpcion(opcion.getOpcId());
		}
		 
		private boolean validate(Opcion opcion) {
			boolean isValid = true;

			if (opcion.getNombre() == "" || opcion.getNombre()==null) {
				isValid = false;
			}
			return isValid;
		}
	}