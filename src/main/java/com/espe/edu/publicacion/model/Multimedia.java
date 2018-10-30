package com.espe.edu.publicacion.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Admini
 *
 */
@Entity
@Table(name = "uzet_eve_multimedia")
public class Multimedia implements Serializable {

	private static final long serialVersionUID = 8367365652613511598L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "MUL_ID", nullable = false)
	private Long mulId;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "OPC_ID", nullable = false)
	private Opcion opcion;

	@Column(name = "MUL_TIPO")
	private String mulTipo;

	@Column(name = "MUL_DESCRIPCION")
	private Date mulDescripcion;

	
	@Column(name = "MUL_USUARIOCREACION")
	private String usuarioCreacion;

	@Column(name = "MUL_FECHAUSUARIOCREACION")
	private Date fechaUsuarioCreacion;

	@Column(name = "MUL_USUARIOMODIFICACION")
	private String usuarioModificacion;

	@Column(name = "MUL_FECHAUSUARIOMODIFICACION")
	private Date fechaUsuarioModificacion;

	/**
	 * @return the mulId
	 */
	public Long getMulId() {
		return mulId;
	}

	/**
	 * @param mulId the mulId to set
	 */
	public void setMulId(Long mulId) {
		this.mulId = mulId;
	}


	/**
	 * @return the opcion
	 */
	public Opcion getOpcion() {
		return opcion;
	}

	/**
	 * @param opcId the opcion to set
	 */
	public void setOpcId(Opcion opcion) {
		this.opcion = opcion;
	}

	/**
	 * @return the mulTipo
	 */
	public String getMulTipo() {
		return mulTipo;
	}

	/**
	 * @param mulTipo the mulTipo to set
	 */
	public void setMulTipo(String mulTipo) {
		this.mulTipo = mulTipo;
	}

	/**
	 * @return the mulDescripcion
	 */
	public Date getMulDescripcion() {
		return mulDescripcion;
	}

	/**
	 * @param mulDescripcion the mulDescripcion to set
	 */
	public void setMulDescripcion(Date mulDescripcion) {
		this.mulDescripcion = mulDescripcion;
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
		return "Multimedia [mulId=" + mulId + ", opcion=" + opcion + ", mulTipo=" + mulTipo
				+ ", mulDescripcion=" + mulDescripcion + ", usuarioCreacion=" + usuarioCreacion
				+ ", fechaUsuarioCreacion=" + fechaUsuarioCreacion + ", usuarioModificacion=" + usuarioModificacion
				+ ", fechaUsuarioModificacion=" + fechaUsuarioModificacion + "]";
	}
	
	/**
	 * @return the mulId
	 */
}

	