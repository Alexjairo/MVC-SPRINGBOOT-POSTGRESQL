/**
 * 
 */
package com.espe.edu.publicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.espe.edu.publicacion.model.TipoPublicaciones;

/**
 * @author Admini
 *
 */
public interface TipoPublicacionesDao extends JpaRepository<TipoPublicaciones, Long> {

/*
	@Query("select d from Destino d where d.id = :desId")
	List<Destino> findByDestinoIdReturnStream(@Param("desId") Long desId);
	
*/

	@SuppressWarnings("unchecked")
TipoPublicaciones save (TipoPublicaciones tipoPublicaciones);
	
}
