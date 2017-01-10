package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.Date;

@Tabla(nombre = "CONSUMIDOR")
@XStreamAlias("CONSUMIDOR")

public class Consumidor implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("idconsumidor") 
	@XStreamAlias("idconsumidor") 
	private String idconsumidor = "" ;
	@Columna
	@SerializedName("tipo") 
	@XStreamAlias("tipo") 
	private String tipo = "" ;
	@Columna
	@SerializedName("jerarquia") 
	@XStreamAlias("jerarquia") 
	private String jerarquia = "" ;
	@Columna
	@SerializedName("descripcion") 
	@XStreamAlias("descripcion") 
	private String descripcion = "" ;
	@Columna
	@SerializedName("idccosto") 
	@XStreamAlias("idccosto") 
	private String idccosto = "" ;
	@Columna
	@SerializedName("fecha_ingreso") 
	@XStreamAlias("fecha_ingreso") 
	private Date fecha_ingreso;
	@Columna
	@SerializedName("fecha_baja") 
	@XStreamAlias("fecha_baja") 
	private Date fecha_baja;
	@Columna
	@SerializedName("idsucursal") 
	@XStreamAlias("idsucursal") 
	private String idsucursal = "" ;
	@Columna
	@SerializedName("area") 
	@XStreamAlias("area") 
	private Double area = 0.00 ;
	@Columna
	@SerializedName("idtenergia") 
	@XStreamAlias("idtenergia") 
	private String idtenergia = "" ;
	@Columna
	@SerializedName("caudal") 
	@XStreamAlias("caudal") 
	private Double caudal = 0.00 ;
	@Columna
	@SerializedName("idpertenece") 
	@XStreamAlias("idpertenece") 
	private String idpertenece = "" ;
	@Columna
	@SerializedName("tipocalculo") 
	@XStreamAlias("tipocalculo") 
	private String tipocalculo = "" ;
	@Columna
	@SerializedName("costo_mof") 
	@XStreamAlias("costo_mof") 
	private Double costo_mof = 0.00 ;
	@Columna
	@SerializedName("costo_mex") 
	@XStreamAlias("costo_mex") 
	private Double costo_mex = 0.00 ;
	@Columna
	@SerializedName("tipomaquina") 
	@XStreamAlias("tipomaquina") 
	private String tipomaquina = "" ;
	@Columna
	@SerializedName("idproducto") 
	@XStreamAlias("idproducto") 
	private String idproducto = "" ;
	@Columna
	@SerializedName("planificado") 
	@XStreamAlias("planificado") 
	private Double planificado = 0.00 ;
	@Columna
	@SerializedName("producido") 
	@XStreamAlias("producido") 
	private Double producido = 0.00 ;
	@Columna
	@SerializedName("grupo") 
	@XStreamAlias("grupo") 
	private String grupo = "" ;
	@Columna
	@SerializedName("estado") 
	@XStreamAlias("estado") 
	private Double estado = 0.00 ;
	@Columna
	@SerializedName("sincroniza") 
	@XStreamAlias("sincroniza") 
	private String sincroniza = "" ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("escarga") 
	@XStreamAlias("escarga") 
	private Double escarga = 0.00 ;
	@Columna
	@SerializedName("marca") 
	@XStreamAlias("marca") 
	private String marca = "" ;
	@Columna
	@SerializedName("placa") 
	@XStreamAlias("placa") 
	private String placa = "" ;
	@Columna
	@SerializedName("regmtc") 
	@XStreamAlias("regmtc") 
	private String regmtc = "" ;
	@Columna
	@SerializedName("nroejes") 
	@XStreamAlias("nroejes") 
	private Double nroejes = 0.00 ;
	@Columna
	@SerializedName("cargautil") 
	@XStreamAlias("cargautil") 
	private Double cargautil = 0.00 ;
	@Columna
	@SerializedName("tipovehiculo") 
	@XStreamAlias("tipovehiculo") 
	private String tipovehiculo = "" ;
	@Columna
	@SerializedName("anio") 
	@XStreamAlias("anio") 
	private Double anio = 0.00 ;
	@Columna
	@SerializedName("kminicial") 
	@XStreamAlias("kminicial") 
	private Double kminicial = 0.00 ;
	@Columna
	@SerializedName("idcontrolador") 
	@XStreamAlias("idcontrolador") 
	private String idcontrolador = "" ;
	@Columna
	@SerializedName("nro_valvula") 
	@XStreamAlias("nro_valvula") 
	private String nro_valvula = "" ;
	@Columna
	@SerializedName("idserie") 
	@XStreamAlias("idserie") 
	private String idserie = "" ;
	@Columna
	@SerializedName("kilometros") 
	@XStreamAlias("kilometros") 
	private Double kilometros = 0.00 ;
	@Columna
	@SerializedName("idnivelconsumidor") 
	@XStreamAlias("idnivelconsumidor") 
	private String idnivelconsumidor = "" ;
	@Columna
	@SerializedName("descripcioncorta") 
	@XStreamAlias("descripcioncorta") 
	private String descripcioncorta = "" ;
	@Columna
	@SerializedName("codigo_control") 
	@XStreamAlias("codigo_control") 
	private String codigo_control = "" ;
	@Columna
	@SerializedName("es_titulo") 
	@XStreamAlias("es_titulo") 
	private Double es_titulo = 0.00 ;
	@Columna
	@SerializedName("gastoxactividad") 
	@XStreamAlias("gastoxactividad") 
	private Double gastoxactividad = 0.00 ;
	@Columna
	@SerializedName("final") 
	@XStreamAlias("final") 
	private Double final_ = 0.00 ;
	@Columna
	@SerializedName("cuenta_abono") 
	@XStreamAlias("cuenta_abono") 
	private String cuenta_abono = "" ;
	@Columna
	@SerializedName("cuenta_cargo") 
	@XStreamAlias("cuenta_cargo") 
	private String cuenta_cargo = "" ;
	@Columna
	@SerializedName("cuenta_destino") 
	@XStreamAlias("cuenta_destino") 
	private String cuenta_destino = "" ;
	@Columna
	@SerializedName("idactividad") 
	@XStreamAlias("idactividad") 
	private Double idactividad = 0.00 ;
	@Columna
	@SerializedName("idsiembra") 
	@XStreamAlias("idsiembra") 
	private Double idsiembra = 0.00 ;
	@Columna
	@SerializedName("idcampana") 
	@XStreamAlias("idcampana") 
	private Double idcampana = 0.00 ;
	@Columna
	@SerializedName("idordenproduccion") 
	@XStreamAlias("idordenproduccion") 
	private Double idordenproduccion = 0.00 ;
	@Columna
	@SerializedName("idloteproduccion") 
	@XStreamAlias("idloteproduccion") 
	private Double idloteproduccion = 0.00 ;
	@Columna
	@SerializedName("creacc") 
	@XStreamAlias("creacc") 
	private Double creacc = 0.00 ;
	@Columna
	@SerializedName("es_produccion") 
	@XStreamAlias("es_produccion") 
	private Double es_produccion = 0.00 ;
	@Columna
	@SerializedName("codigo_lotizar") 
	@XStreamAlias("codigo_lotizar") 
	private String codigo_lotizar = "" ;
	@Columna
	@SerializedName("vventa_mof") 
	@XStreamAlias("vventa_mof") 
	private Double vventa_mof = 0.00 ;
	@Columna
	@SerializedName("vventa_mex") 
	@XStreamAlias("vventa_mex") 
	private Double vventa_mex = 0.00 ;
	@Columna
	@SerializedName("idunidadnegocio") 
	@XStreamAlias("idunidadnegocio") 
	private String idunidadnegocio = "" ;
	@Columna
	@SerializedName("idclaseccosto") 
	@XStreamAlias("idclaseccosto") 
	private String idclaseccosto = "" ;
	@Columna
	@SerializedName("idcuentac_pt") 
	@XStreamAlias("idcuentac_pt") 
	private String idcuentac_pt = "" ;
	@Columna
	@SerializedName("idcuentaa_pt") 
	@XStreamAlias("idcuentaa_pt") 
	private String idcuentaa_pt = "" ;
	@Columna
	@SerializedName("idcuentac_pp") 
	@XStreamAlias("idcuentac_pp") 
	private String idcuentac_pp = "" ;
	@Columna
	@SerializedName("idcuentaa_pp") 
	@XStreamAlias("idcuentaa_pp") 
	private String idcuentaa_pp = "" ;
	@Columna
	@SerializedName("tipo_costeo") 
	@XStreamAlias("tipo_costeo") 
	private Double tipo_costeo = 0.00 ;
	@Columna
	@SerializedName("idfuncion") 
	@XStreamAlias("idfuncion") 
	private String idfuncion = "" ;
	@Columna
	@SerializedName("idmotivo_reval") 
	@XStreamAlias("idmotivo_reval") 
	private String idmotivo_reval = "" ;
	@Columna
	@SerializedName("idsucursal_reval") 
	@XStreamAlias("idsucursal_reval") 
	private String idsucursal_reval = "" ;
	@Columna
	@SerializedName("idalmacen_reval") 
	@XStreamAlias("idalmacen_reval") 
	private String idalmacen_reval = "" ;
	@Columna
	@SerializedName("iddocumento_reval") 
	@XStreamAlias("iddocumento_reval") 
	private String iddocumento_reval = "" ;
	@Columna
	@SerializedName("idfactordistribucion") 
	@XStreamAlias("idfactordistribucion") 
	private String idfactordistribucion = "" ;
	@Columna
	@SerializedName("costoha_mex") 
	@XStreamAlias("costoha_mex") 
	private Double costoha_mex = 0.00 ;
	@Columna
	@SerializedName("costoha_mof") 
	@XStreamAlias("costoha_mof") 
	private Double costoha_mof = 0.00 ;
	@Columna
	@SerializedName("distr_costofinal") 
	@XStreamAlias("distr_costofinal") 
	private Double distr_costofinal = 0.00 ;
	@Columna
	@SerializedName("esxperiodo") 
	@XStreamAlias("esxperiodo") 
	private Double esxperiodo = 0.00 ;
	@Columna
	@SerializedName("nombre_registro") 
	@XStreamAlias("nombre_registro") 
	private String nombre_registro = "" ;
	@Columna
	@SerializedName("nro_registro") 
	@XStreamAlias("nro_registro") 
	private String nro_registro = "" ;
	@Columna
	@SerializedName("tipo_costo") 
	@XStreamAlias("tipo_costo") 
	private String tipo_costo = "" ;
	@Columna
	@SerializedName("idparteproduccion") 
	@XStreamAlias("idparteproduccion") 
	private Double idparteproduccion = 0.00 ;
	@Columna
	@SerializedName("algoritmoprecio") 
	@XStreamAlias("algoritmoprecio") 
	private Double algoritmoprecio = 0.00 ;
	@Columna
	@SerializedName("idprovlote") 
	@XStreamAlias("idprovlote") 
	private String idprovlote = "" ;
	@Columna
	@SerializedName("idmedida") 
	@XStreamAlias("idmedida") 
	private String idmedida = "" ;
	@Columna
	@SerializedName("descarga") 
	@XStreamAlias("descarga") 
	private Double descarga = 0.00 ;
	@Columna
	@SerializedName("esvehtercero") 
	@XStreamAlias("esvehtercero") 
	private Double esvehtercero = 0.00 ;
	@Columna
	@SerializedName("genera_viajet") 
	@XStreamAlias("genera_viajet") 
	private Double genera_viajet = 0.00 ;
	@Columna
	@SerializedName("genera_remtransportista") 
	@XStreamAlias("genera_remtransportista") 
	private Double genera_remtransportista = 0.00 ;
	@Columna
	@SerializedName("idviajet") 
	@XStreamAlias("idviajet") 
	private String idviajet = "" ;
	@Columna
	@SerializedName("idremtransportista") 
	@XStreamAlias("idremtransportista") 
	private String idremtransportista = "" ;
	@Columna
	@SerializedName("nrv_asignacion") 
	@XStreamAlias("nrv_asignacion") 
	private Double nrv_asignacion = 0.00 ;
	@Columna
	@SerializedName("growercode") 
	@XStreamAlias("growercode") 
	private String growercode = "" ;
	@Columna
	@SerializedName("ver_transformacion") 
	@XStreamAlias("ver_transformacion") 
	private Double ver_transformacion = 0.00 ;
	@Columna
	@SerializedName("idcuenta_cp") 
	@XStreamAlias("idcuenta_cp") 
	private String idcuenta_cp = "" ;
	@Columna
	@SerializedName("capacidad") 
	@XStreamAlias("capacidad") 
	private Double capacidad = 0.00 ;
	@Columna
	@SerializedName("idalmacen") 
	@XStreamAlias("idalmacen") 
	private String idalmacen = "" ;
	@Columna
	@SerializedName("idfuenteagua") 
	@XStreamAlias("idfuenteagua") 
	private String idfuenteagua = "" ;
	@Columna
	@SerializedName("idclieprov_vehtercero") 
	@XStreamAlias("idclieprov_vehtercero") 
	private String idclieprov_vehtercero = "" ;
	@Columna
	@SerializedName("es_servicio") 
	@XStreamAlias("es_servicio") 
	private Double es_servicio = 0.00 ;
	@Columna
	@SerializedName("idcuentadiv9") 
	@XStreamAlias("idcuentadiv9") 
	private String idcuentadiv9 = "" ;
	@Columna
	@SerializedName("esalquilado") 
	@XStreamAlias("esalquilado") 
	private Double esalquilado = 0.00 ;
	@Columna
	@SerializedName("no_participadistribucion") 
	@XStreamAlias("no_participadistribucion") 
	private Double no_participadistribucion = 0.00 ;
	@Columna
	@SerializedName("es_mantenimiento") 
	@XStreamAlias("es_mantenimiento") 
	private Double es_mantenimiento = 0.00 ;
	@Columna
	@SerializedName("idgrupo_maq") 
	@XStreamAlias("idgrupo_maq") 
	private String idgrupo_maq = "" ;
	@Columna
	@SerializedName("distribucion_dwh") 
	@XStreamAlias("distribucion_dwh") 
	private Double distribucion_dwh = 0.00 ;
	@Columna
	@SerializedName("nombre_corto") 
	@XStreamAlias("nombre_corto") 
	private String nombre_corto = "" ;
	@Columna
	@SerializedName("idsubsectorconsumidor") 
	@XStreamAlias("idsubsectorconsumidor") 
	private String idsubsectorconsumidor = "" ;
	@Columna
	@SerializedName("es_cosecha") 
	@XStreamAlias("es_cosecha") 
	private Double es_cosecha = 0.00 ;
	@Columna
	@SerializedName("capacidad_tanque") 
	@XStreamAlias("capacidad_tanque") 
	private Double capacidad_tanque = 0.00 ;
	@Columna
	@SerializedName("idbasedatos") 
	@XStreamAlias("idbasedatos") 
	private String idbasedatos = "" ;
	@Columna
	@SerializedName("idactivo") 
	@XStreamAlias("idactivo") 
	private String idactivo = "" ;
	@Columna
	@SerializedName("idingresosalidaactivo") 
	@XStreamAlias("idingresosalidaactivo") 
	private String idingresosalidaactivo = "" ;
	@Columna
	@SerializedName("idctaactivo") 
	@XStreamAlias("idctaactivo") 
	private String idctaactivo = "" ;
	@Columna
	@SerializedName("es_reproceso") 
	@XStreamAlias("es_reproceso") 
	private Double es_reproceso = 0.00 ;
	@Columna
	@SerializedName("es_reempaque") 
	@XStreamAlias("es_reempaque") 
	private Double es_reempaque = 0.00 ;
	@Columna
	@SerializedName("es_avicola") 
	@XStreamAlias("es_avicola") 
	private Double es_avicola = 0.00 ;
	@Columna
	@SerializedName("tipo_presupuesto") 
	@XStreamAlias("tipo_presupuesto") 
	private String tipo_presupuesto = "" ;
	@Columna
	@SerializedName("es_empaque") 
	@XStreamAlias("es_empaque") 
	private Double es_empaque = 0.00 ;
	@Columna
	@SerializedName("idconsumidor_spring") 
	@XStreamAlias("idconsumidor_spring") 
	private String idconsumidor_spring = "" ;
	@Columna
	@SerializedName("es_lote_campo") 
	@XStreamAlias("es_lote_campo") 
	private Double es_lote_campo = 0.00 ;
	@Columna
	@SerializedName("es_secado") 
	@XStreamAlias("es_secado") 
	private Double es_secado = 0.00 ;
	@Columna
	@SerializedName("certificado") 
	@XStreamAlias("certificado") 
	private Double certificado = 0.00 ;
	@Columna
	@SerializedName("tipo_precio_fuente") 
	@XStreamAlias("tipo_precio_fuente") 
	private Integer tipo_precio_fuente;
	@Columna
	@SerializedName("codigo_parcela") 
	@XStreamAlias("codigo_parcela") 
	private String codigo_parcela = "" ;
	@Columna
	@SerializedName("costokm_mof") 
	@XStreamAlias("costokm_mof") 
	private Double costokm_mof = 0.00 ;
	@Columna
	@SerializedName("costokm_mex") 
	@XStreamAlias("costokm_mex") 
	private Double costokm_mex = 0.00 ;
	@Columna
	@SerializedName("costodia_mof") 
	@XStreamAlias("costodia_mof") 
	private Double costodia_mof = 0.00 ;
	@Columna
	@SerializedName("costodia_mex") 
	@XStreamAlias("costodia_mex") 
	private Double costodia_mex = 0.00 ;
	@Columna
	@SerializedName("idlinea_avicola") 
	@XStreamAlias("idlinea_avicola") 
	private String idlinea_avicola = "" ;
	@Columna
	@SerializedName("permanencia") 
	@XStreamAlias("permanencia") 
	private Integer permanencia;
	@Columna
	@SerializedName("dias_genpresup") 
	@XStreamAlias("dias_genpresup") 
	private Integer dias_genpresup;
	@Columna
	@SerializedName("idmedida_maq") 
	@XStreamAlias("idmedida_maq") 
	private String idmedida_maq = "" ;
	@Columna
	@SerializedName("capacidad_maq") 
	@XStreamAlias("capacidad_maq") 
	private Double capacidad_maq = 0.00 ;
	@Columna
	@SerializedName("vventa_um_mof") 
	@XStreamAlias("vventa_um_mof") 
	private Double vventa_um_mof = 0.00 ;
	@Columna
	@SerializedName("vventa_um_mex") 
	@XStreamAlias("vventa_um_mex") 
	private Double vventa_um_mex = 0.00 ;
	@Columna
	@SerializedName("tipo_registro_parte") 
	@XStreamAlias("tipo_registro_parte") 
	private String tipo_registro_parte = "" ;
	@Columna
	@SerializedName("ver_digitacion") 
	@XStreamAlias("ver_digitacion") 
	private Double ver_digitacion = 0.00 ;
	@Columna
	@SerializedName("es_lote_vivero") 
	@XStreamAlias("es_lote_vivero") 
	private Double es_lote_vivero = 0.00 ;
	@Columna
	@SerializedName("fn_distr_var1_m2") 
	@XStreamAlias("fn_distr_var1_m2") 
	private Double fn_distr_var1_m2 = 0.00 ;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdconsumidor(String idconsumidor) {
		this.idconsumidor = idconsumidor;
	}

	public String getIdconsumidor() {
		return this.idconsumidor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setJerarquia(String jerarquia) {
		this.jerarquia = jerarquia;
	}

	public String getJerarquia() {
		return this.jerarquia;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setIdccosto(String idccosto) {
		this.idccosto = idccosto;
	}

	public String getIdccosto() {
		return this.idccosto;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Date getFecha_ingreso() {
		return this.fecha_ingreso;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public Date getFecha_baja() {
		return this.fecha_baja;
	}

	public void setIdsucursal(String idsucursal) {
		this.idsucursal = idsucursal;
	}

	public String getIdsucursal() {
		return this.idsucursal;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getArea() {
		return this.area;
	}

	public void setIdtenergia(String idtenergia) {
		this.idtenergia = idtenergia;
	}

	public String getIdtenergia() {
		return this.idtenergia;
	}

	public void setCaudal(Double caudal) {
		this.caudal = caudal;
	}

	public Double getCaudal() {
		return this.caudal;
	}

	public void setIdpertenece(String idpertenece) {
		this.idpertenece = idpertenece;
	}

	public String getIdpertenece() {
		return this.idpertenece;
	}

	public void setTipocalculo(String tipocalculo) {
		this.tipocalculo = tipocalculo;
	}

	public String getTipocalculo() {
		return this.tipocalculo;
	}

	public void setCosto_mof(Double costo_mof) {
		this.costo_mof = costo_mof;
	}

	public Double getCosto_mof() {
		return this.costo_mof;
	}

	public void setCosto_mex(Double costo_mex) {
		this.costo_mex = costo_mex;
	}

	public Double getCosto_mex() {
		return this.costo_mex;
	}

	public void setTipomaquina(String tipomaquina) {
		this.tipomaquina = tipomaquina;
	}

	public String getTipomaquina() {
		return this.tipomaquina;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	public String getIdproducto() {
		return this.idproducto;
	}

	public void setPlanificado(Double planificado) {
		this.planificado = planificado;
	}

	public Double getPlanificado() {
		return this.planificado;
	}

	public void setProducido(Double producido) {
		this.producido = producido;
	}

	public Double getProducido() {
		return this.producido;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setEstado(Double estado) {
		this.estado = estado;
	}

	public Double getEstado() {
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

	public void setEscarga(Double escarga) {
		this.escarga = escarga;
	}

	public Double getEscarga() {
		return this.escarga;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setRegmtc(String regmtc) {
		this.regmtc = regmtc;
	}

	public String getRegmtc() {
		return this.regmtc;
	}

	public void setNroejes(Double nroejes) {
		this.nroejes = nroejes;
	}

	public Double getNroejes() {
		return this.nroejes;
	}

	public void setCargautil(Double cargautil) {
		this.cargautil = cargautil;
	}

	public Double getCargautil() {
		return this.cargautil;
	}

	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	public String getTipovehiculo() {
		return this.tipovehiculo;
	}

	public void setAnio(Double anio) {
		this.anio = anio;
	}

	public Double getAnio() {
		return this.anio;
	}

	public void setKminicial(Double kminicial) {
		this.kminicial = kminicial;
	}

	public Double getKminicial() {
		return this.kminicial;
	}

	public void setIdcontrolador(String idcontrolador) {
		this.idcontrolador = idcontrolador;
	}

	public String getIdcontrolador() {
		return this.idcontrolador;
	}

	public void setNro_valvula(String nro_valvula) {
		this.nro_valvula = nro_valvula;
	}

	public String getNro_valvula() {
		return this.nro_valvula;
	}

	public void setIdserie(String idserie) {
		this.idserie = idserie;
	}

	public String getIdserie() {
		return this.idserie;
	}

	public void setKilometros(Double kilometros) {
		this.kilometros = kilometros;
	}

	public Double getKilometros() {
		return this.kilometros;
	}

	public void setIdnivelconsumidor(String idnivelconsumidor) {
		this.idnivelconsumidor = idnivelconsumidor;
	}

	public String getIdnivelconsumidor() {
		return this.idnivelconsumidor;
	}

	public void setDescripcioncorta(String descripcioncorta) {
		this.descripcioncorta = descripcioncorta;
	}

	public String getDescripcioncorta() {
		return this.descripcioncorta;
	}

	public void setCodigo_control(String codigo_control) {
		this.codigo_control = codigo_control;
	}

	public String getCodigo_control() {
		return this.codigo_control;
	}

	public void setEs_titulo(Double es_titulo) {
		this.es_titulo = es_titulo;
	}

	public Double getEs_titulo() {
		return this.es_titulo;
	}

	public void setGastoxactividad(Double gastoxactividad) {
		this.gastoxactividad = gastoxactividad;
	}

	public Double getGastoxactividad() {
		return this.gastoxactividad;
	}

	public void setFinal(Double final_) {
		this.final_ = final_;
	}

	public Double getFinal() {
		return this.final_;
	}

	public void setCuenta_abono(String cuenta_abono) {
		this.cuenta_abono = cuenta_abono;
	}

	public String getCuenta_abono() {
		return this.cuenta_abono;
	}

	public void setCuenta_cargo(String cuenta_cargo) {
		this.cuenta_cargo = cuenta_cargo;
	}

	public String getCuenta_cargo() {
		return this.cuenta_cargo;
	}

	public void setCuenta_destino(String cuenta_destino) {
		this.cuenta_destino = cuenta_destino;
	}

	public String getCuenta_destino() {
		return this.cuenta_destino;
	}

	public void setIdactividad(Double idactividad) {
		this.idactividad = idactividad;
	}

	public Double getIdactividad() {
		return this.idactividad;
	}

	public void setIdsiembra(Double idsiembra) {
		this.idsiembra = idsiembra;
	}

	public Double getIdsiembra() {
		return this.idsiembra;
	}

	public void setIdcampana(Double idcampana) {
		this.idcampana = idcampana;
	}

	public Double getIdcampana() {
		return this.idcampana;
	}

	public void setIdordenproduccion(Double idordenproduccion) {
		this.idordenproduccion = idordenproduccion;
	}

	public Double getIdordenproduccion() {
		return this.idordenproduccion;
	}

	public void setIdloteproduccion(Double idloteproduccion) {
		this.idloteproduccion = idloteproduccion;
	}

	public Double getIdloteproduccion() {
		return this.idloteproduccion;
	}

	public void setCreacc(Double creacc) {
		this.creacc = creacc;
	}

	public Double getCreacc() {
		return this.creacc;
	}

	public void setEs_produccion(Double es_produccion) {
		this.es_produccion = es_produccion;
	}

	public Double getEs_produccion() {
		return this.es_produccion;
	}

	public void setCodigo_lotizar(String codigo_lotizar) {
		this.codigo_lotizar = codigo_lotizar;
	}

	public String getCodigo_lotizar() {
		return this.codigo_lotizar;
	}

	public void setVventa_mof(Double vventa_mof) {
		this.vventa_mof = vventa_mof;
	}

	public Double getVventa_mof() {
		return this.vventa_mof;
	}

	public void setVventa_mex(Double vventa_mex) {
		this.vventa_mex = vventa_mex;
	}

	public Double getVventa_mex() {
		return this.vventa_mex;
	}

	public void setIdunidadnegocio(String idunidadnegocio) {
		this.idunidadnegocio = idunidadnegocio;
	}

	public String getIdunidadnegocio() {
		return this.idunidadnegocio;
	}

	public void setIdclaseccosto(String idclaseccosto) {
		this.idclaseccosto = idclaseccosto;
	}

	public String getIdclaseccosto() {
		return this.idclaseccosto;
	}

	public void setIdcuentac_pt(String idcuentac_pt) {
		this.idcuentac_pt = idcuentac_pt;
	}

	public String getIdcuentac_pt() {
		return this.idcuentac_pt;
	}

	public void setIdcuentaa_pt(String idcuentaa_pt) {
		this.idcuentaa_pt = idcuentaa_pt;
	}

	public String getIdcuentaa_pt() {
		return this.idcuentaa_pt;
	}

	public void setIdcuentac_pp(String idcuentac_pp) {
		this.idcuentac_pp = idcuentac_pp;
	}

	public String getIdcuentac_pp() {
		return this.idcuentac_pp;
	}

	public void setIdcuentaa_pp(String idcuentaa_pp) {
		this.idcuentaa_pp = idcuentaa_pp;
	}

	public String getIdcuentaa_pp() {
		return this.idcuentaa_pp;
	}

	public void setTipo_costeo(Double tipo_costeo) {
		this.tipo_costeo = tipo_costeo;
	}

	public Double getTipo_costeo() {
		return this.tipo_costeo;
	}

	public void setIdfuncion(String idfuncion) {
		this.idfuncion = idfuncion;
	}

	public String getIdfuncion() {
		return this.idfuncion;
	}

	public void setIdmotivo_reval(String idmotivo_reval) {
		this.idmotivo_reval = idmotivo_reval;
	}

	public String getIdmotivo_reval() {
		return this.idmotivo_reval;
	}

	public void setIdsucursal_reval(String idsucursal_reval) {
		this.idsucursal_reval = idsucursal_reval;
	}

	public String getIdsucursal_reval() {
		return this.idsucursal_reval;
	}

	public void setIdalmacen_reval(String idalmacen_reval) {
		this.idalmacen_reval = idalmacen_reval;
	}

	public String getIdalmacen_reval() {
		return this.idalmacen_reval;
	}

	public void setIddocumento_reval(String iddocumento_reval) {
		this.iddocumento_reval = iddocumento_reval;
	}

	public String getIddocumento_reval() {
		return this.iddocumento_reval;
	}

	public void setIdfactordistribucion(String idfactordistribucion) {
		this.idfactordistribucion = idfactordistribucion;
	}

	public String getIdfactordistribucion() {
		return this.idfactordistribucion;
	}

	public void setCostoha_mex(Double costoha_mex) {
		this.costoha_mex = costoha_mex;
	}

	public Double getCostoha_mex() {
		return this.costoha_mex;
	}

	public void setCostoha_mof(Double costoha_mof) {
		this.costoha_mof = costoha_mof;
	}

	public Double getCostoha_mof() {
		return this.costoha_mof;
	}

	public void setDistr_costofinal(Double distr_costofinal) {
		this.distr_costofinal = distr_costofinal;
	}

	public Double getDistr_costofinal() {
		return this.distr_costofinal;
	}

	public void setEsxperiodo(Double esxperiodo) {
		this.esxperiodo = esxperiodo;
	}

	public Double getEsxperiodo() {
		return this.esxperiodo;
	}

	public void setNombre_registro(String nombre_registro) {
		this.nombre_registro = nombre_registro;
	}

	public String getNombre_registro() {
		return this.nombre_registro;
	}

	public void setNro_registro(String nro_registro) {
		this.nro_registro = nro_registro;
	}

	public String getNro_registro() {
		return this.nro_registro;
	}

	public void setTipo_costo(String tipo_costo) {
		this.tipo_costo = tipo_costo;
	}

	public String getTipo_costo() {
		return this.tipo_costo;
	}

	public void setIdparteproduccion(Double idparteproduccion) {
		this.idparteproduccion = idparteproduccion;
	}

	public Double getIdparteproduccion() {
		return this.idparteproduccion;
	}

	public void setAlgoritmoprecio(Double algoritmoprecio) {
		this.algoritmoprecio = algoritmoprecio;
	}

	public Double getAlgoritmoprecio() {
		return this.algoritmoprecio;
	}

	public void setIdprovlote(String idprovlote) {
		this.idprovlote = idprovlote;
	}

	public String getIdprovlote() {
		return this.idprovlote;
	}

	public void setIdmedida(String idmedida) {
		this.idmedida = idmedida;
	}

	public String getIdmedida() {
		return this.idmedida;
	}

	public void setDescarga(Double descarga) {
		this.descarga = descarga;
	}

	public Double getDescarga() {
		return this.descarga;
	}

	public void setEsvehtercero(Double esvehtercero) {
		this.esvehtercero = esvehtercero;
	}

	public Double getEsvehtercero() {
		return this.esvehtercero;
	}

	public void setGenera_viajet(Double genera_viajet) {
		this.genera_viajet = genera_viajet;
	}

	public Double getGenera_viajet() {
		return this.genera_viajet;
	}

	public void setGenera_remtransportista(Double genera_remtransportista) {
		this.genera_remtransportista = genera_remtransportista;
	}

	public Double getGenera_remtransportista() {
		return this.genera_remtransportista;
	}

	public void setIdviajet(String idviajet) {
		this.idviajet = idviajet;
	}

	public String getIdviajet() {
		return this.idviajet;
	}

	public void setIdremtransportista(String idremtransportista) {
		this.idremtransportista = idremtransportista;
	}

	public String getIdremtransportista() {
		return this.idremtransportista;
	}

	public void setNrv_asignacion(Double nrv_asignacion) {
		this.nrv_asignacion = nrv_asignacion;
	}

	public Double getNrv_asignacion() {
		return this.nrv_asignacion;
	}

	public void setGrowercode(String growercode) {
		this.growercode = growercode;
	}

	public String getGrowercode() {
		return this.growercode;
	}

	public void setVer_transformacion(Double ver_transformacion) {
		this.ver_transformacion = ver_transformacion;
	}

	public Double getVer_transformacion() {
		return this.ver_transformacion;
	}

	public void setIdcuenta_cp(String idcuenta_cp) {
		this.idcuenta_cp = idcuenta_cp;
	}

	public String getIdcuenta_cp() {
		return this.idcuenta_cp;
	}

	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}

	public Double getCapacidad() {
		return this.capacidad;
	}

	public void setIdalmacen(String idalmacen) {
		this.idalmacen = idalmacen;
	}

	public String getIdalmacen() {
		return this.idalmacen;
	}

	public void setIdfuenteagua(String idfuenteagua) {
		this.idfuenteagua = idfuenteagua;
	}

	public String getIdfuenteagua() {
		return this.idfuenteagua;
	}

	public void setIdclieprov_vehtercero(String idclieprov_vehtercero) {
		this.idclieprov_vehtercero = idclieprov_vehtercero;
	}

	public String getIdclieprov_vehtercero() {
		return this.idclieprov_vehtercero;
	}

	public void setEs_servicio(Double es_servicio) {
		this.es_servicio = es_servicio;
	}

	public Double getEs_servicio() {
		return this.es_servicio;
	}

	public void setIdcuentadiv9(String idcuentadiv9) {
		this.idcuentadiv9 = idcuentadiv9;
	}

	public String getIdcuentadiv9() {
		return this.idcuentadiv9;
	}

	public void setEsalquilado(Double esalquilado) {
		this.esalquilado = esalquilado;
	}

	public Double getEsalquilado() {
		return this.esalquilado;
	}

	public void setNo_participadistribucion(Double no_participadistribucion) {
		this.no_participadistribucion = no_participadistribucion;
	}

	public Double getNo_participadistribucion() {
		return this.no_participadistribucion;
	}

	public void setEs_mantenimiento(Double es_mantenimiento) {
		this.es_mantenimiento = es_mantenimiento;
	}

	public Double getEs_mantenimiento() {
		return this.es_mantenimiento;
	}

	public void setIdgrupo_maq(String idgrupo_maq) {
		this.idgrupo_maq = idgrupo_maq;
	}

	public String getIdgrupo_maq() {
		return this.idgrupo_maq;
	}

	public void setDistribucion_dwh(Double distribucion_dwh) {
		this.distribucion_dwh = distribucion_dwh;
	}

	public Double getDistribucion_dwh() {
		return this.distribucion_dwh;
	}

	public void setNombre_corto(String nombre_corto) {
		this.nombre_corto = nombre_corto;
	}

	public String getNombre_corto() {
		return this.nombre_corto;
	}

	public void setIdsubsectorconsumidor(String idsubsectorconsumidor) {
		this.idsubsectorconsumidor = idsubsectorconsumidor;
	}

	public String getIdsubsectorconsumidor() {
		return this.idsubsectorconsumidor;
	}

	public void setEs_cosecha(Double es_cosecha) {
		this.es_cosecha = es_cosecha;
	}

	public Double getEs_cosecha() {
		return this.es_cosecha;
	}

	public void setCapacidad_tanque(Double capacidad_tanque) {
		this.capacidad_tanque = capacidad_tanque;
	}

	public Double getCapacidad_tanque() {
		return this.capacidad_tanque;
	}

	public void setIdbasedatos(String idbasedatos) {
		this.idbasedatos = idbasedatos;
	}

	public String getIdbasedatos() {
		return this.idbasedatos;
	}

	public void setIdactivo(String idactivo) {
		this.idactivo = idactivo;
	}

	public String getIdactivo() {
		return this.idactivo;
	}

	public void setIdingresosalidaactivo(String idingresosalidaactivo) {
		this.idingresosalidaactivo = idingresosalidaactivo;
	}

	public String getIdingresosalidaactivo() {
		return this.idingresosalidaactivo;
	}

	public void setIdctaactivo(String idctaactivo) {
		this.idctaactivo = idctaactivo;
	}

	public String getIdctaactivo() {
		return this.idctaactivo;
	}

	public void setEs_reproceso(Double es_reproceso) {
		this.es_reproceso = es_reproceso;
	}

	public Double getEs_reproceso() {
		return this.es_reproceso;
	}

	public void setEs_reempaque(Double es_reempaque) {
		this.es_reempaque = es_reempaque;
	}

	public Double getEs_reempaque() {
		return this.es_reempaque;
	}

	public void setEs_avicola(Double es_avicola) {
		this.es_avicola = es_avicola;
	}

	public Double getEs_avicola() {
		return this.es_avicola;
	}

	public void setTipo_presupuesto(String tipo_presupuesto) {
		this.tipo_presupuesto = tipo_presupuesto;
	}

	public String getTipo_presupuesto() {
		return this.tipo_presupuesto;
	}

	public void setEs_empaque(Double es_empaque) {
		this.es_empaque = es_empaque;
	}

	public Double getEs_empaque() {
		return this.es_empaque;
	}

	public void setIdconsumidor_spring(String idconsumidor_spring) {
		this.idconsumidor_spring = idconsumidor_spring;
	}

	public String getIdconsumidor_spring() {
		return this.idconsumidor_spring;
	}

	public void setEs_lote_campo(Double es_lote_campo) {
		this.es_lote_campo = es_lote_campo;
	}

	public Double getEs_lote_campo() {
		return this.es_lote_campo;
	}

	public void setEs_secado(Double es_secado) {
		this.es_secado = es_secado;
	}

	public Double getEs_secado() {
		return this.es_secado;
	}

	public void setCertificado(Double certificado) {
		this.certificado = certificado;
	}

	public Double getCertificado() {
		return this.certificado;
	}

	public void setTipo_precio_fuente(Integer tipo_precio_fuente) {
		this.tipo_precio_fuente = tipo_precio_fuente;
	}

	public Integer getTipo_precio_fuente() {
		return this.tipo_precio_fuente;
	}

	public void setCodigo_parcela(String codigo_parcela) {
		this.codigo_parcela = codigo_parcela;
	}

	public String getCodigo_parcela() {
		return this.codigo_parcela;
	}

	public void setCostokm_mof(Double costokm_mof) {
		this.costokm_mof = costokm_mof;
	}

	public Double getCostokm_mof() {
		return this.costokm_mof;
	}

	public void setCostokm_mex(Double costokm_mex) {
		this.costokm_mex = costokm_mex;
	}

	public Double getCostokm_mex() {
		return this.costokm_mex;
	}

	public void setCostodia_mof(Double costodia_mof) {
		this.costodia_mof = costodia_mof;
	}

	public Double getCostodia_mof() {
		return this.costodia_mof;
	}

	public void setCostodia_mex(Double costodia_mex) {
		this.costodia_mex = costodia_mex;
	}

	public Double getCostodia_mex() {
		return this.costodia_mex;
	}

	public void setIdlinea_avicola(String idlinea_avicola) {
		this.idlinea_avicola = idlinea_avicola;
	}

	public String getIdlinea_avicola() {
		return this.idlinea_avicola;
	}

	public void setPermanencia(Integer permanencia) {
		this.permanencia = permanencia;
	}

	public Integer getPermanencia() {
		return this.permanencia;
	}

	public void setDias_genpresup(Integer dias_genpresup) {
		this.dias_genpresup = dias_genpresup;
	}

	public Integer getDias_genpresup() {
		return this.dias_genpresup;
	}

	public void setIdmedida_maq(String idmedida_maq) {
		this.idmedida_maq = idmedida_maq;
	}

	public String getIdmedida_maq() {
		return this.idmedida_maq;
	}

	public void setCapacidad_maq(Double capacidad_maq) {
		this.capacidad_maq = capacidad_maq;
	}

	public Double getCapacidad_maq() {
		return this.capacidad_maq;
	}

	public void setVventa_um_mof(Double vventa_um_mof) {
		this.vventa_um_mof = vventa_um_mof;
	}

	public Double getVventa_um_mof() {
		return this.vventa_um_mof;
	}

	public void setVventa_um_mex(Double vventa_um_mex) {
		this.vventa_um_mex = vventa_um_mex;
	}

	public Double getVventa_um_mex() {
		return this.vventa_um_mex;
	}

	public void setTipo_registro_parte(String tipo_registro_parte) {
		this.tipo_registro_parte = tipo_registro_parte;
	}

	public String getTipo_registro_parte() {
		return this.tipo_registro_parte;
	}

	public void setVer_digitacion(Double ver_digitacion) {
		this.ver_digitacion = ver_digitacion;
	}

	public Double getVer_digitacion() {
		return this.ver_digitacion;
	}

	public void setEs_lote_vivero(Double es_lote_vivero) {
		this.es_lote_vivero = es_lote_vivero;
	}

	public Double getEs_lote_vivero() {
		return this.es_lote_vivero;
	}

	public void setFn_distr_var1_m2(Double fn_distr_var1_m2) {
		this.fn_distr_var1_m2 = fn_distr_var1_m2;
	}

	public Double getFn_distr_var1_m2() {
		return this.fn_distr_var1_m2;
	}



	/* Sets & Gets FK*/

}