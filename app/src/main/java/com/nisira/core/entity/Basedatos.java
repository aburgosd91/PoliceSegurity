package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("BASEDATOS")
public class Basedatos implements Serializable {
	@SerializedName("idbasedatos") 
	@XStreamAlias("idbasedatos") 
	private String idbasedatos = "" ;
	@SerializedName("idbasedatosconexion")
	@XStreamAlias("idbasedatosconexion") 
	private String idbasedatosconexion = "" ;
	@SerializedName("wsurl") 
	@XStreamAlias("wsurl") 
	private String wsurl = "" ;
	@SerializedName("es_wsnisira") 
	@XStreamAlias("es_wsnisira") 
	private Double es_wsnisira = 0.00 ;
	@SerializedName("habilitado") 
	@XStreamAlias("habilitado") 
	private Double habilitado = 0.00 ;
	/* Sets & Gets */
	public void setIdbasedatos(String idbasedatos) {
		this.idbasedatos = idbasedatos;
	}

	public String getIdbasedatos() {
		return this.idbasedatos;
	}

	public void setIdbasedatosconexion(String idbasedatosconexion) {
		this.idbasedatosconexion = idbasedatosconexion;
	}

	public String getIdbasedatosconexion() {
		return this.idbasedatosconexion;
	}

	public void setWsurl(String wsurl) {
		this.wsurl = wsurl;
	}

	public String getWsurl() {
		return this.wsurl;
	}

	public void setEs_wsnisira(Double es_wsnisira) {
		this.es_wsnisira = es_wsnisira;
	}

	public Double getEs_wsnisira() {
		return this.es_wsnisira;
	}

	public void setHabilitado(Double habilitado) {
		this.habilitado = habilitado;
	}

	public Double getHabilitado() {
		return this.habilitado;
	}



	/* Sets & Gets FK*/

}