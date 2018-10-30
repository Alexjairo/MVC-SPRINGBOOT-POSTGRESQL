/**
 * 
 */
package com.espe.edu.publicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.publicacion.model.Destino;

/**
 * @author Admini
 *
 */
public interface DestinoDao extends JpaRepository<Destino, Long> {

/*
	@Query("select d from Destino d where d.id = :desId")
	List<Destino> findByDestinoIdReturnStream(@Param("desId") Long desId);
	
*/

	@SuppressWarnings("unchecked")
Destino save (Destino gestionDestino);
	
}
