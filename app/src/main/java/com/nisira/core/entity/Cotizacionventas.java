package com.nisira.core.entity;

import com.nisira.annotation.ClavePrimaria;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

import java.util.Date;
import java.util.ArrayList;

@Tabla(nombre = "COTIZACIONVENTAS")
@XStreamAlias("COTIZACIONVENTAS")

public class Cotizacionventas implements Serializable {
	@ClavePrimaria
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@ClavePrimaria
	@Columna
	@SerializedName("idcotizacionv") 
	@XStreamAlias("idcotizacionv") 
	private String idcotizacionv = "" ;
	@Columna
	@SerializedName("idemisor") 
	@XStreamAlias("idemisor") 
	private String idemisor = "" ;
	@Columna
	@SerializedName("idsucursal") 
	@XStreamAlias("idsucursal") 
	private String idsucursal = "" ;
	@Columna
	@SerializedName("idalmacen") 
	@XStreamAlias("idalmacen") 
	private String idalmacen = "" ;
	@Columna
	@SerializedName("iddocumento") 
	@XStreamAlias("iddocumento") 
	private String iddocumento = "" ;
	@Columna
	@SerializedName("periodo") 
	@XStreamAlias("periodo") 
	private String periodo = "" ;
	@Columna
	@SerializedName("serie") 
	@XStreamAlias("serie") 
	private String serie = "" ;
	@Columna
	@SerializedName("numero") 
	@XStreamAlias("numero") 
	private String numero = "" ;
	@Columna
	@SerializedName("fecha") 
	@XStreamAlias("fecha") 
	private Date fecha;
	@Columna
	@SerializedName("idclieprov") 
	@XStreamAlias("idclieprov") 
	private String idclieprov = "" ;
	@Columna
	@SerializedName("idproyecto") 
	@XStreamAlias("idproyecto") 
	private String idproyecto = "" ;
	@Columna
	@SerializedName("tcambio") 
	@XStreamAlias("tcambio") 
	private Double tcambio = 0.00 ;
	@Columna
	@SerializedName("idmoneda") 
	@XStreamAlias("idmoneda") 
	private String idmoneda = "" ;
	@Columna
	@SerializedName("glosa") 
	@XStreamAlias("glosa") 
	private String glosa = "" ;
	@Columna
	@SerializedName("idestado") 
	@XStreamAlias("idestado") 
	private String idestado = "" ;
	@Columna
	@SerializedName("idestadoold") 
	@XStreamAlias("idestadoold") 
	private String idestadoold = "" ;
	@Columna
	@SerializedName("vventa") 
	@XStreamAlias("vventa") 
	private Double vventa = 0.00 ;
	@Columna
	@SerializedName("impuesto") 
	@XStreamAlias("impuesto") 
	private Double impuesto = 0.00 ;
	@Columna
	@SerializedName("impuesto_i") 
	@XStreamAlias("impuesto_i") 
	private Double impuesto_i = 0.00 ;
	@Columna
	@SerializedName("importe") 
	@XStreamAlias("importe") 
	private Double importe = 0.00 ;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;
	@Columna
	@SerializedName("sincroniza") 
	@XStreamAlias("sincroniza") 
	private String sincroniza = "" ;
	@Columna
	@SerializedName("contacto") 
	@XStreamAlias("contacto") 
	private String contacto = "" ;
	@Columna
	@SerializedName("lugar_entrega") 
	@XStreamAlias("lugar_entrega") 
	private String lugar_entrega = "" ;
	@Columna
	@SerializedName("solicitado") 
	@XStreamAlias("solicitado") 
	private String solicitado = "" ;
	@Columna
	@SerializedName("tcmoneda") 
	@XStreamAlias("tcmoneda") 
	private Double tcmoneda = 0.00 ;
	@Columna
	@SerializedName("subtotalsindscto") 
	@XStreamAlias("subtotalsindscto") 
	private Double subtotalsindscto = 0.00 ;
	@Columna
	@SerializedName("descuento") 
	@XStreamAlias("descuento") 
	private Double descuento = 0.00 ;
	@Columna
	@SerializedName("subtotalcondscto") 
	@XStreamAlias("subtotalcondscto") 
	private Double subtotalcondscto = 0.00 ;
	@Columna
	@SerializedName("fechavigencia") 
	@XStreamAlias("fechavigencia") 
	private Date fechavigencia;
	@Columna
	@SerializedName("duracionvigencia") 
	@XStreamAlias("duracionvigencia") 
	private Double duracionvigencia = 0.00 ;
	@Columna
	@SerializedName("confirmastock") 
	@XStreamAlias("confirmastock") 
	private Double confirmastock = 0.00 ;
	@Columna
	@SerializedName("fechavisita") 
	@XStreamAlias("fechavisita") 
	private Date fechavisita;
	@Columna
	@SerializedName("idfpago") 
	@XStreamAlias("idfpago") 
	private String idfpago = "" ;
	@Columna
	@SerializedName("plazoentrega") 
	@XStreamAlias("plazoentrega") 
	private String plazoentrega = "" ;
	@Columna
	@SerializedName("ventana") 
	@XStreamAlias("ventana") 
	private String ventana = "" ;
	@Columna
	@SerializedName("idvendedor") 
	@XStreamAlias("idvendedor") 
	private String idvendedor = "" ;
	@Columna
	@SerializedName("comision") 
	@XStreamAlias("comision") 
	private Double comision = 0.00 ;
	@Columna
	@SerializedName("idembalaje") 
	@XStreamAlias("idembalaje") 
	private String idembalaje = "" ;
	@Columna
	@SerializedName("garantia") 
	@XStreamAlias("garantia") 
	private String garantia = "" ;
	@Columna
	@SerializedName("idprevaloriza") 
	@XStreamAlias("idprevaloriza") 
	private String idprevaloriza = "" ;
	@Columna
	@SerializedName("referencia") 
	@XStreamAlias("referencia") 
	private String referencia = "" ;
	@Columna
	@SerializedName("multivendedores") 
	@XStreamAlias("multivendedores") 
	private Double multivendedores = 0.00 ;
	@Columna
	@SerializedName("pesobruto") 
	@XStreamAlias("pesobruto") 
	private Double pesobruto = 0.00 ;
	@Columna
	@SerializedName("pesotara") 
	@XStreamAlias("pesotara") 
	private Double pesotara = 0.00 ;
	@Columna
	@SerializedName("pesoneto") 
	@XStreamAlias("pesoneto") 
	private Double pesoneto = 0.00 ;
	@Columna
	@SerializedName("idtipocontenedor") 
	@XStreamAlias("idtipocontenedor") 
	private String idtipocontenedor = "" ;
	@Columna
	@SerializedName("nrocontenedor") 
	@XStreamAlias("nrocontenedor") 
	private String nrocontenedor = "" ;
	@Columna
	@SerializedName("ciudadorigen") 
	@XStreamAlias("ciudadorigen") 
	private String ciudadorigen = "" ;
	@Columna
	@SerializedName("ciudaddestino") 
	@XStreamAlias("ciudaddestino") 
	private String ciudaddestino = "" ;
	@Columna
	@SerializedName("fechaembarque") 
	@XStreamAlias("fechaembarque") 
	private Date fechaembarque;
	@Columna
	@SerializedName("fechaarribo") 
	@XStreamAlias("fechaarribo") 
	private Date fechaarribo;
	@Columna
	@SerializedName("idpuertoorigen") 
	@XStreamAlias("idpuertoorigen") 
	private String idpuertoorigen = "" ;
	@Columna
	@SerializedName("idpuertodestino") 
	@XStreamAlias("idpuertodestino") 
	private String idpuertodestino = "" ;
	@Columna
	@SerializedName("puertociudadori") 
	@XStreamAlias("puertociudadori") 
	private String puertociudadori = "" ;
	@Columna
	@SerializedName("puertociudaddes") 
	@XStreamAlias("puertociudaddes") 
	private String puertociudaddes = "" ;
	@Columna
	@SerializedName("idubigeo") 
	@XStreamAlias("idubigeo") 
	private String idubigeo = "" ;
	@Columna
	@SerializedName("container") 
	@XStreamAlias("container") 
	private String container = "" ;
	@Columna
	@SerializedName("idtipoprecio") 
	@XStreamAlias("idtipoprecio") 
	private String idtipoprecio = "" ;
	@Columna
	@SerializedName("idflete") 
	@XStreamAlias("idflete") 
	private String idflete = "" ;
	@Columna
	@SerializedName("exonerado") 
	@XStreamAlias("exonerado") 
	private Double exonerado = 0.00 ;
	@Columna
	@SerializedName("es_proyecto") 
	@XStreamAlias("es_proyecto") 
	private Double es_proyecto = 0.00 ;
	@Columna
	@SerializedName("smfcred") 
	@XStreamAlias("smfcred") 
	private String smfcred = "" ;
	@Columna
	@SerializedName("smfvenc") 
	@XStreamAlias("smfvenc") 
	private String smfvenc = "" ;
	@Columna
	@SerializedName("idunidadnegocio") 
	@XStreamAlias("idunidadnegocio") 
	private String idunidadnegocio = "" ;
	@Columna
	@SerializedName("idsubunidadnegocio") 
	@XStreamAlias("idsubunidadnegocio") 
	private String idsubunidadnegocio = "" ;
	@Columna
	@SerializedName("area_ha") 
	@XStreamAlias("area_ha") 
	private Double area_ha = 0.00 ;
	@Columna
	@SerializedName("redondeo") 
	@XStreamAlias("redondeo") 
	private Double redondeo = 0.00 ;
	@Columna
	@SerializedName("fleteusd") 
	@XStreamAlias("fleteusd") 
	private Double fleteusd = 0.00 ;
	@Columna
	@SerializedName("idagentecarga") 
	@XStreamAlias("idagentecarga") 
	private String idagentecarga = "" ;
	@Columna
	@SerializedName("idcondventa") 
	@XStreamAlias("idcondventa") 
	private String idcondventa = "" ;
	@Columna
	@SerializedName("idlineaaerea") 
	@XStreamAlias("idlineaaerea") 
	private String idlineaaerea = "" ;
	@Columna
	@SerializedName("nro_forma_pago") 
	@XStreamAlias("nro_forma_pago") 
	private String nro_forma_pago = "" ;
	@Columna
	@SerializedName("nro_manual") 
	@XStreamAlias("nro_manual") 
	private String nro_manual = "" ;
	@Columna
	@SerializedName("idclieprov_destino") 
	@XStreamAlias("idclieprov_destino") 
	private String idclieprov_destino = "" ;
	@Columna
	@SerializedName("prioridad") 
	@XStreamAlias("prioridad") 
	private Integer prioridad;
	@Columna
	@SerializedName("nrobuckin") 
	@XStreamAlias("nrobuckin") 
	private String nrobuckin = "" ;
	@Columna
	@SerializedName("contenedor") 
	@XStreamAlias("contenedor") 
	private String contenedor = "" ;
	@Columna
	@SerializedName("peso_real") 
	@XStreamAlias("peso_real") 
	private Double peso_real = 0.00 ;
	@Columna
	@SerializedName("nro_viaje") 
	@XStreamAlias("nro_viaje") 
	private String nro_viaje = "" ;
	@Columna
	@SerializedName("nombre_nave") 
	@XStreamAlias("nombre_nave") 
	private String nombre_nave = "" ;
	@Columna
	@SerializedName("iddocumento_pf") 
	@XStreamAlias("iddocumento_pf") 
	private String iddocumento_pf = "" ;
	@Columna
	@SerializedName("serie_pf") 
	@XStreamAlias("serie_pf") 
	private String serie_pf = "" ;
	@Columna
	@SerializedName("numero_pf") 
	@XStreamAlias("numero_pf") 
	private String numero_pf = "" ;
	@Columna
	@SerializedName("fecha_pf") 
	@XStreamAlias("fecha_pf") 
	private Date fecha_pf;
	@Columna
	@SerializedName("glosa_l") 
	@XStreamAlias("glosa_l") 
	private String glosa_l = "" ;
	@Columna
	@SerializedName("awb") 
	@XStreamAlias("awb") 
	private String awb = "" ;
	@Columna
	@SerializedName("idcultivo") 
	@XStreamAlias("idcultivo") 
	private String idcultivo = "" ;
	@Columna
	@SerializedName("idvariedad") 
	@XStreamAlias("idvariedad") 
	private String idvariedad = "" ;
	@Columna
	@SerializedName("idestadobanco") 
	@XStreamAlias("idestadobanco") 
	private String idestadobanco = "" ;
	@Columna
	@SerializedName("idtg30campaniaveh") 
	@XStreamAlias("idtg30campaniaveh") 
	private Integer idtg30campaniaveh;
	@Columna
	@SerializedName("idbanco") 
	@XStreamAlias("idbanco") 
	private String idbanco = "" ;
	@Columna
	@SerializedName("ofrecio_seguro") 
	@XStreamAlias("ofrecio_seguro") 
	private String ofrecio_seguro = "" ;
	@Columna
	@SerializedName("copropietario") 
	@XStreamAlias("copropietario") 
	private Double copropietario = 0.00 ;
	@Columna
	@SerializedName("idtipocredito") 
	@XStreamAlias("idtipocredito") 
	private String idtipocredito = "" ;
	@Columna
	@SerializedName("cuota") 
	@XStreamAlias("cuota") 
	private String cuota = "" ;
	@Columna
	@SerializedName("vventapublico_conigv") 
	@XStreamAlias("vventapublico_conigv") 
	private Double vventapublico_conigv = 0.00 ;
	@Columna
	@SerializedName("importedscto1_conigv") 
	@XStreamAlias("importedscto1_conigv") 
	private Double importedscto1_conigv = 0.00 ;
	@Columna
	@SerializedName("importedscto2_conigv") 
	@XStreamAlias("importedscto2_conigv") 
	private Double importedscto2_conigv = 0.00 ;
	@Columna
	@SerializedName("importedscto3_conigv") 
	@XStreamAlias("importedscto3_conigv") 
	private Double importedscto3_conigv = 0.00 ;
	@Columna
	@SerializedName("accesorios_conigv") 
	@XStreamAlias("accesorios_conigv") 
	private Double accesorios_conigv = 0.00 ;
	@Columna
	@SerializedName("idcopropietario") 
	@XStreamAlias("idcopropietario") 
	private String idcopropietario = "" ;
	@Columna
	@SerializedName("idtg10tipocotizacion") 
	@XStreamAlias("idtg10tipocotizacion") 
	private String idtg10tipocotizacion = "" ;
	@Columna
	@SerializedName("idtg30cotvent_web") 
	@XStreamAlias("idtg30cotvent_web") 
	private Integer idtg30cotvent_web;
	@Columna
	@SerializedName("cuotainicial") 
	@XStreamAlias("cuotainicial") 
	private Double cuotainicial = 0.00 ;
	@Columna
	@SerializedName("idctacte") 
	@XStreamAlias("idctacte") 
	private String idctacte = "" ;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdcotizacionv(String idcotizacionv) {
		this.idcotizacionv = idcotizacionv;
	}

