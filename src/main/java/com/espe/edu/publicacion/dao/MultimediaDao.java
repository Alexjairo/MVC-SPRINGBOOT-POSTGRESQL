/**
 * 
 */
package com.espe.edu.publicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.publicacion.model.Multimedia;

/**
 * @author Admini
 *
 */
public interface MultimediaDao extends JpaRepository<Multimedia, Long> {

/*
	@Query("select d from Destino d where d.id = :desId")
	List<Destino> findByDestinoIdReturnStream(@Param("desId") Long desId);
	
*/

	@SuppressWarnings("unchecked")
	Multimedia save (Multimedia gestionMultimedia);
	
}
