package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.Date;

@Tabla(nombre = "RUTAS")
@XStreamAlias("RUTAS")

public class Rutas implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("idruta") 
	@XStreamAlias("idruta") 
	private String idruta = "" ;
	@Columna
	@SerializedName("descripcion") 
	@XStreamAlias("descripcion") 
	private String descripcion = "" ;
	@Columna
	@SerializedName("kilometros") 
	@XStreamAlias("kilometros") 
	private Double kilometros = 0.00 ;
	@Columna
	@SerializedName("peaje") 
	@XStreamAlias("peaje") 
	private String peaje = "" ;
	@Columna
	@SerializedName("estado") 
	@XStreamAlias("estado") 
	private Double estado = 0.00 ;
	@Columna
	@SerializedName("sincroniza") 
	@XStreamAlias("sincroniza") 
	private String sincroniza = "" ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("valorref") 
	@XStreamAlias("valorref") 
	private Double valorref = 0.00 ;
	@Columna
	@SerializedName("flete") 
	@XStreamAlias("flete") 
	private Double flete = 0.00 ;
	@Columna
	@SerializedName("origen") 
	@XStreamAlias("origen") 
	private String origen = "" ;
	@Columna
	@SerializedName("destino") 
	@XStreamAlias("destino") 
	private String destino = "" ;
	@Columna
	@SerializedName("idcontratotrans") 
	@XStreamAlias("idcontratotrans") 
	private String idcontratotrans = "" ;
	@Columna
	@SerializedName("idopetrans") 
	@XStreamAlias("idopetrans") 
	private String idopetrans = "" ;
	@Columna
	@SerializedName("idclieprov") 
	@XStreamAlias("idclieprov") 
	private String idclieprov = "" ;
	@Columna
	@SerializedName("kmvirtual") 
	@XStreamAlias("kmvirtual") 
	private Double kmvirtual = 0.00 ;
	@Columna
	@SerializedName("origenalterno") 
	@XStreamAlias("origenalterno") 
	private String origenalterno = "" ;
	@Columna
	@SerializedName("destinoalterno") 
	@XStreamAlias("destinoalterno") 
	private String destinoalterno = "" ;
	@Columna
	@SerializedName("exige_guia_confirmacion") 
	@XStreamAlias("exige_guia_confirmacion") 
	private Double exige_guia_confirmacion = 0.00 ;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdruta(String idruta) {
		this.idruta = idruta;
	}

	public String getIdruta() {
		return this.idruta;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setKilometros(Double kilometros) {
		this.kilometros = kilometros;
	}

	public Double getKilometros() {
		return this.kilometros;
	}

	public void setPeaje(String peaje) {
		this.peaje = peaje;
	}

	public String getPeaje() {
		return this.peaje;
	}

	public void setEstado(Double estado) {
		this.estado = estado;
	}

	public Double getEstado() {
		return this.estado;
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

	public void setValorref(Double valorref) {
		this.valorref = valorref;
	}

	public Double getValorref() {
		return this.valorref;
	}

	public void setFlete(Double flete) {
		this.flete = flete;
	}

	public Double getFlete() {
		return this.flete;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setIdcontratotrans(String idcontratotrans) {
		this.idcontratotrans = idcontratotrans;
	}

	public String getIdcontratotrans() {
		return this.idcontratotrans;
	}

	public void setIdopetrans(String idopetrans) {
		this.idopetrans = idopetrans;
	}

	public String getIdopetrans() {
		return this.idopetrans;
	}

	public void setIdclieprov(String idclieprov) {
		this.idclieprov = idclieprov;
	}

	public String getIdclieprov() {
		return this.idclieprov;
	}

	public void setKmvirtual(Double kmvirtual) {
		this.kmvirtual = kmvirtual;
	}

	public Double getKmvirtual() {
		return this.kmvirtual;
	}

	public void setOrigenalterno(String origenalterno) {
		this.origenalterno = origenalterno;
	}

	public String getOrigenalterno() {
		return this.origenalterno;
	}

	public void setDestinoalterno(String destinoalterno) {
		this.destinoalterno = destinoalterno;
	}

	public String getDestinoalterno() {
		return this.destinoalterno;
	}

	public void setExige_guia_confirmacion(Double exige_guia_confirmacion) {
		this.exige_guia_confirmacion = exige_guia_confirmacion;
	}

	public Double getExige_guia_confirmacion() {
		return this.exige_guia_confirmacion;
	}



	/* Sets & Gets FK*/

}