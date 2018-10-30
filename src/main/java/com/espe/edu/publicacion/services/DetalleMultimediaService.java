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

import com.espe.edu.publicacion.model.DetalleMultimedia;

public interface DetalleMultimediaService {

DetalleMultimedia save (DetalleMultimedia detalleMultimedia);
	
	List<DetalleMultimedia> findAll();
	Optional<DetalleMultimedia> findbyId(long detId);
	
	void deleteDetalleMultimedia(long detId);
}
