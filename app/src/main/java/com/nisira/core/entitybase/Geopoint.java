package com.nisira.core.entitybase;

import java.util.Date;

public class Geopoint {
	private String idbasedatos;
	
	private Integer idgeopoint;
	
	private String descripcion;
	
	private String latitud;
	
	private String longitud;
	
	private String idclieprov;
	
	private Date fechacreacion;
	
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

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLongitud() {
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