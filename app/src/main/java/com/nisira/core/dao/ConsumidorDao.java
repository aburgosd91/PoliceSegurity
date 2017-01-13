package com.nisira.core.dao;

import com.nisira.core.BaseDao;
import com.nisira.core.entity.*;
import java.util.List;
import android.database.sqlite.SQLiteDatabase;
import com.nisira.core.database.DataBaseClass;
import android.content.ContentValues;
import android.database.Cursor;
import com.nisira.core.util.ClaveMovil;
import java.util.ArrayList;
import java.util.LinkedList;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.nisira.core.NisiraORMException;

public class ConsumidorDao{

	public Boolean insert(Consumidor consumidor) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",consumidor.getIdempresa()); 
			initialValues.put("IDCONSUMIDOR",consumidor.getIdconsumidor()); 
			initialValues.put("TIPO",consumidor.getTipo()); 
			initialValues.put("JERARQUIA",consumidor.getJerarquia()); 
			initialValues.put("DESCRIPCION",consumidor.getDescripcion()); 
			initialValues.put("IDCCOSTO",consumidor.getIdccosto()); 
			initialValues.put("FECHA_INGRESO",dateFormat.format(consumidor.getFecha_ingreso() ) ); 
			initialValues.put("FECHA_BAJA",dateFormat.format(consumidor.getFecha_baja() ) ); 
			initialValues.put("IDSUCURSAL",consumidor.getIdsucursal()); 
			initialValues.put("AREA",consumidor.getArea()); 
			initialValues.put("IDTENERGIA",consumidor.getIdtenergia()); 
			initialValues.put("CAUDAL",consumidor.getCaudal()); 
			initialValues.put("IDPERTENECE",consumidor.getIdpertenece()); 
			initialValues.put("TIPOCALCULO",consumidor.getTipocalculo()); 
			initialValues.put("COSTO_MOF",consumidor.getCosto_mof()); 
			initialValues.put("COSTO_MEX",consumidor.getCosto_mex()); 
			initialValues.put("TIPOMAQUINA",consumidor.getTipomaquina()); 
			initialValues.put("IDPRODUCTO",consumidor.getIdproducto()); 
			initialValues.put("PLANIFICADO",consumidor.getPlanificado()); 
			initialValues.put("PRODUCIDO",consumidor.getProducido()); 
			initialValues.put("GRUPO",consumidor.getGrupo()); 
			initialValues.put("ESTADO",consumidor.getEstado()); 
			initialValues.put("SINCRONIZA",consumidor.getSincroniza()); 
			initialValues.put("FECHACREACION",dateFormat.format(consumidor.getFechacreacion() ) ); 
			initialValues.put("ESCARGA",consumidor.getEscarga()); 
			initialValues.put("MARCA",consumidor.getMarca()); 
			initialValues.put("PLACA",consumidor.getPlaca()); 
			initialValues.put("REGMTC",consumidor.getRegmtc()); 
			initialValues.put("NROEJES",consumidor.getNroejes()); 
			initialValues.put("CARGAUTIL",consumidor.getCargautil()); 
			initialValues.put("TIPOVEHICULO",consumidor.getTipovehiculo()); 
			initialValues.put("ANIO",consumidor.getAnio()); 
			initialValues.put("KMINICIAL",consumidor.getKminicial()); 
			initialValues.put("IDCONTROLADOR",consumidor.getIdcontrolador()); 
			initialValues.put("NRO_VALVULA",consumidor.getNro_valvula()); 
			initialValues.put("IDSERIE",consumidor.getIdserie()); 
			initialValues.put("KILOMETROS",consumidor.getKilometros()); 
			initialValues.put("IDNIVELCONSUMIDOR",consumidor.getIdnivelconsumidor()); 
			initialValues.put("DESCRIPCIONCORTA",consumidor.getDescripcioncorta()); 
			initialValues.put("CODIGO_CONTROL",consumidor.getCodigo_control()); 
			initialValues.put("ES_TITULO",consumidor.getEs_titulo()); 
			initialValues.put("GASTOXACTIVIDAD",consumidor.getGastoxactividad()); 
			initialValues.put("FINAL",consumidor.getFinal()); 
			initialValues.put("CUENTA_ABONO",consumidor.getCuenta_abono()); 
			initialValues.put("CUENTA_CARGO",consumidor.getCuenta_cargo()); 
			initialValues.put("CUENTA_DESTINO",consumidor.getCuenta_destino()); 
			initialValues.put("IDACTIVIDAD",consumidor.getIdactividad()); 
			initialValues.put("IDSIEMBRA",consumidor.getIdsiembra()); 
			initialValues.put("IDCAMPANA",consumidor.getIdcampana()); 
			initialValues.put("IDORDENPRODUCCION",consumidor.getIdordenproduccion()); 
			initialValues.put("IDLOTEPRODUCCION",consumidor.getIdloteproduccion()); 
			initialValues.put("CREACC",consumidor.getCreacc()); 
			initialValues.put("ES_PRODUCCION",consumidor.getEs_produccion()); 
			initialValues.put("CODIGO_LOTIZAR",consumidor.getCodigo_lotizar()); 
			initialValues.put("VVENTA_MOF",consumidor.getVventa_mof()); 
			initialValues.put("VVENTA_MEX",consumidor.getVventa_mex()); 
			initialValues.put("IDUNIDADNEGOCIO",consumidor.getIdunidadnegocio()); 
			initialValues.put("IDCLASECCOSTO",consumidor.getIdclaseccosto()); 
			initialValues.put("IDCUENTAC_PT",consumidor.getIdcuentac_pt()); 
			initialValues.put("IDCUENTAA_PT",consumidor.getIdcuentaa_pt()); 
			initialValues.put("IDCUENTAC_PP",consumidor.getIdcuentac_pp()); 
			initialValues.put("IDCUENTAA_PP",consumidor.getIdcuentaa_pp()); 
			initialValues.put("TIPO_COSTEO",consumidor.getTipo_costeo()); 
			initialValues.put("IDFUNCION",consumidor.getIdfuncion()); 
			initialValues.put("IDMOTIVO_REVAL",consumidor.getIdmotivo_reval()); 
			initialValues.put("IDSUCURSAL_REVAL",consumidor.getIdsucursal_reval()); 
			initialValues.put("IDALMACEN_REVAL",consumidor.getIdalmacen_reval()); 
			initialValues.put("IDDOCUMENTO_REVAL",consumidor.getIddocumento_reval()); 
			initialValues.put("IDFACTORDISTRIBUCION",consumidor.getIdfactordistribucion()); 
			initialValues.put("COSTOHA_MEX",consumidor.getCostoha_mex()); 
			initialValues.put("COSTOHA_MOF",consumidor.getCostoha_mof()); 
			initialValues.put("DISTR_COSTOFINAL",consumidor.getDistr_costofinal()); 
			initialValues.put("ESXPERIODO",consumidor.getEsxperiodo()); 
			initialValues.put("NOMBRE_REGISTRO",consumidor.getNombre_registro()); 
			initialValues.put("NRO_REGISTRO",consumidor.getNro_registro()); 
			initialValues.put("TIPO_COSTO",consumidor.getTipo_costo()); 
			initialValues.put("IDPARTEPRODUCCION",consumidor.getIdparteproduccion()); 
			initialValues.put("ALGORITMOPRECIO",consumidor.getAlgoritmoprecio()); 
			initialValues.put("IDPROVLOTE",consumidor.getIdprovlote()); 
			initialValues.put("IDMEDIDA",consumidor.getIdmedida()); 
			initialValues.put("DESCARGA",consumidor.getDescarga()); 
			initialValues.put("ESVEHTERCERO",consumidor.getEsvehtercero()); 
			initialValues.put("GENERA_VIAJET",consumidor.getGenera_viajet()); 
			initialValues.put("GENERA_REMTRANSPORTISTA",consumidor.getGenera_remtransportista()); 
			initialValues.put("IDVIAJET",consumidor.getIdviajet()); 
			initialValues.put("IDREMTRANSPORTISTA",consumidor.getIdremtransportista()); 
			initialValues.put("NRV_ASIGNACION",consumidor.getNrv_asignacion()); 
			initialValues.put("GROWERCODE",consumidor.getGrowercode()); 
			initialValues.put("VER_TRANSFORMACION",consumidor.getVer_transformacion()); 
			initialValues.put("IDCUENTA_CP",consumidor.getIdcuenta_cp()); 
			initialValues.put("CAPACIDAD",consumidor.getCapacidad()); 
			initialValues.put("IDALMACEN",consumidor.getIdalmacen()); 
			initialValues.put("IDFUENTEAGUA",consumidor.getIdfuenteagua()); 
			initialValues.put("IDCLIEPROV_VEHTERCERO",consumidor.getIdclieprov_vehtercero()); 
			initialValues.put("ES_SERVICIO",consumidor.getEs_servicio()); 
			initialValues.put("IDCUENTADIV9",consumidor.getIdcuentadiv9()); 
			initialValues.put("ESALQUILADO",consumidor.getEsalquilado()); 
			initialValues.put("NO_PARTICIPADISTRIBUCION",consumidor.getNo_participadistribucion()); 
			initialValues.put("ES_MANTENIMIENTO",consumidor.getEs_mantenimiento()); 
			initialValues.put("IDGRUPO_MAQ",consumidor.getIdgrupo_maq()); 
			initialValues.put("DISTRIBUCION_DWH",consumidor.getDistribucion_dwh()); 
			initialValues.put("NOMBRE_CORTO",consumidor.getNombre_corto()); 
			initialValues.put("IDSUBSECTORCONSUMIDOR",consumidor.getIdsubsectorconsumidor()); 
			initialValues.put("ES_COSECHA",consumidor.getEs_cosecha()); 
			initialValues.put("CAPACIDAD_TANQUE",consumidor.getCapacidad_tanque()); 
			initialValues.put("IDBASEDATOS",consumidor.getIdbasedatos()); 
			initialValues.put("IDACTIVO",consumidor.getIdactivo()); 
			initialValues.put("IDINGRESOSALIDAACTIVO",consumidor.getIdingresosalidaactivo()); 
			initialValues.put("IDCTAACTIVO",consumidor.getIdctaactivo()); 
			initialValues.put("ES_REPROCESO",consumidor.getEs_reproceso()); 
			initialValues.put("ES_REEMPAQUE",consumidor.getEs_reempaque()); 
			initialValues.put("ES_AVICOLA",consumidor.getEs_avicola()); 
			initialValues.put("TIPO_PRESUPUESTO",consumidor.getTipo_presupuesto()); 
			initialValues.put("ES_EMPAQUE",consumidor.getEs_empaque()); 
			initialValues.put("IDCONSUMIDOR_SPRING",consumidor.getIdconsumidor_spring()); 
			initialValues.put("ES_LOTE_CAMPO",consumidor.getEs_lote_campo()); 
			initialValues.put("ES_SECADO",consumidor.getEs_secado()); 
			initialValues.put("CERTIFICADO",consumidor.getCertificado()); 
			initialValues.put("TIPO_PRECIO_FUENTE",consumidor.getTipo_precio_fuente()); 
			initialValues.put("CODIGO_PARCELA",consumidor.getCodigo_parcela()); 
			initialValues.put("COSTOKM_MOF",consumidor.getCostokm_mof()); 
			initialValues.put("COSTOKM_MEX",consumidor.getCostokm_mex()); 
			initialValues.put("COSTODIA_MOF",consumidor.getCostodia_mof()); 
			initialValues.put("COSTODIA_MEX",consumidor.getCostodia_mex()); 
			initialValues.put("IDLINEA_AVICOLA",consumidor.getIdlinea_avicola()); 
			initialValues.put("PERMANENCIA",consumidor.getPermanencia()); 
			initialValues.put("DIAS_GENPRESUP",consumidor.getDias_genpresup()); 
			initialValues.put("IDMEDIDA_MAQ",consumidor.getIdmedida_maq()); 
			initialValues.put("CAPACIDAD_MAQ",consumidor.getCapacidad_maq()); 
			initialValues.put("VVENTA_UM_MOF",consumidor.getVventa_um_mof()); 
			initialValues.put("VVENTA_UM_MEX",consumidor.getVventa_um_mex()); 
			initialValues.put("TIPO_REGISTRO_PARTE",consumidor.getTipo_registro_parte()); 
			initialValues.put("VER_DIGITACION",consumidor.getVer_digitacion()); 
			initialValues.put("ES_LOTE_VIVERO",consumidor.getEs_lote_vivero()); 
			initialValues.put("FN_DISTR_VAR1_M2",consumidor.getFn_distr_var1_m2()); 
			resultado = mDb.insert("CONSUMIDOR",null,initialValues)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public Boolean update(Consumidor consumidor,String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",consumidor.getIdempresa()) ; 
			initialValues.put("IDCONSUMIDOR",consumidor.getIdconsumidor()) ; 
			initialValues.put("TIPO",consumidor.getTipo()) ; 
			initialValues.put("JERARQUIA",consumidor.getJerarquia()) ; 
			initialValues.put("DESCRIPCION",consumidor.getDescripcion()) ; 
			initialValues.put("IDCCOSTO",consumidor.getIdccosto()) ; 
			initialValues.put("FECHA_INGRESO",dateFormat.format(consumidor.getFecha_ingreso() ) ) ; 
			initialValues.put("FECHA_BAJA",dateFormat.format(consumidor.getFecha_baja() ) ) ; 
			initialValues.put("IDSUCURSAL",consumidor.getIdsucursal()) ; 
			initialValues.put("AREA",consumidor.getArea()) ; 
			initialValues.put("IDTENERGIA",consumidor.getIdtenergia()) ; 
			initialValues.put("CAUDAL",consumidor.getCaudal()) ; 
			initialValues.put("IDPERTENECE",consumidor.getIdpertenece()) ; 
			initialValues.put("TIPOCALCULO",consumidor.getTipocalculo()) ; 
			initialValues.put("COSTO_MOF",consumidor.getCosto_mof()) ; 
			initialValues.put("COSTO_MEX",consumidor.getCosto_mex()) ; 
			initialValues.put("TIPOMAQUINA",consumidor.getTipomaquina()) ; 
			initialValues.put("IDPRODUCTO",consumidor.getIdproducto()) ; 
			initialValues.put("PLANIFICADO",consumidor.getPlanificado()) ; 
			initialValues.put("PRODUCIDO",consumidor.getProducido()) ; 
			initialValues.put("GRUPO",consumidor.getGrupo()) ; 
			initialValues.put("ESTADO",consumidor.getEstado()) ; 
			initialValues.put("SINCRONIZA",consumidor.getSincroniza()) ; 
			initialValues.put("FECHACREACION",dateFormat.format(consumidor.getFechacreacion() ) ) ; 
			initialValues.put("ESCARGA",consumidor.getEscarga()) ; 
			initialValues.put("MARCA",consumidor.getMarca()) ; 
			initialValues.put("PLACA",consumidor.getPlaca()) ; 
			initialValues.put("REGMTC",consumidor.getRegmtc()) ; 
			initialValues.put("NROEJES",consumidor.getNroejes()) ; 
			initialValues.put("CARGAUTIL",consumidor.getCargautil()) ; 
			initialValues.put("TIPOVEHICULO",consumidor.getTipovehiculo()) ; 
			initialValues.put("ANIO",consumidor.getAnio()) ; 
			initialValues.put("KMINICIAL",consumidor.getKminicial()) ; 
			initialValues.put("IDCONTROLADOR",consumidor.getIdcontrolador()) ; 
			initialValues.put("NRO_VALVULA",consumidor.getNro_valvula()) ; 
			initialValues.put("IDSERIE",consumidor.getIdserie()) ; 
			initialValues.put("KILOMETROS",consumidor.getKilometros()) ; 
			initialValues.put("IDNIVELCONSUMIDOR",consumidor.getIdnivelconsumidor()) ; 
			initialValues.put("DESCRIPCIONCORTA",consumidor.getDescripcioncorta()) ; 
			initialValues.put("CODIGO_CONTROL",consumidor.getCodigo_control()) ; 
			initialValues.put("ES_TITULO",consumidor.getEs_titulo()) ; 
			initialValues.put("GASTOXACTIVIDAD",consumidor.getGastoxactividad()) ; 
			initialValues.put("FINAL",consumidor.getFinal()) ; 
			initialValues.put("CUENTA_ABONO",consumidor.getCuenta_abono()) ; 
			initialValues.put("CUENTA_CARGO",consumidor.getCuenta_cargo()) ; 
			initialValues.put("CUENTA_DESTINO",consumidor.getCuenta_destino()) ; 
			initialValues.put("IDACTIVIDAD",consumidor.getIdactividad()) ; 
			initialValues.put("IDSIEMBRA",consumidor.getIdsiembra()) ; 
			initialValues.put("IDCAMPANA",consumidor.getIdcampana()) ; 
			initialValues.put("IDORDENPRODUCCION",consumidor.getIdordenproduccion()) ; 
			initialValues.put("IDLOTEPRODUCCION",consumidor.getIdloteproduccion()) ; 
			initialValues.put("CREACC",consumidor.getCreacc()) ; 
			initialValues.put("ES_PRODUCCION",consumidor.getEs_produccion()) ; 
			initialValues.put("CODIGO_LOTIZAR",consumidor.getCodigo_lotizar()) ; 
			initialValues.put("VVENTA_MOF",consumidor.getVventa_mof()) ; 
			initialValues.put("VVENTA_MEX",consumidor.getVventa_mex()) ; 
			initialValues.put("IDUNIDADNEGOCIO",consumidor.getIdunidadnegocio()) ; 
			initialValues.put("IDCLASECCOSTO",consumidor.getIdclaseccosto()) ; 
			initialValues.put("IDCUENTAC_PT",consumidor.getIdcuentac_pt()) ; 
			initialValues.put("IDCUENTAA_PT",consumidor.getIdcuentaa_pt()) ; 
			initialValues.put("IDCUENTAC_PP",consumidor.getIdcuentac_pp()) ; 
			initialValues.put("IDCUENTAA_PP",consumidor.getIdcuentaa_pp()) ; 
			initialValues.put("TIPO_COSTEO",consumidor.getTipo_costeo()) ; 
			initialValues.put("IDFUNCION",consumidor.getIdfuncion()) ; 
			initialValues.put("IDMOTIVO_REVAL",consumidor.getIdmotivo_reval()) ; 
			initialValues.put("IDSUCURSAL_REVAL",consumidor.getIdsucursal_reval()) ; 
			initialValues.put("IDALMACEN_REVAL",consumidor.getIdalmacen_reval()) ; 
			initialValues.put("IDDOCUMENTO_REVAL",consumidor.getIddocumento_reval()) ; 
			initialValues.put("IDFACTORDISTRIBUCION",consumidor.getIdfactordistribucion()) ; 
			initialValues.put("COSTOHA_MEX",consumidor.getCostoha_mex()) ; 
			initialValues.put("COSTOHA_MOF",consumidor.getCostoha_mof()) ; 
			initialValues.put("DISTR_COSTOFINAL",consumidor.getDistr_costofinal()) ; 
			initialValues.put("ESXPERIODO",consumidor.getEsxperiodo()) ; 
			initialValues.put("NOMBRE_REGISTRO",consumidor.getNombre_registro()) ; 
			initialValues.put("NRO_REGISTRO",consumidor.getNro_registro()) ; 
			initialValues.put("TIPO_COSTO",consumidor.getTipo_costo()) ; 
			initialValues.put("IDPARTEPRODUCCION",consumidor.getIdparteproduccion()) ; 
			initialValues.put("ALGORITMOPRECIO",consumidor.getAlgoritmoprecio()) ; 
			initialValues.put("IDPROVLOTE",consumidor.getIdprovlote()) ; 
			initialValues.put("IDMEDIDA",consumidor.getIdmedida()) ; 
			initialValues.put("DESCARGA",consumidor.getDescarga()) ; 
			initialValues.put("ESVEHTERCERO",consumidor.getEsvehtercero()) ; 
			initialValues.put("GENERA_VIAJET",consumidor.getGenera_viajet()) ; 
			initialValues.put("GENERA_REMTRANSPORTISTA",consumidor.getGenera_remtransportista()) ; 
			initialValues.put("IDVIAJET",consumidor.getIdviajet()) ; 
			initialValues.put("IDREMTRANSPORTISTA",consumidor.getIdremtransportista()) ; 
			initialValues.put("NRV_ASIGNACION",consumidor.getNrv_asignacion()) ; 
			initialValues.put("GROWERCODE",consumidor.getGrowercode()) ; 
			initialValues.put("VER_TRANSFORMACION",consumidor.getVer_transformacion()) ; 
			initialValues.put("IDCUENTA_CP",consumidor.getIdcuenta_cp()) ; 
			initialValues.put("CAPACIDAD",consumidor.getCapacidad()) ; 
			initialValues.put("IDALMACEN",consumidor.getIdalmacen()) ; 
			initialValues.put("IDFUENTEAGUA",consumidor.getIdfuenteagua()) ; 
			initialValues.put("IDCLIEPROV_VEHTERCERO",consumidor.getIdclieprov_vehtercero()) ; 
			initialValues.put("ES_SERVICIO",consumidor.getEs_servicio()) ; 
			initialValues.put("IDCUENTADIV9",consumidor.getIdcuentadiv9()) ; 
			initialValues.put("ESALQUILADO",consumidor.getEsalquilado()) ; 
			initialValues.put("NO_PARTICIPADISTRIBUCION",consumidor.getNo_participadistribucion()) ; 
			initialValues.put("ES_MANTENIMIENTO",consumidor.getEs_mantenimiento()) ; 
			initialValues.put("IDGRUPO_MAQ",consumidor.getIdgrupo_maq()) ; 
			initialValues.put("DISTRIBUCION_DWH",consumidor.getDistribucion_dwh()) ; 
			initialValues.put("NOMBRE_CORTO",consumidor.getNombre_corto()) ; 
			initialValues.put("IDSUBSECTORCONSUMIDOR",consumidor.getIdsubsectorconsumidor()) ; 
			initialValues.put("ES_COSECHA",consumidor.getEs_cosecha()) ; 
			initialValues.put("CAPACIDAD_TANQUE",consumidor.getCapacidad_tanque()) ; 
			initialValues.put("IDBASEDATOS",consumidor.getIdbasedatos()) ; 
			initialValues.put("IDACTIVO",consumidor.getIdactivo()) ; 
			initialValues.put("IDINGRESOSALIDAACTIVO",consumidor.getIdingresosalidaactivo()) ; 
			initialValues.put("IDCTAACTIVO",consumidor.getIdctaactivo()) ; 
			initialValues.put("ES_REPROCESO",consumidor.getEs_reproceso()) ; 
			initialValues.put("ES_REEMPAQUE",consumidor.getEs_reempaque()) ; 
			initialValues.put("ES_AVICOLA",consumidor.getEs_avicola()) ; 
			initialValues.put("TIPO_PRESUPUESTO",consumidor.getTipo_presupuesto()) ; 
			initialValues.put("ES_EMPAQUE",consumidor.getEs_empaque()) ; 
			initialValues.put("IDCONSUMIDOR_SPRING",consumidor.getIdconsumidor_spring()) ; 
			initialValues.put("ES_LOTE_CAMPO",consumidor.getEs_lote_campo()) ; 
			initialValues.put("ES_SECADO",consumidor.getEs_secado()) ; 
			initialValues.put("CERTIFICADO",consumidor.getCertificado()) ; 
			initialValues.put("TIPO_PRECIO_FUENTE",consumidor.getTipo_precio_fuente()) ; 
			initialValues.put("CODIGO_PARCELA",consumidor.getCodigo_parcela()) ; 
			initialValues.put("COSTOKM_MOF",consumidor.getCostokm_mof()) ; 
			initialValues.put("COSTOKM_MEX",consumidor.getCostokm_mex()) ; 
			initialValues.put("COSTODIA_MOF",consumidor.getCostodia_mof()) ; 
			initialValues.put("COSTODIA_MEX",consumidor.getCostodia_mex()) ; 
			initialValues.put("IDLINEA_AVICOLA",consumidor.getIdlinea_avicola()) ; 
			initialValues.put("PERMANENCIA",consumidor.getPermanencia()) ; 
			initialValues.put("DIAS_GENPRESUP",consumidor.getDias_genpresup()) ; 
			initialValues.put("IDMEDIDA_MAQ",consumidor.getIdmedida_maq()) ; 
			initialValues.put("CAPACIDAD_MAQ",consumidor.getCapacidad_maq()) ; 
			initialValues.put("VVENTA_UM_MOF",consumidor.getVventa_um_mof()) ; 
			initialValues.put("VVENTA_UM_MEX",consumidor.getVventa_um_mex()) ; 
			initialValues.put("TIPO_REGISTRO_PARTE",consumidor.getTipo_registro_parte()) ; 
			initialValues.put("VER_DIGITACION",consumidor.getVer_digitacion()) ; 
			initialValues.put("ES_LOTE_VIVERO",consumidor.getEs_lote_vivero()) ; 
			initialValues.put("FN_DISTR_VAR1_M2",consumidor.getFn_distr_var1_m2()) ; 
			resultado = mDb.update("CONSUMIDOR",initialValues,where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Boolean delete(String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			resultado = mDb.delete("CONSUMIDOR",where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public ArrayList<Consumidor> listar(String where,String order,Integer limit) {
		if(limit == null){
			limit =0;
		}
		ArrayList<Consumidor> lista  = new ArrayList<Consumidor>();
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			Cursor cur =  mDb.query("CONSUMIDOR",
					new String[] {
							 "IDEMPRESA" ,
							 "IDCONSUMIDOR" ,
							 "TIPO" ,
							 "JERARQUIA" ,
							 "DESCRIPCION" ,
							 "IDCCOSTO" ,
							 "FECHA_INGRESO" ,
							 "FECHA_BAJA" ,
							 "IDSUCURSAL" ,
							 "AREA" ,
							 "IDTENERGIA" ,
							 "CAUDAL" ,
							 "IDPERTENECE" ,
							 "TIPOCALCULO" ,
							 "COSTO_MOF" ,
							 "COSTO_MEX" ,
							 "TIPOMAQUINA" ,
							 "IDPRODUCTO" ,
							 "PLANIFICADO" ,
							 "PRODUCIDO" ,
							 "GRUPO" ,
							 "ESTADO" ,
							 "SINCRONIZA" ,
							 "FECHACREACION" ,
							 "ESCARGA" ,
							 "MARCA" ,
							 "PLACA" ,
							 "REGMTC" ,
							 "NROEJES" ,
							 "CARGAUTIL" ,
							 "TIPOVEHICULO" ,
							 "ANIO" ,
							 "KMINICIAL" ,
							 "IDCONTROLADOR" ,
							 "NRO_VALVULA" ,
							 "IDSERIE" ,
							 "KILOMETROS" ,
							 "IDNIVELCONSUMIDOR" ,
							 "DESCRIPCIONCORTA" ,
							 "CODIGO_CONTROL" ,
							 "ES_TITULO" ,
							 "GASTOXACTIVIDAD" ,
							 "FINAL" ,
							 "CUENTA_ABONO" ,
							 "CUENTA_CARGO" ,
							 "CUENTA_DESTINO" ,
							 "IDACTIVIDAD" ,
							 "IDSIEMBRA" ,
							 "IDCAMPANA" ,
							 "IDORDENPRODUCCION" ,
							 "IDLOTEPRODUCCION" ,
							 "CREACC" ,
							 "ES_PRODUCCION" ,
							 "CODIGO_LOTIZAR" ,
							 "VVENTA_MOF" ,
							 "VVENTA_MEX" ,
							 "IDUNIDADNEGOCIO" ,
							 "IDCLASECCOSTO" ,
							 "IDCUENTAC_PT" ,
							 "IDCUENTAA_PT" ,
							 "IDCUENTAC_PP" ,
							 "IDCUENTAA_PP" ,
							 "TIPO_COSTEO" ,
							 "IDFUNCION" ,
							 "IDMOTIVO_REVAL" ,
							 "IDSUCURSAL_REVAL" ,
							 "IDALMACEN_REVAL" ,
							 "IDDOCUMENTO_REVAL" ,
							 "IDFACTORDISTRIBUCION" ,
							 "COSTOHA_MEX" ,
							 "COSTOHA_MOF" ,
							 "DISTR_COSTOFINAL" ,
							 "ESXPERIODO" ,
							 "NOMBRE_REGISTRO" ,
							 "NRO_REGISTRO" ,
							 "TIPO_COSTO" ,
							 "IDPARTEPRODUCCION" ,
							 "ALGORITMOPRECIO" ,
							 "IDPROVLOTE" ,
							 "IDMEDIDA" ,
							 "DESCARGA" ,
							 "ESVEHTERCERO" ,
							 "GENERA_VIAJET" ,
							 "GENERA_REMTRANSPORTISTA" ,
							 "IDVIAJET" ,
							 "IDREMTRANSPORTISTA" ,
							 "NRV_ASIGNACION" ,
							 "GROWERCODE" ,
							 "VER_TRANSFORMACION" ,
							 "IDCUENTA_CP" ,
							 "CAPACIDAD" ,
							 "IDALMACEN" ,
							 "IDFUENTEAGUA" ,
							 "IDCLIEPROV_VEHTERCERO" ,
							 "ES_SERVICIO" ,
							 "IDCUENTADIV9" ,
							 "ESALQUILADO" ,
							 "NO_PARTICIPADISTRIBUCION" ,
							 "ES_MANTENIMIENTO" ,
							 "IDGRUPO_MAQ" ,
							 "DISTRIBUCION_DWH" ,
							 "NOMBRE_CORTO" ,
							 "IDSUBSECTORCONSUMIDOR" ,
							 "ES_COSECHA" ,
							 "CAPACIDAD_TANQUE" ,
							 "IDBASEDATOS" ,
							 "IDACTIVO" ,
							 "IDINGRESOSALIDAACTIVO" ,
							 "IDCTAACTIVO" ,
							 "ES_REPROCESO" ,
							 "ES_REEMPAQUE" ,
							 "ES_AVICOLA" ,
							 "TIPO_PRESUPUESTO" ,
							 "ES_EMPAQUE" ,
							 "IDCONSUMIDOR_SPRING" ,
							 "ES_LOTE_CAMPO" ,
							 "ES_SECADO" ,
							 "CERTIFICADO" ,
							 "TIPO_PRECIO_FUENTE" ,
							 "CODIGO_PARCELA" ,
							 "COSTOKM_MOF" ,
							 "COSTOKM_MEX" ,
							 "COSTODIA_MOF" ,
							 "COSTODIA_MEX" ,
							 "IDLINEA_AVICOLA" ,
							 "PERMANENCIA" ,
							 "DIAS_GENPRESUP" ,
							 "IDMEDIDA_MAQ" ,
							 "CAPACIDAD_MAQ" ,
							 "VVENTA_UM_MOF" ,
							 "VVENTA_UM_MEX" ,
							 "TIPO_REGISTRO_PARTE" ,
							 "VER_DIGITACION" ,
							 "ES_LOTE_VIVERO" ,
							 "FN_DISTR_VAR1_M2" 
					},
			where, null, null, null, order);
			if (cur!=null){
				cur.moveToFirst();
				int i=0;
				while (cur.isAfterLast() == false) {
					int j=0;
					Consumidor consumidor = new Consumidor() ;
					consumidor.setIdempresa(cur.getString(j++));
					consumidor.setIdconsumidor(cur.getString(j++));
					consumidor.setTipo(cur.getString(j++));
					consumidor.setJerarquia(cur.getString(j++));
					consumidor.setDescripcion(cur.getString(j++));
					consumidor.setIdccosto(cur.getString(j++));
					consumidor.setFecha_ingreso(dateFormat.parse(cur.getString(j++)) );
					consumidor.setFecha_baja(dateFormat.parse(cur.getString(j++)) );
					consumidor.setIdsucursal(cur.getString(j++));
					consumidor.setArea(cur.getDouble(j++));
					consumidor.setIdtenergia(cur.getString(j++));
					consumidor.setCaudal(cur.getDouble(j++));
					consumidor.setIdpertenece(cur.getString(j++));
					consumidor.setTipocalculo(cur.getString(j++));
					consumidor.setCosto_mof(cur.getDouble(j++));
					consumidor.setCosto_mex(cur.getDouble(j++));
					consumidor.setTipomaquina(cur.getString(j++));
					consumidor.setIdproducto(cur.getString(j++));
					consumidor.setPlanificado(cur.getDouble(j++));
					consumidor.setProducido(cur.getDouble(j++));
					consumidor.setGrupo(cur.getString(j++));
					consumidor.setEstado(cur.getDouble(j++));
					consumidor.setSincroniza(cur.getString(j++));
					consumidor.setFechacreacion(dateFormat.parse(cur.getString(j++)) );
					consumidor.setEscarga(cur.getDouble(j++));
					consumidor.setMarca(cur.getString(j++));
					consumidor.setPlaca(cur.getString(j++));
					consumidor.setRegmtc(cur.getString(j++));
					consumidor.setNroejes(cur.getDouble(j++));
					consumidor.setCargautil(cur.getDouble(j++));
					consumidor.setTipovehiculo(cur.getString(j++));
					consumidor.setAnio(cur.getDouble(j++));
					consumidor.setKminicial(cur.getDouble(j++));
					consumidor.setIdcontrolador(cur.getString(j++));
					consumidor.setNro_valvula(cur.getString(j++));
					consumidor.setIdserie(cur.getString(j++));
					consumidor.setKilometros(cur.getDouble(j++));
					consumidor.setIdnivelconsumidor(cur.getString(j++));
					consumidor.setDescripcioncorta(cur.getString(j++));
					consumidor.setCodigo_control(cur.getString(j++));
					consumidor.setEs_titulo(cur.getDouble(j++));
					consumidor.setGastoxactividad(cur.getDouble(j++));
					consumidor.setFinal(cur.getDouble(j++));
					consumidor.setCuenta_abono(cur.getString(j++));
					consumidor.setCuenta_cargo(cur.getString(j++));
					consumidor.setCuenta_destino(cur.getString(j++));
					consumidor.setIdactividad(cur.getDouble(j++));
					consumidor.setIdsiembra(cur.getDouble(j++));
					consumidor.setIdcampana(cur.getDouble(j++));
					consumidor.setIdordenproduccion(cur.getDouble(j++));
					consumidor.setIdloteproduccion(cur.getDouble(j++));
					consumidor.setCreacc(cur.getDouble(j++));
					consumidor.setEs_produccion(cur.getDouble(j++));
					consumidor.setCodigo_lotizar(cur.getString(j++));
					consumidor.setVventa_mof(cur.getDouble(j++));
					consumidor.setVventa_mex(cur.getDouble(j++));
					consumidor.setIdunidadnegocio(cur.getString(j++));
					consumidor.setIdclaseccosto(cur.getString(j++));
					consumidor.setIdcuentac_pt(cur.getString(j++));
					consumidor.setIdcuentaa_pt(cur.getString(j++));
					consumidor.setIdcuentac_pp(cur.getString(j++));
					consumidor.setIdcuentaa_pp(cur.getString(j++));
					consumidor.setTipo_costeo(cur.getDouble(j++));
					consumidor.setIdfuncion(cur.getString(j++));
					consumidor.setIdmotivo_reval(cur.getString(j++));
					consumidor.setIdsucursal_reval(cur.getString(j++));
					consumidor.setIdalmacen_reval(cur.getString(j++));
					consumidor.setIddocumento_reval(cur.getString(j++));
					consumidor.setIdfactordistribucion(cur.getString(j++));
					consumidor.setCostoha_mex(cur.getDouble(j++));
					consumidor.setCostoha_mof(cur.getDouble(j++));
					consumidor.setDistr_costofinal(cur.getDouble(j++));
					consumidor.setEsxperiodo(cur.getDouble(j++));
					consumidor.setNombre_registro(cur.getString(j++));
					consumidor.setNro_registro(cur.getString(j++));
					consumidor.setTipo_costo(cur.getString(j++));
					consumidor.setIdparteproduccion(cur.getDouble(j++));
					consumidor.setAlgoritmoprecio(cur.getDouble(j++));
					consumidor.setIdprovlote(cur.getString(j++));
					consumidor.setIdmedida(cur.getString(j++));
					consumidor.setDescarga(cur.getDouble(j++));
					consumidor.setEsvehtercero(cur.getDouble(j++));
					consumidor.setGenera_viajet(cur.getDouble(j++));
					consumidor.setGenera_remtransportista(cur.getDouble(j++));
					consumidor.setIdviajet(cur.getString(j++));
					consumidor.setIdremtransportista(cur.getString(j++));
					consumidor.setNrv_asignacion(cur.getDouble(j++));
					consumidor.setGrowercode(cur.getString(j++));
					consumidor.setVer_transformacion(cur.getDouble(j++));
					consumidor.setIdcuenta_cp(cur.getString(j++));
					consumidor.setCapacidad(cur.getDouble(j++));
					consumidor.setIdalmacen(cur.getString(j++));
					consumidor.setIdfuenteagua(cur.getString(j++));
					consumidor.setIdclieprov_vehtercero(cur.getString(j++));
					consumidor.setEs_servicio(cur.getDouble(j++));
					consumidor.setIdcuentadiv9(cur.getString(j++));
					consumidor.setEsalquilado(cur.getDouble(j++));
					consumidor.setNo_participadistribucion(cur.getDouble(j++));
					consumidor.setEs_mantenimiento(cur.getDouble(j++));
					consumidor.setIdgrupo_maq(cur.getString(j++));
					consumidor.setDistribucion_dwh(cur.getDouble(j++));
					consumidor.setNombre_corto(cur.getString(j++));
					consumidor.setIdsubsectorconsumidor(cur.getString(j++));
					consumidor.setEs_cosecha(cur.getDouble(j++));
					consumidor.setCapacidad_tanque(cur.getDouble(j++));
					consumidor.setIdbasedatos(cur.getString(j++));
					consumidor.setIdactivo(cur.getString(j++));
					consumidor.setIdingresosalidaactivo(cur.getString(j++));
					consumidor.setIdctaactivo(cur.getString(j++));
					consumidor.setEs_reproceso(cur.getDouble(j++));
					consumidor.setEs_reempaque(cur.getDouble(j++));
					consumidor.setEs_avicola(cur.getDouble(j++));
					consumidor.setTipo_presupuesto(cur.getString(j++));
					consumidor.setEs_empaque(cur.getDouble(j++));
					consumidor.setIdconsumidor_spring(cur.getString(j++));
					consumidor.setEs_lote_campo(cur.getDouble(j++));
					consumidor.setEs_secado(cur.getDouble(j++));
					consumidor.setCertificado(cur.getDouble(j++));
					consumidor.setTipo_precio_fuente(cur.getInt(j++));
					consumidor.setCodigo_parcela(cur.getString(j++));
					consumidor.setCostokm_mof(cur.getDouble(j++));
					consumidor.setCostokm_mex(cur.getDouble(j++));
					consumidor.setCostodia_mof(cur.getDouble(j++));
					consumidor.setCostodia_mex(cur.getDouble(j++));
					consumidor.setIdlinea_avicola(cur.getString(j++));
					consumidor.setPermanencia(cur.getInt(j++));
					consumidor.setDias_genpresup(cur.getInt(j++));
					consumidor.setIdmedida_maq(cur.getString(j++));
					consumidor.setCapacidad_maq(cur.getDouble(j++));
					consumidor.setVventa_um_mof(cur.getDouble(j++));
					consumidor.setVventa_um_mex(cur.getDouble(j++));
					consumidor.setTipo_registro_parte(cur.getString(j++));
					consumidor.setVer_digitacion(cur.getDouble(j++));
					consumidor.setEs_lote_vivero(cur.getDouble(j++));
					consumidor.setFn_distr_var1_m2(cur.getDouble(j++));

					lista.add(consumidor); 
					i++; 
					if(i == limit){ 
						break; 
					} 
					cur.moveToNext(); 
				} 
				cur.close(); 
			} 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return lista; 
	} 
}