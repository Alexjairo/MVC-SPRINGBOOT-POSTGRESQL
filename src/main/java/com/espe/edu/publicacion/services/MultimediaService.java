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

import com.espe.edu.publicacion.model.Multimedia;


public interface MultimediaService{
	
	Multimedia save (Multimedia multimedia);
	
	List<Multimedia> findAll();
	Optional<Multimedia> findbyId(long mulId);
	
	void deleteMultimedia(long mulId);
}