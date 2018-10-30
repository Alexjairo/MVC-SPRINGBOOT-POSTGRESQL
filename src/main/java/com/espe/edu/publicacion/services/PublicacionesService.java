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

import com.espe.edu.publicacion.model.Publicaciones;

public interface PublicacionesService{
	
	Publicaciones save (Publicaciones publicaciones);
	
	List<Publicaciones> findAll();
	Optional<Publicaciones> findbyId(long pubId);
	
	void deletePublicaciones(long pubId);
}