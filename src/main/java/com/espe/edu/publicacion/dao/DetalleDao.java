/**
 * 
 */
package com.espe.edu.publicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.espe.edu.publicacion.model.DetalleMultimedia;

/**
 * @author Admini
 *
 */
public interface DetalleDao extends JpaRepository<DetalleMultimedia, Long> {
	/*
	@Query("select dm from DetalleMultimedia dm")
	Stream<DetalleMultimedia> findByDetalleIdReturnStream(@Param("detId") Long detId);
*/

	@SuppressWarnings("unchecked")
 DetalleMultimedia save (DetalleMultimedia gestionDetalle);
	
}