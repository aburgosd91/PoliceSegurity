package com.nisira.core.entity;

import java.util.Date;

public class Numemisor {
	private String idbasedatos;
	
	private String idempresa;
	
	private String idemisor;
	
	private String iddocumento;
	
	private String serie;
	
	private String numero;
	
	private Float estado;
	
	private Float es_importacion;
	
	private String sincroniza;
	
	private Date fechacreacion;
	
	private Float nlineas;
	
	private String observacion;
	
	private String idtipoventa;
	
	private Float paradeclaracion_ce;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdemisor(String idemisor) {
		this.idemisor = idemisor;
	}

	public String getIdemisor() {
		return this.idemisor;
	}

	public void setIddocumento(String iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getIddocumento() {
		return this.iddocumento;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setEstado(Float estado) {
		this.estado = estado;
	}

	public Float getEstado() {
		return this.estado;
	}

	public void setEs_importacion(Float es_importacion) {
		this.es_importacion = es_importacion;
	}

	public Float getEs_importacion() {
		return this.es_importacion;
	}

	public void setSincroniza(String sincroniza) {
		this.sincroniza = sincroniza;
	}

	public String getSincroniza() {
		return this.sincroniza;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setNlineas(Float nlineas) {
		this.nlineas = nlineas;
	}

	public Float getNlineas() {
		return this.nlineas;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setIdtipoventa(String idtipoventa) {
		this.idtipoventa = idtipoventa;
	}

	public String getIdtipoventa() {
		return this.idtipoventa;
	}

	public void setParadeclaracion_ce(Float paradeclaracion_ce) {
		this.paradeclaracion_ce = paradeclaracion_ce;
	}

	public Float getParadeclaracion_ce() {
		return this.paradeclaracion_ce;
	}



	/* Sets & Gets FK*/

    /**
     * @return the idbasedatos
     */
    public String getIdbasedatos() {
        return idbasedatos;
    }

    /**
     * @param idbasedatos the idbasedatos to set
     */
    public void setIdbasedatos(String idbasedatos) {
        this.idbasedatos = idbasedatos;
    }

}