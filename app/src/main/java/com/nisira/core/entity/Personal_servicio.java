package com.nisira.core.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Date;
@XStreamAlias("PERSONAL_SERVICIO")
public class Personal_servicio {
	private String idbasedatos;
	
	@XStreamAlias("IDEMPRESA")
	private String idempresa;
	
	@XStreamAlias("IDORDENSERVICIO")
	private String idordenservicio;
	
	@XStreamAlias("ITEM")
	private String item;
	
	@XStreamAlias("IDPERSONAL")
	private String idpersonal;
	
	@XStreamAlias("DNI")
	private String dni;
	
	@XStreamAlias("NOMBRES")
	private String nombres;
	
	@XStreamAlias("HORA_REQ")
	private Float hora_req;
	
	@XStreamAlias("HORA_LLEGADA")
	private Float hora_llegada;
	
	@XStreamAlias("HORA_INICIO_SERV")
	private Float hora_inicio_serv;
	
	@XStreamAlias("HORA_FIN_SERV")
	private Float hora_fin_serv;
	
	@XStreamAlias("HORA_LIBERACION")
	private Float hora_liberacion;
	
	@XStreamAlias("IDCARGO")
	private String idcargo;
	
	@XStreamAlias("FECHAREGISTRO")
	private Date fecharegistro;
	
	@XStreamAlias("FECHAOPERACION")
	private Date fechaoperacion;
	/*ADICIONALES - OPERACIONES*/
	private String cargo;
	private Date fhora_req;
	private Date fhora_llegada;
	private Date fhora_inicio_serv;
	private Date fhora_fin_serv;
	private Date fhora_liberacion;


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

	public void setHora_req(Float hora_req) {
		this.hora_req = hora_req;
	}

	public Float getHora_req() {
		return this.hora_req;
	}

	public void setHora_llegada(Float hora_llegada) {
		this.hora_llegada = hora_llegada;
	}

	public Float getHora_llegada() {
		return this.hora_llegada;
	}

	public void setHora_inicio_serv(Float hora_inicio_serv) {
		this.hora_inicio_serv = hora_inicio_serv;
	}

	public Float getHora_inicio_serv() {
		return this.hora_inicio_serv;
	}

	public void setHora_fin_serv(Float hora_fin_serv) {
		this.hora_fin_serv = hora_fin_serv;
	}

	public Float getHora_fin_serv() {
		return this.hora_fin_serv;
	}

	public void setHora_liberacion(Float hora_liberacion) {
		this.hora_liberacion = hora_liberacion;
	}

	public Float getHora_liberacion() {
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

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the fhora_req
     */
    public Date getFhora_req() {
        return fhora_req;
    }

    /**
     * @param fhora_req the fhora_req to set
     */
    public void setFhora_req(Date fhora_req) {
        this.fhora_req = fhora_req;
    }

    /**
     * @return the fhora_llegada
     */
    public Date getFhora_llegada() {
        return fhora_llegada;
    }

    /**
     * @param fhora_llegada the fhora_llegada to set
     */
    public void setFhora_llegada(Date fhora_llegada) {
        this.fhora_llegada = fhora_llegada;
    }

    /**
     * @return the fhora_inicio_serv
     */
    public Date getFhora_inicio_serv() {
        return fhora_inicio_serv;
    }

    /**
     * @param fhora_inicio_serv the fhora_inicio_serv to set
     */
    public void setFhora_inicio_serv(Date fhora_inicio_serv) {
        this.fhora_inicio_serv = fhora_inicio_serv;
    }

    /**
     * @return the fhora_fin_serv
     */
    public Date getFhora_fin_serv() {
        return fhora_fin_serv;
    }

    /**
     * @param fhora_fin_serv the fhora_fin_serv to set
     */
    public void setFhora_fin_serv(Date fhora_fin_serv) {
        this.fhora_fin_serv = fhora_fin_serv;
    }

    /**
     * @return the fhora_liberacion
     */
    public Date getFhora_liberacion() {
        return fhora_liberacion;
    }

    /**
     * @param fhora_liberacion the fhora_liberacion to set
     */
    public void setFhora_liberacion(Date fhora_liberacion) {
        this.fhora_liberacion = fhora_liberacion;
    }

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