package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

@Tabla(nombre = "USUARIO")
@XStreamAlias("USUARIO")

public class Usuario implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idbasedatos")
	@XStreamAlias("idbasedatos")
	private String idbasedatos = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("idempresa")
	@XStreamAlias("idempresa")
	private String idempresa = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("idusuario")
	@XStreamAlias("idusuario")
	private String idusuario = "" ;
	@Columna
	@SerializedName("idvendedor")
	@XStreamAlias("idvendedor")
	private String idvendedor = "" ;
	@Columna
	@SerializedName("usr_nombres")
	@XStreamAlias("usr_nombres")
	private String usr_nombres = "" ;
	@Columna
	@SerializedName("password")
	@XStreamAlias("password")
	private String password = "" ;
	@Columna
	@SerializedName("estado")
	@XStreamAlias("estado")
	private Double estado = 0.00 ;



	/* Sets & Gets */
	public void setIdbasedatos(String idbasedatos) {
		this.idbasedatos = idbasedatos;
	}

	public String getIdbasedatos() {
		return this.idbasedatos;
	}

	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getIdusuario() {
		return this.idusuario;
	}

	public void setIdvendedor(String idvendedor) {
		this.idvendedor = idvendedor;
	}

	public String getIdvendedor() {
		return this.idvendedor;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setEstado(Double estado) {
		this.estado = estado;
	}

	public Double getEstado() {
		return this.estado;
	}

	public String getUsr_nombres() {
		return usr_nombres;
	}

	public void setUsr_nombres(String usr_nombres) {
		this.usr_nombres = usr_nombres;
	}



	/* Sets & Gets FK*/

}