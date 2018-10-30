
package com.espe.edu.publicacion.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admini
 *
 */
@Entity
@Table(name = "uzet_eve_opcion")
public class Opcion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8367365652613511598L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "OPC_ID", nullable = false)
	private Long opcId;
	
	@Column(name = "OPC_NOMBRE")
	private String nombre;
	
	@Column(name = "OPC_USUARIOCREACION")
    private String usuarioCreacion;
	
	@Column(name = "OPC_FECHAUSUARIOCREACION")
	private Date fechaUsuarioCreacion;
	
	@Column(name = "OPC_USUARIOMODIFICACION")
    private String usuarioModificacion;
	
    @Column(name = "OPC_FECHAUSUARIOMODIFICACION")
    private Date fechaUsuarioModificacion;

	/**
	 * @return the opcId
	 */
	public Long getOpcId() {
		return opcId;
	}

	/**
	 * @param opcId the opcId to set
	 */
	public void setOpcId(Long opcId) {
		this.opcId = opcId;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the usuarioCreacion
	 */
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	/**
	 * @param usuarioCreacion the usuarioCreacion to set
	 */
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	/**
	 * @return the fechaUsuarioCreacion
	 */
	public Date getFechaUsuarioCreacion() {
		return fechaUsuarioCreacion;
	}

	/**
	 * @param fechaUsuarioCreacion the fechaUsuarioCreacion to set
	 */
	public void setFechaUsuarioCreacion(Date fechaUsuarioCreacion) {
		this.fechaUsuarioCreacion = fechaUsuarioCreacion;
	}

	/**
	 * @return the usuarioModificacion
	 */
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	/**
	 * @param usuarioModificacion the usuarioModificacion to set
	 */
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	/**
	 * @return the fechaUsuarioModificacion
	 */
	public Date getFechaUsuarioModificacion() {
		return fechaUsuarioModificacion;
	}

	/**
	 * @param fechaUsuarioModificacion the fechaUsuarioModificacion to set
	 */
	public void setFechaUsuarioModificacion(Date fechaUsuarioModificacion) {
		this.fechaUsuarioModificacion = fechaUsuarioModificacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Opcion [opcId=" + opcId + ", nombre=" + nombre + ", usuarioCreacion=" + usuarioCreacion
				+ ", fechaUsuarioCreacion=" + fechaUsuarioCreacion + ", usuarioModificacion=" + usuarioModificacion
				+ ", fechaUsuarioModificacion=" + fechaUsuarioModificacion + "]";
	}

	
	/**
	 * @return the opcId
	 */
	
}