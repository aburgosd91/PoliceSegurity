package com.nisira.core.entity;

import java.util.Date;

public class Cargos_personal {

	private String idbasedatos;

	private String idempresa;

	private String idcargo;

	private String descripcion;
	
	private String idactividad;
	
	private String idlabor;
	
	private String sincroniza;
	
	private Date fechacreacion;
	
	private String codalterno;
	
	private Integer es_guardian;
	
	private Float es_pers_aereo;
	
	private String cargo_pesquera;
	
	private Float produccion_pesquera;
	
	private String tipo_trabajo;
	
	private String idarea;
	
	private Float es_jefedearea;
	
	private Float usa_subsector;
	
	private Float tipo_cargo;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdcargo(String idcargo) {
		this.idcargo = idcargo;
	}

	public String getIdcargo() {
		return this.idcargo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setIdactividad(String idactividad) {
		this.idactividad = idactividad;
	}

	public String getIdactividad() {
		return this.idactividad;
	}

	public void setIdlabor(String idlabor) {
		this.idlabor = idlabor;
	}

	public String getIdlabor() {
		return this.idlabor;
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

	public void setCodalterno(String codalterno) {
		this.codalterno = codalterno;
	}

	public String getCodalterno() {
		return this.codalterno;
	}

	public void setEs_guardian(Integer es_guardian) {
		this.es_guardian = es_guardian;
	}

	public Integer getEs_guardian() {
		return this.es_guardian;
	}

	public void setEs_pers_aereo(Float es_pers_aereo) {
		this.es_pers_aereo = es_pers_aereo;
	}

	public Float getEs_pers_aereo() {
		return this.es_pers_aereo;
	}

	public void setCargo_pesquera(String cargo_pesquera) {
		this.cargo_pesquera = cargo_pesquera;
	}

	public String getCargo_pesquera() {
		return this.cargo_pesquera;
	}

	public void setProduccion_pesquera(Float produccion_pesquera) {
		this.produccion_pesquera = produccion_pesquera;
	}

	public Float getProduccion_pesquera() {
		return this.produccion_pesquera;
	}

	public void setTipo_trabajo(String tipo_trabajo) {
		this.tipo_trabajo = tipo_trabajo;
	}

	public String getTipo_trabajo() {
		return this.tipo_trabajo;
	}

	public void setIdarea(String idarea) {
		this.idarea = idarea;
	}

	public String getIdarea() {
		return this.idarea;
	}

	public void setEs_jefedearea(Float es_jefedearea) {
		this.es_jefedearea = es_jefedearea;
	}

	public Float getEs_jefedearea() {
		return this.es_jefedearea;
	}

	public void setUsa_subsector(Float usa_subsector) {
		this.usa_subsector = usa_subsector;
	}

	public Float getUsa_subsector() {
		return this.usa_subsector;
	}

	public void setTipo_cargo(Float tipo_cargo) {
		this.tipo_cargo = tipo_cargo;
	}

	public Float getTipo_cargo() {
		return this.tipo_cargo;
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