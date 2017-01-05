package com.nisira.core.entity;

import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

import java.util.Date;
import java.util.ArrayList;

@Tabla(nombre = "GEOPOINT")
@XStreamAlias("GEOPOINT")

public class Geopoint implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idgeopoint") 
	@XStreamAlias("idgeopoint") 
	private Integer idgeopoint;
	@Columna
	@SerializedName("descripcion") 
	@XStreamAlias("descripcion") 
	private String descripcion = "" ;
	@Columna
	@SerializedName("latitud") 
	@XStreamAlias("latitud") 
	private Float latitud;
	@Columna
	@SerializedName("longitud") 
	@XStreamAlias("longitud") 
	private Float longitud;
	@Columna
	@SerializedName("idclieprov") 
	@XStreamAlias("idclieprov") 
	private String idclieprov = "" ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("estado") 
	@XStreamAlias("estado") 
	private Integer estado;



	/* Sets & Gets */
	public void setIdgeopoint(Integer idgeopoint) {
		this.idgeopoint = idgeopoint;
	}

	public Integer getIdgeopoint() {
		return this.idgeopoint;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}

	public Float getLatitud() {
		return this.latitud;
	}

	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}

	public Float getLongitud() {
		return this.longitud;
	}

	public void setIdclieprov(String idclieprov) {
		this.idclieprov = idclieprov;
	}

	public String getIdclieprov() {
		return this.idclieprov;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getEstado() {
		return this.estado;
	}



	/* Sets & Gets FK*/

}