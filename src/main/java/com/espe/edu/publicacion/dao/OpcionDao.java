/**
 * 
 */
package com.espe.edu.publicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.espe.edu.publicacion.model.Opcion;

/**
 * @author Admini
 *
 */
public interface OpcionDao extends JpaRepository<Opcion, Long>{
	/*
	@Query("select o from Opcion o")
	Stream<Opcion> findByOpcionIdReturnStream(@Param("opcId") Long detId);
*/
	
	@SuppressWarnings("unchecked")
    Opcion save (Opcion gestionOpcion);
}
