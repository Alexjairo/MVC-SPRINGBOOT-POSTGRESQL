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
@Table(name = "uzet_eve_detalle")
public class DetalleMultimedia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8367365652613511598L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "DET_ID", nullable = false)
	private Long detId;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "MUL_ID")
	private Multimedia multimedia;
	
	@Column(name = "DET_FILE_NOMBRE")
	private String nombreArchivo;	
	
	@Column(name = "DET_FILE_TIPO")
    private String detFileTipo;
	
	@Column(name = "DET_FILE_SIZE")
	private Float detFileSize;
	
	@Column(name = "DET_USUARIOCREACION")
    private String usuarioCreacion;
	
	
    @Column(name = "DET_FECHAUSUARIOCREACION")
    private Date fechaUsuarioCreacion;
    
    @Column(name = "DET_USUARIOMODIFICACION")
    private String usuarioModificacion;
    
    @Column(name = "DET_FECHAUSUARIOMODIFICACION")
    private Date fechaUsuarioModificacion;
    
    @Column(name = "DET_ARCHIVO")
    private String archivo;
    
    @Column(name = "DET_URL")
    private String url;

	/**
	 * @return the detId
	 */
	public Long getDetId() {
		return detId;
	}

	/**
	 * @param detId the detId to set
	 */
	public void setDetId(Long detId) {
		this.detId = detId;
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
	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	/**
	 * @return the nombreArchivo
	 */
	public String getNombreArchivo() {
		return nombreArchivo;
	}

	/**
	 * @param nombreArchivo the nombreArchivo to set
	 */
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	/**
	 * @return the detFileTipo
	 */
	public String getDetFileTipo() {
		return detFileTipo;
	}

	/**
	 * @param detFileTipo the detFileTipo to set
	 */
	public void setDetFileTipo(String detFileTipo) {
		this.detFileTipo = detFileTipo;
	}

	/**
	 * @return the detFileSize
	 */
	public Float getDetFileSize() {
		return detFileSize;
	}

	/**
	 * @param detFileSize the detFileSize to set
	 */
	public void setDetFileSize(Float detFileSize) {
		this.detFileSize = detFileSize;
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

	/**
	 * @return the archivo
	 */
	public String getArchivo() {
		return archivo;
	}

	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DetalleMultimedia [detId=" + detId + ", multimedia=" + multimedia + ", nombreArchivo=" + nombreArchivo
				+ ", detFileTipo=" + detFileTipo + ", detFileSize=" + detFileSize + ", usuarioCreacion="
				+ usuarioCreacion + ", fechaUsuarioCreacion=" + fechaUsuarioCreacion + ", usuarioModificacion="
				+ usuarioModificacion + ", fechaUsuarioModificacion=" + fechaUsuarioModificacion + ", archivo="
				+ archivo + ", url=" + url + "]";
	}


    
}
