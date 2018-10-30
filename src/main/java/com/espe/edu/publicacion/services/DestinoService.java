/**
 * 
 */
/**
 * @author Admini
 *
 */
package com.espe.edu.publicacion.services;

import java.util.List;

import java.util.Optional;

import com.espe.edu.publicacion.model.Destino;

public interface DestinoService{
	
	Destino save (Destino destino);
	
	List<Destino> findAll();
	Optional<Destino> findbyId(long desId);
	
	void deleteDestino(long desId);
}