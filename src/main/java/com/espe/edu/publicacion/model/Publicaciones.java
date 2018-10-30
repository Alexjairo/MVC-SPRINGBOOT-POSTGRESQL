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
@Table(name = "uzet_eve_publicaciones")
public class Publicaciones implements Serializable {

	private static final long serialVersionUID = 8367365652613511598L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "PUB_ID", nullable = false)
	private Long pubId;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "DES_ID")
	private Destino destino;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "MUL_ID")
	private Multimedia multimedia;

	

	@NotNull
	@ManyToOne
	@JoinColumn(name = "TIP_PUB_ID")
	private TipoPublicaciones tipoPublicaciones;

	@Column(name = "PUB_NOMBRE")
	private String pubNombre;
	
	@Column(name = "PUB_TEXTO")
	private String pubTexto;

	@Column(name = "PUB_FECHA")
	private Date pubFecha;

	@Column(name = "PUB_PRIORIDAD")
	private String pubPrioridad;

	@Column(name = "PUB_TIPO")
	private String pubTipo;

	@Column(name = "PUB_ESTADO")
	private String pubEstado;

	@Column(name = "PUB_USUARIOCREACION")
	private String usuarioCreacion;

	@Column(name = "PUB_FECHAUSUARIOCREACION")
	private Date fechaUsuarioCreacion;

	@Column(name = "PUB_USUARIOMODIFICACION")
	private String usuarioModificacion;

	@Column(name = "PUB_FECHAUSUARIOMODIFICACION")
	private Date fechaUsuarioModificacion;

	/**
	 * @return the pubId
	 */
	public Long getPubId() {
		return pubId;
	}

	/**
	 * @param pubId the pubId to set
	 */
	public void setPubId(Long pubId) {
		this.pubId = pubId;
	}

	/**
	 * @return the destino
	 */
	public Destino getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	/**
	 * @return the multimedia
	 */
	public Multimedia getMultimedia() {
		return multimedia;
	}

	/**
	 * @param multimedia the multimedia to set
	 */
	public void setMutimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	/**
	 * @return the tipoPublicaciones
	 */
	public TipoPublicaciones getTipoPublicaciones() {
		return tipoPublicaciones;
	}

	/**
	 * @param tipoPublicaciones the tipoPublicaciones to set
	 */
	public void setTipPubId(TipoPublicaciones tipoPublicaciones) {
		this.tipoPublicaciones = tipoPublicaciones;
	}

	/**
	 * @return the pubNombre
	 */
	public String getPubNombre() {
		return pubNombre;
	}

	/**
	 * @param pubNombre the pubNombre to set
	 */
	public void setPubNombre(String pubNombre) {
		this.pubNombre = pubNombre;
	}

	/**
	 * @return the pubTexto
	 */
	public String getPubTexto() {
		return pubTexto;
	}

	/**
	 * @param pubTexto the pubTexto to set
	 */
	public void setPubTexto(String pubTexto) {
		this.pubTexto = pubTexto;
	}

	/**
	 * @return the pubFecha
	 */
	public Date getPubFecha() {
		return pubFecha;
	}

	/**
	 * @param pubFecha the pubFecha to set
	 */
	public void setPubFecha(Date pubFecha) {
		this.pubFecha = pubFecha;
	}

	/**
	 * @return the pubPrioridad
	 */
	public String getPubPrioridad() {
		return pubPrioridad;
	}

	/**
	 * @param pubPrioridad the pubPrioridad to set
	 */
	public void setPubPrioridad(String pubPrioridad) {
		this.pubPrioridad = pubPrioridad;
	}

	/**
	 * @return the pubTipo
	 */
	public String getPubTipo() {
		return pubTipo;
	}

	/**
	 * @param pubTipo the pubTipo to set
	 */
	public void setPubTipo(String pubTipo) {
		this.pubTipo = pubTipo;
	}

	/**
	 * @return the pubEstado
	 */
	public String getPubEstado() {
		return pubEstado;
	}

	/**
	 * @param pubEstado the pubEstado to set
	 */
	public void setPubEstado(String pubEstado) {
		this.pubEstado = pubEstado;
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
		return "Publicaciones [pubId=" + pubId + ", destino=" + destino + ", multimedia=" + multimedia + ", tipoPublicaciones=" + tipoPublicaciones
				+ ", pubNombre=" + pubNombre + ", pubTexto=" + pubTexto + ", pubFecha=" + pubFecha + ", pubPrioridad="
				+ pubPrioridad + ", pubTipo=" + pubTipo + ", pubEstado=" + pubEstado + ", usuarioCreacion="
				+ usuarioCreacion + ", fechaUsuarioCreacion=" + fechaUsuarioCreacion + ", usuarioModificacion="
				+ usuarioModificacion + ", fechaUsuarioModificacion=" + fechaUsuarioModificacion + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @return the pubId
	 */

}
