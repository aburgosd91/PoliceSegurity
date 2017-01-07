package com.nisira.core.entitybase;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("CLIEPROV")
public class Clieprov implements Serializable {

	@SerializedName("idbasedatos") 
	@XStreamAlias("idbasedatos") 
	private String idbasedatos = "" ;
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@SerializedName("idclieprov") 
	@XStreamAlias("idclieprov") 
	private String idclieprov = "" ;
	@SerializedName("tipo_clieprov") 
	@XStreamAlias("tipo_clieprov") 
	private String tipo_clieprov = "" ;
	@SerializedName("tipopersona") 
	@XStreamAlias("tipopersona") 
	private String tipopersona = "" ;
	@SerializedName("apellidopaterno") 
	@XStreamAlias("apellidopaterno") 
	private String apellidopaterno = "" ;
	@SerializedName("apellidomaterno") 
	@XStreamAlias("apellidomaterno") 
	private String apellidomaterno = "" ;
	@SerializedName("nombres") 
	@XStreamAlias("nombres") 
	private String nombres = "" ;
	@SerializedName("dni") 
	@XStreamAlias("dni") 
	private String dni = "" ;
	@SerializedName("ruc") 
	@XStreamAlias("ruc") 
	private String ruc = "" ;
	@SerializedName("razonsocial") 
	@XStreamAlias("razonsocial") 
	private String razonsocial = "" ;
	@SerializedName("direccion") 
	@XStreamAlias("direccion") 
	private String direccion = "" ;
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

	public void setIdclieprov(String idclieprov) {
		this.idclieprov = idclieprov;
	}

	public String getIdclieprov() {
		return this.idclieprov;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getRazonsocial() {
		return this.razonsocial;
	}

	public void setEstado(Double estado) {
		this.estado = estado;
	}

	public Double getEstado() {
		return this.estado;
	}



	/* Sets & Gets FK*/

    /**
     * @return the tipo_clieprov
     */
    public String getTipo_clieprov() {
        return tipo_clieprov;
    }

    /**
     * @param tipo_clieprov the tipo_clieprov to set
     */
    public void setTipo_clieprov(String tipo_clieprov) {
        this.tipo_clieprov = tipo_clieprov;
    }

    /**
     * @return the tipopersona
     */
    public String getTipopersona() {
        return tipopersona;
    }

    /**
     * @param tipopersona the tipopersona to set
     */
    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    /**
     * @return the apellidopaterno
     */
    public String getApellidopaterno() {
        return apellidopaterno;
    }

    /**
     * @param apellidopaterno the apellidopaterno to set
     */
    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    /**
     * @return the apellidomaterno
     */
    public String getApellidomaterno() {
        return apellidomaterno;
    }

    /**
     * @param apellidomaterno the apellidomaterno to set
     */
    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}