package com.nisira.core.entitybase;

import java.util.Date;

public class Estados {
	private String idbasedatos;
	
	private String idestado;
	
	private String descripcion;
	
	private Float orden;
	
	private Float verflujo;
	
	private String accion;
	
	private String sincroniza;
	
	private Date fechacreacion;
	
	private String color;



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

	public void setOrden(Float orden) {
		this.orden = orden;
	}

	public Float getOrden() {
		return this.orden;
	}

	public void setVerflujo(Float verflujo) {
		this.verflujo = verflujo;
	}

	public Float getVerflujo() {
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