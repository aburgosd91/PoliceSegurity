package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.Date;

@Tabla(nombre = "NUMEMISOR")
@XStreamAlias("NUMEMISOR")

public class Numemisor implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("idemisor") 
	@XStreamAlias("idemisor") 
	private String idemisor = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("iddocumento") 
	@XStreamAlias("iddocumento") 
	private String iddocumento = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("serie") 
	@XStreamAlias("serie") 
	private String serie = "" ;
	@Columna
	@SerializedName("numero") 
	@XStreamAlias("numero") 
	private String numero = "" ;
	@Columna
	@SerializedName("estado") 
	@XStreamAlias("estado") 
	private Double estado = 0.00 ;
	@Columna
	@SerializedName("es_importacion") 
	@XStreamAlias("es_importacion") 
	private Double es_importacion = 0.00 ;
	@Columna
	@SerializedName("sincroniza") 
	@XStreamAlias("sincroniza") 
	private String sincroniza = "" ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("nlineas") 
	@XStreamAlias("nlineas") 
	private Double nlineas = 0.00 ;
	@Columna
	@SerializedName("observacion") 
	@XStreamAlias("observacion") 
	private String observacion = "" ;
	@Columna
	@SerializedName("idtipoventa") 
	@XStreamAlias("idtipoventa") 
	private String idtipoventa = "" ;
	@Columna
	@SerializedName("paradeclaracion_ce") 
	@XStreamAlias("paradeclaracion_ce") 
	private Double paradeclaracion_ce = 0.00 ;



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

	public void setEstado(Double estado) {
		this.estado = estado;
	}

	public Double getEstado() {
		return this.estado;
	}

	public void setEs_importacion(Double es_importacion) {
		this.es_importacion = es_importacion;
	}

	public Double getEs_importacion() {
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

	public void setNlineas(Double nlineas) {
		this.nlineas = nlineas;
	}

	public Double getNlineas() {
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

	public void setParadeclaracion_ce(Double paradeclaracion_ce) {
		this.paradeclaracion_ce = paradeclaracion_ce;
	}

	public Double getParadeclaracion_ce() {
		return this.paradeclaracion_ce;
	}



	/* Sets & Gets FK*/

}