package com.nisira.core.entity;

import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

import java.util.Date;
import java.util.ArrayList;

@Tabla(nombre = "ORDENSERVICIOCLIENTE")
@XStreamAlias("ORDENSERVICIOCLIENTE")

public class Ordenserviciocliente implements Serializable {
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@Columna
	@SerializedName("idordenservicio") 
	@XStreamAlias("idordenservicio") 
	private String idordenservicio = "" ;
	@Columna
	@SerializedName("iddocumento") 
	@XStreamAlias("iddocumento") 
	private String iddocumento = "" ;
	@Columna
	@SerializedName("serie") 
	@XStreamAlias("serie") 
	private String serie = "" ;
	@Columna
	@SerializedName("numero") 
	@XStreamAlias("numero") 
	private String numero = "" ;
	@Columna
	@SerializedName("nromanual") 
	@XStreamAlias("nromanual") 
	private String nromanual = "" ;
	@Columna
	@SerializedName("idclieprov") 
	@XStreamAlias("idclieprov") 
	private String idclieprov = "" ;
	@Columna
	@SerializedName("fecha") 
	@XStreamAlias("fecha") 
	private Date fecha;
	@Columna
	@SerializedName("tipo_servicio") 
	@XStreamAlias("tipo_servicio") 
	private String tipo_servicio = "" ;
	@Columna
	@SerializedName("ambito_servicio") 
	@XStreamAlias("ambito_servicio") 
	private String ambito_servicio = "" ;
	@Columna
	@SerializedName("idestado") 
	@XStreamAlias("idestado") 
	private String idestado = "" ;
	@Columna
	@SerializedName("sincroniza") 
	@XStreamAlias("sincroniza") 
	private String sincroniza = "" ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("nrocontenedor") 
	@XStreamAlias("nrocontenedor") 
	private String nrocontenedor = "" ;
	@Columna
	@SerializedName("nroprecinto") 
	@XStreamAlias("nroprecinto") 
	private String nroprecinto = "" ;
	@Columna
	@SerializedName("nro_oservicio") 
	@XStreamAlias("nro_oservicio") 
	private String nro_oservicio = "" ;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdordenservicio(String idordenservicio) {
		this.idordenservicio = idordenservicio;
	}

	public String getIdordenservicio() {
		return this.idordenservicio;
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

	public void setNromanual(String nromanual) {
		this.nromanual = nromanual;
	}

	public String getNromanual() {
		return this.nromanual;
	}

	public void setIdclieprov(String idclieprov) {
		this.idclieprov = idclieprov;
	}

	public String getIdclieprov() {
		return this.idclieprov;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	public String getTipo_servicio() {
		return this.tipo_servicio;
	}

	public void setAmbito_servicio(String ambito_servicio) {
		this.ambito_servicio = ambito_servicio;
	}

	public String getAmbito_servicio() {
		return this.ambito_servicio;
	}

	public void setIdestado(String idestado) {
		this.idestado = idestado;
	}

	public String getIdestado() {
		return this.idestado;
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

	public void setNrocontenedor(String nrocontenedor) {
		this.nrocontenedor = nrocontenedor;
	}

	public String getNrocontenedor() {
		return this.nrocontenedor;
	}

	public void setNroprecinto(String nroprecinto) {
		this.nroprecinto = nroprecinto;
	}

	public String getNroprecinto() {
		return this.nroprecinto;
	}

	public void setNro_oservicio(String nro_oservicio) {
		this.nro_oservicio = nro_oservicio;
	}

	public String getNro_oservicio() {
		return this.nro_oservicio;
	}



	/* Sets & Gets FK*/

}