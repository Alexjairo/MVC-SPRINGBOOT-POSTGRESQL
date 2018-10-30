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
@Table(name = "uzet_eve_Tipo_publicaciones")
public class TipoPublicaciones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8367365652613511598L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "TIP_PUB_ID", nullable = false)
	private Long tipPubId;
	
	@Column(name = "TIP_PUB_NOMBRE")
	private String nombre;
	
	@Column(name = "TIP_PUB_ESTADO")
    private String estado;
	
	@Column(name = "TIP_PUB_USUARIOCREACION")
	private String usuarioCreacion;
	
	@Column(name = "TIP_PUB_FECHAUSUARIOCREACION")
    private Date fechaUsuarioCreacion;
	
    @Column(name = "TIP_PUB_USUARIOMODIFICACION")
    private String usuarioModificacion;
    
    @Column(name = "TIP_PUB_FECHAUSUARIOMODIFICACION")
    private Date fechaUsuarioModificacion;

	/**
	 * @return the tipPubId
	 */
	public Long getTipPubId() {
		return tipPubId;
	}

	/**
	 * @param tipPubId the tipPubId to set
	 */
	public void setTipPubId(Long tipPubId) {
		this.tipPubId = tipPubId;
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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
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
		return "TipoPublicaciones [tipPubId=" + tipPubId + ", nombre=" + nombre + ", estado=" + estado
				+ ", usuarioCreacion=" + usuarioCreacion + ", fechaUsuarioCreacion=" + fechaUsuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaUsuarioModificacion="
				+ fechaUsuarioModificacion + "]";
	}

	
	/**
	 * @return the tipPubId
	 */
	
}
