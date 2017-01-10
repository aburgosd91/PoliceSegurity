package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.Date;

@Tabla(nombre = "PERSONAL_SERVICIO")
@XStreamAlias("PERSONAL_SERVICIO")

public class Personal_servicio implements Serializable {
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@Columna
	@SerializedName("idordenservicio") 
	@XStreamAlias("idordenservicio") 
	private String idordenservicio = "" ;
	@Columna
	@SerializedName("item") 
	@XStreamAlias("item") 
	private String item = "" ;
	@Columna
	@SerializedName("idpersonal") 
	@XStreamAlias("idpersonal") 
	private String idpersonal = "" ;
	@Columna
	@SerializedName("dni") 
	@XStreamAlias("dni") 
	private String dni = "" ;
	@Columna
	@SerializedName("nombres") 
	@XStreamAlias("nombres") 
	private String nombres = "" ;
	@Columna
	@SerializedName("hora_req") 
	@XStreamAlias("hora_req") 
	private Double hora_req = 0.00 ;
	@Columna
	@SerializedName("hora_llegada") 
	@XStreamAlias("hora_llegada") 
	private Double hora_llegada = 0.00 ;
	@Columna
	@SerializedName("hora_inicio_serv") 
	@XStreamAlias("hora_inicio_serv") 
	private Double hora_inicio_serv = 0.00 ;
	@Columna
	@SerializedName("hora_fin_serv") 
	@XStreamAlias("hora_fin_serv") 
	private Double hora_fin_serv = 0.00 ;
	@Columna
	@SerializedName("hora_liberacion") 
	@XStreamAlias("hora_liberacion") 
	private Double hora_liberacion = 0.00 ;
	@Columna
	@SerializedName("idcargo") 
	@XStreamAlias("idcargo") 
	private String idcargo = "" ;
	@Columna
	@SerializedName("fecharegistro") 
	@XStreamAlias("fecharegistro") 
	private Date fecharegistro;
	@Columna
	@SerializedName("fechaoperacion") 
	@XStreamAlias("fechaoperacion") 
	private Date fechaoperacion;



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

	public void setItem(String item) {
		this.item = item;
	}

	public String getItem() {
		return this.item;
	}

	public void setIdpersonal(String idpersonal) {
		this.idpersonal = idpersonal;
	}

	public String getIdpersonal() {
		return this.idpersonal;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setHora_req(Double hora_req) {
		this.hora_req = hora_req;
	}

	public Double getHora_req() {
		return this.hora_req;
	}

	public void setHora_llegada(Double hora_llegada) {
		this.hora_llegada = hora_llegada;
	}

	public Double getHora_llegada() {
		return this.hora_llegada;
	}

	public void setHora_inicio_serv(Double hora_inicio_serv) {
		this.hora_inicio_serv = hora_inicio_serv;
	}

	public Double getHora_inicio_serv() {
		return this.hora_inicio_serv;
	}

	public void setHora_fin_serv(Double hora_fin_serv) {
		this.hora_fin_serv = hora_fin_serv;
	}

	public Double getHora_fin_serv() {
		return this.hora_fin_serv;
	}

	public void setHora_liberacion(Double hora_liberacion) {
		this.hora_liberacion = hora_liberacion;
	}

	public Double getHora_liberacion() {
		return this.hora_liberacion;
	}

	public void setIdcargo(String idcargo) {
		this.idcargo = idcargo;
	}

	public String getIdcargo() {
		return this.idcargo;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFechaoperacion(Date fechaoperacion) {
		this.fechaoperacion = fechaoperacion;
	}

	public Date getFechaoperacion() {
		return this.fechaoperacion;
	}



	/* Sets & Gets FK*/

}