	public String getIdcotizacionv() {
		return this.idcotizacionv;
	}

	public void setIdemisor(String idemisor) {
		this.idemisor = idemisor;
	}

	public String getIdemisor() {
		return this.idemisor;
	}

	public void setIdsucursal(String idsucursal) {
		this.idsucursal = idsucursal;
	}

	public String getIdsucursal() {
		return this.idsucursal;
	}

	public void setIdalmacen(String idalmacen) {
		this.idalmacen = idalmacen;
	}

	public String getIdalmacen() {
		return this.idalmacen;
	}

	public void setIddocumento(String iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getIddocumento() {
		return this.iddocumento;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setIdclieprov(String idclieprov) {
		this.idclieprov = idclieprov;
	}

	public String getIdclieprov() {
		return this.idclieprov;
	}

	public void setIdproyecto(String idproyecto) {
		this.idproyecto = idproyecto;
	}

	public String getIdproyecto() {
		return this.idproyecto;
	}

	public void setTcambio(Double tcambio) {
		this.tcambio = tcambio;
	}

	public Double getTcambio() {
		return this.tcambio;
	}

	public void setIdmoneda(String idmoneda) {
		this.idmoneda = idmoneda;
	}

	public String getIdmoneda() {
		return this.idmoneda;
	}

	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}

	public String getGlosa() {
		return this.glosa;
	}

	public void setIdestado(String idestado) {
		this.idestado = idestado;
	}

	public String getIdestado() {
		return this.idestado;
	}

	public void setIdestadoold(String idestadoold) {
		this.idestadoold = idestadoold;
	}

	public String getIdestadoold() {
		return this.idestadoold;
	}

	public void setVventa(Double vventa) {
		this.vventa = vventa;
	}

	public Double getVventa() {
		return this.vventa;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public Double getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto_i(Double impuesto_i) {
		this.impuesto_i = impuesto_i;
	}

	public Double getImpuesto_i() {
		return this.impuesto_i;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Double getImporte() {
		return this.importe;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setSincroniza(String sincroniza) {
		this.sincroniza = sincroniza;
	}

	public String getSincroniza() {
		return this.sincroniza;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setLugar_entrega(String lugar_entrega) {
		this.lugar_entrega = lugar_entrega;
	}

	public String getLugar_entrega() {
		return this.lugar_entrega;
	}

	public void setSolicitado(String solicitado) {
		this.solicitado = solicitado;
	}

	public String getSolicitado() {
		return this.solicitado;
	}

	public void setTcmoneda(Double tcmoneda) {
		this.tcmoneda = tcmoneda;
	}

	public Double getTcmoneda() {
		return this.tcmoneda;
	}

	public void setSubtotalsindscto(Double subtotalsindscto) {
		this.subtotalsindscto = subtotalsindscto;
	}

	public Double getSubtotalsindscto() {
		return this.subtotalsindscto;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getDescuento() {
		return this.descuento;
	}

	public void setSubtotalcondscto(Double subtotalcondscto) {
		this.subtotalcondscto = subtotalcondscto;
	}

	public Double getSubtotalcondscto() {
		return this.subtotalcondscto;
	}

	public void setFechavigencia(Date fechavigencia) {
		this.fechavigencia = fechavigencia;
	}

	public Date getFechavigencia() {
		return this.fechavigencia;
	}

	public void setDuracionvigencia(Double duracionvigencia) {
		this.duracionvigencia = duracionvigencia;
	}

	public Double getDuracionvigencia() {
		return this.duracionvigencia;
	}

	public void setConfirmastock(Double confirmastock) {
		this.confirmastock = confirmastock;
	}

	public Double getConfirmastock() {
		return this.confirmastock;
	}

	public void setFechavisita(Date fechavisita) {
		this.fechavisita = fechavisita;
	}

	public Date getFechavisita() {
		return this.fechavisita;
	}

	public void setIdfpago(String idfpago) {
		this.idfpago = idfpago;
	}

	public String getIdfpago() {
		return this.idfpago;
	}

	public void setPlazoentrega(String plazoentrega) {
		this.plazoentrega = plazoentrega;
	}

	public String getPlazoentrega() {
		return this.plazoentrega;
	}

	public void setVentana(String ventana) {
		this.ventana = ventana;
	}

	public String getVentana() {
		return this.ventana;
	}

	public void setIdvendedor(String idvendedor) {
		this.idvendedor = idvendedor;
	}

	public String getIdvendedor() {
		return this.idvendedor;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Double getComision() {
		return this.comision;
	}

	public void setIdembalaje(String idembalaje) {
		this.idembalaje = idembalaje;
	}

	public String getIdembalaje() {
		return this.idembalaje;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public String getGarantia() {
		return this.garantia;
	}

	public void setIdprevaloriza(String idprevaloriza) {
		this.idprevaloriza = idprevaloriza;
	}

	public String getIdprevaloriza() {
		return this.idprevaloriza;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setMultivendedores(Double multivendedores) {
		this.multivendedores = multivendedores;
	}

	public Double getMultivendedores() {
		return this.multivendedores;
	}

	public void setPesobruto(Double pesobruto) {
		this.pesobruto = pesobruto;
	}

	public Double getPesobruto() {
		return this.pesobruto;
	}

	public void setPesotara(Double pesotara) {
		this.pesotara = pesotara;
	}

	public Double getPesotara() {
		return this.pesotara;
	}

	public void setPesoneto(Double pesoneto) {
		this.pesoneto = pesoneto;
	}

	public Double getPesoneto() {
		return this.pesoneto;
	}

	public void setIdtipocontenedor(String idtipocontenedor) {
		this.idtipocontenedor = idtipocontenedor;
	}

	public String getIdtipocontenedor() {
		return this.idtipocontenedor;
	}

	public void setNrocontenedor(String nrocontenedor) {
		this.nrocontenedor = nrocontenedor;
	}

	public String getNrocontenedor() {
		return this.nrocontenedor;
	}

	public void setCiudadorigen(String ciudadorigen) {
		this.ciudadorigen = ciudadorigen;
	}

	public String getCiudadorigen() {
		return this.ciudadorigen;
	}

	public void setCiudaddestino(String ciudaddestino) {
		this.ciudaddestino = ciudaddestino;
	}

	public String getCiudaddestino() {
		return this.ciudaddestino;
	}

	public void setFechaembarque(Date fechaembarque) {
		this.fechaembarque = fechaembarque;
	}

	public Date getFechaembarque() {
		return this.fechaembarque;
	}

	public void setFechaarribo(Date fechaarribo) {
		this.fechaarribo = fechaarribo;
	}

	public Date getFechaarribo() {
		return this.fechaarribo;
	}

	public void setIdpuertoorigen(String idpuertoorigen) {
		this.idpuertoorigen = idpuertoorigen;
	}

	public String getIdpuertoorigen() {
		return this.idpuertoorigen;
	}

	public void setIdpuertodestino(String idpuertodestino) {
		this.idpuertodestino = idpuertodestino;
	}

	public String getIdpuertodestino() {
		return this.idpuertodestino;
	}

	public void setPuertociudadori(String puertociudadori) {
		this.puertociudadori = puertociudadori;
	}

	public String getPuertociudadori() {
		return this.puertociudadori;
	}

	public void setPuertociudaddes(String puertociudaddes) {
		this.puertociudaddes = puertociudaddes;
	}

	public String getPuertociudaddes() {
		return this.puertociudaddes;
	}

	public void setIdubigeo(String idubigeo) {
		this.idubigeo = idubigeo;
	}

	public String getIdubigeo() {
		return this.idubigeo;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getContainer() {
		return this.container;
	}

	public void setIdtipoprecio(String idtipoprecio) {
		this.idtipoprecio = idtipoprecio;
	}

	public String getIdtipoprecio() {
		return this.idtipoprecio;
	}

	public void setIdflete(String idflete) {
		this.idflete = idflete;
	}

	public String getIdflete() {
		return this.idflete;
	}

	public void setExonerado(Double exonerado) {
		this.exonerado = exonerado;
	}

	public Double getExonerado() {
		return this.exonerado;
	}

	public void setEs_proyecto(Double es_proyecto) {
		this.es_proyecto = es_proyecto;
	}

	public Double getEs_proyecto() {
		return this.es_proyecto;
	}

	public void setSmfcred(String smfcred) {
		this.smfcred = smfcred;
	}

	public String getSmfcred() {
		return this.smfcred;
	}

	public void setSmfvenc(String smfvenc) {
		this.smfvenc = smfvenc;
	}

	public String getSmfvenc() {
		return this.smfvenc;
	}

	public void setIdunidadnegocio(String idunidadnegocio) {
		this.idunidadnegocio = idunidadnegocio;
	}

	public String getIdunidadnegocio() {
		return this.idunidadnegocio;
	}

	public void setIdsubunidadnegocio(String idsubunidadnegocio) {
		this.idsubunidadnegocio = idsubunidadnegocio;
	}

	public String getIdsubunidadnegocio() {
		return this.idsubunidadnegocio;
	}

	public void setArea_ha(Double area_ha) {
		this.area_ha = area_ha;
	}

	public Double getArea_ha() {
		return this.area_ha;
	}

	public void setRedondeo(Double redondeo) {
		this.redondeo = redondeo;
	}

	public Double getRedondeo() {
		return this.redondeo;
	}

	public void setFleteusd(Double fleteusd) {
		this.fleteusd = fleteusd;
	}

	public Double getFleteusd() {
		return this.fleteusd;
	}

	public void setIdagentecarga(String idagentecarga) {
		this.idagentecarga = idagentecarga;
	}

	public String getIdagentecarga() {
		return this.idagentecarga;
	}

	public void setIdcondventa(String idcondventa) {
		this.idcondventa = idcondventa;
	}

	public String getIdcondventa() {
		return this.idcondventa;
	}

	public void setIdlineaaerea(String idlineaaerea) {
		this.idlineaaerea = idlineaaerea;
	}

	public String getIdlineaaerea() {
		return this.idlineaaerea;
	}

	public void setNro_forma_pago(String nro_forma_pago) {
		this.nro_forma_pago = nro_forma_pago;
	}

	public String getNro_forma_pago() {
		return this.nro_forma_pago;
	}

	public void setNro_manual(String nro_manual) {
		this.nro_manual = nro_manual;
	}

	public String getNro_manual() {
		return this.nro_manual;
	}

	public void setIdclieprov_destino(String idclieprov_destino) {
		this.idclieprov_destino = idclieprov_destino;
	}

	public String getIdclieprov_destino() {
		return this.idclieprov_destino;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public Integer getPrioridad() {
		return this.prioridad;
	}

	public void setNrobuckin(String nrobuckin) {
		this.nrobuckin = nrobuckin;
	}

	public String getNrobuckin() {
		return this.nrobuckin;
	}

	public void setContenedor(String contenedor) {
		this.contenedor = contenedor;
	}

	public String getContenedor() {
		return this.contenedor;
	}

	public void setPeso_real(Double peso_real) {
		this.peso_real = peso_real;
	}

	public Double getPeso_real() {
		return this.peso_real;
	}

	public void setNro_viaje(String nro_viaje) {
		this.nro_viaje = nro_viaje;
	}

	public String getNro_viaje() {
		return this.nro_viaje;
	}

	public void setNombre_nave(String nombre_nave) {
		this.nombre_nave = nombre_nave;
	}

	public String getNombre_nave() {
		return this.nombre_nave;
	}

	public void setIddocumento_pf(String iddocumento_pf) {
		this.iddocumento_pf = iddocumento_pf;
	}

	public String getIddocumento_pf() {
		return this.iddocumento_pf;
	}

	public void setSerie_pf(String serie_pf) {
		this.serie_pf = serie_pf;
	}

	public String getSerie_pf() {
		return this.serie_pf;
	}

	public void setNumero_pf(String numero_pf) {
		this.numero_pf = numero_pf;
	}

	public String getNumero_pf() {
		return this.numero_pf;
	}

	public void setFecha_pf(Date fecha_pf) {
		this.fecha_pf = fecha_pf;
	}

	public Date getFecha_pf() {
		return this.fecha_pf;
	}

	public void setGlosa_l(String glosa_l) {
		this.glosa_l = glosa_l;
	}

	public String getGlosa_l() {
		return this.glosa_l;
	}

	public void setAwb(String awb) {
		this.awb = awb;
	}

	public String getAwb() {
		return this.awb;
	}

	public void setIdcultivo(String idcultivo) {
		this.idcultivo = idcultivo;
	}

	public String getIdcultivo() {
		return this.idcultivo;
	}

	public void setIdvariedad(String idvariedad) {
		this.idvariedad = idvariedad;
	}

	public String getIdvariedad() {
		return this.idvariedad;
	}

	public void setIdestadobanco(String idestadobanco) {
		this.idestadobanco = idestadobanco;
	}

	public String getIdestadobanco() {
		return this.idestadobanco;
	}

	public void setIdtg30campaniaveh(Integer idtg30campaniaveh) {
		this.idtg30campaniaveh = idtg30campaniaveh;
	}

	public Integer getIdtg30campaniaveh() {
		return this.idtg30campaniaveh;
	}

	public void setIdbanco(String idbanco) {
		this.idbanco = idbanco;
	}

	public String getIdbanco() {
		return this.idbanco;
	}

	public void setOfrecio_seguro(String ofrecio_seguro) {
		this.ofrecio_seguro = ofrecio_seguro;
	}

	public String getOfrecio_seguro() {
		return this.ofrecio_seguro;
	}

	public void setCopropietario(Double copropietario) {
		this.copropietario = copropietario;
	}

	public Double getCopropietario() {
		return this.copropietario;
	}

	public void setIdtipocredito(String idtipocredito) {
		this.idtipocredito = idtipocredito;
	}

	public String getIdtipocredito() {
		return this.idtipocredito;
	}

	public void setCuota(String cuota) {
		this.cuota = cuota;
	}

	public String getCuota() {
		return this.cuota;
	}

	public void setVventapublico_conigv(Double vventapublico_conigv) {
		this.vventapublico_conigv = vventapublico_conigv;
	}

	public Double getVventapublico_conigv() {
		return this.vventapublico_conigv;
	}

	public void setImportedscto1_conigv(Double importedscto1_conigv) {
		this.importedscto1_conigv = importedscto1_conigv;
	}

	public Double getImportedscto1_conigv() {
		return this.importedscto1_conigv;
	}

	public void setImportedscto2_conigv(Double importedscto2_conigv) {
		this.importedscto2_conigv = importedscto2_conigv;
	}

	public Double getImportedscto2_conigv() {
		return this.importedscto2_conigv;
	}

	public void setImportedscto3_conigv(Double importedscto3_conigv) {
		this.importedscto3_conigv = importedscto3_conigv;
	}

	public Double getImportedscto3_conigv() {
		return this.importedscto3_conigv;
	}

	public void setAccesorios_conigv(Double accesorios_conigv) {
		this.accesorios_conigv = accesorios_conigv;
	}

	public Double getAccesorios_conigv() {
		return this.accesorios_conigv;
	}

	public void setIdcopropietario(String idcopropietario) {
		this.idcopropietario = idcopropietario;
	}

	public String getIdcopropietario() {
		return this.idcopropietario;
	}

	public void setIdtg10tipocotizacion(String idtg10tipocotizacion) {
		this.idtg10tipocotizacion = idtg10tipocotizacion;
	}

	public String getIdtg10tipocotizacion() {
		return this.idtg10tipocotizacion;
	}

	public void setIdtg30cotvent_web(Integer idtg30cotvent_web) {
		this.idtg30cotvent_web = idtg30cotvent_web;
	}

	public Integer getIdtg30cotvent_web() {
		return this.idtg30cotvent_web;
	}

	public void setCuotainicial(Double cuotainicial) {
		this.cuotainicial = cuotainicial;
	}

	public Double getCuotainicial() {
		return this.cuotainicial;
	}

	public void setIdctacte(String idctacte) {
		this.idctacte = idctacte;
	}

	public String getIdctacte() {
		return this.idctacte;
	}



	/* Sets & Gets FK*/

}