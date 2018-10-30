/**
 * 
 */
package com.espe.edu.publicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.publicacion.model.Publicaciones;

/**
 * @author Admini
 *
 */
public interface PublicacionesDao extends JpaRepository<Publicaciones, Long> {

/*
	@Query("select d from Destino d where d.id = :desId")
	List<Destino> findByDestinoIdReturnStream(@Param("desId") Long desId);
	
*/

	@SuppressWarnings("unchecked")
	Publicaciones save (Publicaciones getPublicaciones);
	
}
