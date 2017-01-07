package com.nisira.core.entitybase;

import java.util.Date;

public class Rutas {
	
	private String idempresa;
	
	private String idruta;
	
	private String descripcion;
	
	private Float kilometros;
	
	private String peaje;
	
	private int estado;
	
	private String sincroniza;
	
	private Date fechacreacion;
	
	private Float valorref;
	
	private Float flete;
	
	private String origen;
	
	private String destino;
	
	private String idcontratotrans;
	
	private String idopetrans;
	
	private String idclieprov;
	
	private Float kmvirtual;
	
	private String origenalterno;
	
	private String destinoalterno;
	
	private Float exige_guia_confirmacion;



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

	public void setKilometros(Float kilometros) {
		this.kilometros = kilometros;
	}

	public Float getKilometros() {
		return this.kilometros;
	}

	public void setPeaje(String peaje) {
		this.peaje = peaje;
	}

	public String getPeaje() {
		return this.peaje;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getEstado() {
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

	public void setValorref(Float valorref) {
		this.valorref = valorref;
	}

	public Float getValorref() {
		return this.valorref;
	}

	public void setFlete(Float flete) {
		this.flete = flete;
	}

	public Float getFlete() {
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

	public void setKmvirtual(Float kmvirtual) {
		this.kmvirtual = kmvirtual;
	}

	public Float getKmvirtual() {
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

	public void setExige_guia_confirmacion(Float exige_guia_confirmacion) {
		this.exige_guia_confirmacion = exige_guia_confirmacion;
	}

	public Float getExige_guia_confirmacion() {
		return this.exige_guia_confirmacion;
	}



	/* Sets & Gets FK*/

}