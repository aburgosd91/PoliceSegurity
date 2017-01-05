package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("USUARIO")

public class Usuario implements Serializable {
	
	@SerializedName("idbasedatos") 
	@XStreamAlias("idbasedatos") 
	private String idbasedatos = "" ;
	
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	
	@SerializedName("idusuario") 
	@XStreamAlias("idusuario") 
	private String idusuario = "" ;
	
	@SerializedName("idvendedor") 
	@XStreamAlias("idvendedor") 
	private String idvendedor = "" ;
        
	@SerializedName("usr_nombres") 
	@XStreamAlias("usr_nombres") 
	private String usr_nombres = "" ;
        
	@SerializedName("idclieprov") 
	@XStreamAlias("idclieprov") 
	private String idclieprov = "" ;
	
	@SerializedName("password") 
	@XStreamAlias("password") 
	private String password = "" ;
	
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



	/* Sets & Gets FK*/

    /**
     * @return the usr_nombres
     */
    public String getUsr_nombres() {
        return usr_nombres;
    }

    /**
     * @param usr_nombres the usr_nombres to set
     */
    public void setUsr_nombres(String usr_nombres) {
        this.usr_nombres = usr_nombres;
    }

    /**
     * @return the idclieprov
     */
    public String getIdclieprov() {
        return idclieprov;
    }

    /**
     * @param idclieprov the idclieprov to set
     */
    public void setIdclieprov(String idclieprov) {
        this.idclieprov = idclieprov;
    }

}