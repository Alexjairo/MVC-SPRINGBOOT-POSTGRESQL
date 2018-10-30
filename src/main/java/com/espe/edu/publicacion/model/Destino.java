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
@Table(name = "uzet_eve_Destino")
public class Destino implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8367365652613511598L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "DES_ID", nullable = false)
	private Long desId;
	
	@Column(name = "DES_NOMBRE")
	private String nombre;
	
	@Column(name = "DES_USUARIOCREACION")
    private String usuarioCreacion;
	
	@Column(name = "DES_FECHAUSUARIOCREACION")
	private Date fechaUsuarioCreacion;
	
	@Column(name = "DES_USUARIOMODIFICACION")
    private String usuarioModificacion;
	
    @Column(name = "DES_FECHAUSUARIOMODIFICACION")
    private Date fechaUsuarioModificacion;

	/**
	 * @return the desId
	 */
	public Long getDesId() {
		return desId;
	}

	/**
	 * @param desId the desId to set
	 */
	public void setDesId(Long desId) {
		this.desId = desId;
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
		return "Destino [desId=" + desId + ", nombre=" + nombre + ", usuarioCreacion=" + usuarioCreacion
				+ ", fechaUsuarioCreacion=" + fechaUsuarioCreacion + ", usuarioModificacion=" + usuarioModificacion
				+ ", fechaUsuarioModificacion=" + fechaUsuarioModificacion + "]";
	}


	/**
	 * @return the desId
	 */
	
}

