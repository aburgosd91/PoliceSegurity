package com.nisira.core.entity;

import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

import java.util.Date;
import java.util.ArrayList;

@Tabla(nombre = "ESTADOS")
@XStreamAlias("ESTADOS")

public class Estados implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idestado") 
	@XStreamAlias("idestado") 
	private String idestado = "" ;
	@Columna
	@SerializedName("descripcion") 
	@XStreamAlias("descripcion") 
	private String descripcion = "" ;
	@Columna
	@SerializedName("orden") 
	@XStreamAlias("orden") 
	private Double orden = 0.00 ;
	@Columna
	@SerializedName("verflujo") 
	@XStreamAlias("verflujo") 
	private Double verflujo = 0.00 ;
	@Columna
	@SerializedName("accion") 
	@XStreamAlias("accion") 
	private String accion = "" ;
	@Columna
	@SerializedName("sincroniza") 
	@XStreamAlias("sincroniza") 
	private String sincroniza = "" ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("color") 
	@XStreamAlias("color") 
	private String color = "" ;



	/* Sets & Gets */
	public void setIdestado(String idestado) {
		this.idestado = idestado;
	}

	public String getIdestado() {
		return this.idestado;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setOrden(Double orden) {
		this.orden = orden;
	}

	public Double getOrden() {
		return this.orden;
	}

	public void setVerflujo(Double verflujo) {
		this.verflujo = verflujo;
	}

	public Double getVerflujo() {
		return this.verflujo;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getAccion() {
		return this.accion;
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

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}



	/* Sets & Gets FK*/

}