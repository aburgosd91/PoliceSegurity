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

public class DordenliquidaciongastoDao{

	public Boolean insert(Dordenliquidaciongasto dordenliquidaciongasto) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",dordenliquidaciongasto.getIdempresa()); 
			initialValues.put("IDORDEN",dordenliquidaciongasto.getIdorden()); 
			initialValues.put("ITEM",dordenliquidaciongasto.getItem()); 
			initialValues.put("GLOSA",dordenliquidaciongasto.getGlosa()); 
			initialValues.put("IDCONCEPTO",dordenliquidaciongasto.getIdconcepto()); 
			initialValues.put("IDCUENTA",dordenliquidaciongasto.getIdcuenta()); 
			initialValues.put("IDCCOSTO",dordenliquidaciongasto.getIdccosto()); 
			initialValues.put("IDTIPOMOV",dordenliquidaciongasto.getIdtipomov()); 
			initialValues.put("IDCLIEPROV",dordenliquidaciongasto.getIdclieprov()); 
			initialValues.put("IDDOCUMENTO",dordenliquidaciongasto.getIddocumento()); 
			initialValues.put("SERIE",dordenliquidaciongasto.getSerie()); 
			initialValues.put("NUMERO",dordenliquidaciongasto.getNumero()); 
			initialValues.put("FECHA",dateFormat.format(dordenliquidaciongasto.getFecha() ) ); 
			initialValues.put("IDDESTINO",dordenliquidaciongasto.getIddestino()); 
			initialValues.put("IDMONEDA",dordenliquidaciongasto.getIdmoneda()); 
			initialValues.put("TCMONEDA",dordenliquidaciongasto.getTcmoneda()); 
			initialValues.put("TCAMBIO",dordenliquidaciongasto.getTcambio()); 
			initialValues.put("IDREGIMEN",dordenliquidaciongasto.getIdregimen()); 
			initialValues.put("AFECTO",dordenliquidaciongasto.getAfecto()); 
			initialValues.put("INAFECTO",dordenliquidaciongasto.getInafecto()); 
			initialValues.put("PIMPUESTO",dordenliquidaciongasto.getPimpuesto()); 
			initialValues.put("IMPUESTO",dordenliquidaciongasto.getImpuesto()); 
			initialValues.put("IMPORTE",dordenliquidaciongasto.getImporte()); 
			initialValues.put("OTROS",dordenliquidaciongasto.getOtros()); 
			initialValues.put("IDCONSUMIDOR",dordenliquidaciongasto.getIdconsumidor()); 
			initialValues.put("NUMERO_RCOMPRAS",dordenliquidaciongasto.getNumero_rcompras()); 
			initialValues.put("IDMEDIDA",dordenliquidaciongasto.getIdmedida()); 
			initialValues.put("IDPRODUCTO",dordenliquidaciongasto.getIdproducto()); 
			initialValues.put("ITEMALMACEN",dordenliquidaciongasto.getItemalmacen()); 
			initialValues.put("PRODUCTO",dordenliquidaciongasto.getProducto()); 
			initialValues.put("VENTANA",dordenliquidaciongasto.getVentana()); 
			initialValues.put("CANTIDAD",dordenliquidaciongasto.getCantidad()); 
			initialValues.put("IDSIEMBRA",dordenliquidaciongasto.getIdsiembra()); 
			initialValues.put("IDCAMPANA",dordenliquidaciongasto.getIdcampana()); 
			initialValues.put("IDORDENPRODUCCION",dordenliquidaciongasto.getIdordenproduccion()); 
			initialValues.put("IDLOTEPRODUCCION",dordenliquidaciongasto.getIdloteproduccion()); 
			resultado = mDb.insert("DORDENLIQUIDACIONGASTO",null,initialValues)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public Boolean update(Dordenliquidaciongasto dordenliquidaciongasto,String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",dordenliquidaciongasto.getIdempresa()) ; 
			initialValues.put("IDORDEN",dordenliquidaciongasto.getIdorden()) ; 
			initialValues.put("ITEM",dordenliquidaciongasto.getItem()) ; 
			initialValues.put("GLOSA",dordenliquidaciongasto.getGlosa()) ; 
			initialValues.put("IDCONCEPTO",dordenliquidaciongasto.getIdconcepto()) ; 
			initialValues.put("IDCUENTA",dordenliquidaciongasto.getIdcuenta()) ; 
			initialValues.put("IDCCOSTO",dordenliquidaciongasto.getIdccosto()) ; 
			initialValues.put("IDTIPOMOV",dordenliquidaciongasto.getIdtipomov()) ; 
			initialValues.put("IDCLIEPROV",dordenliquidaciongasto.getIdclieprov()) ; 
			initialValues.put("IDDOCUMENTO",dordenliquidaciongasto.getIddocumento()) ; 
			initialValues.put("SERIE",dordenliquidaciongasto.getSerie()) ; 
			initialValues.put("NUMERO",dordenliquidaciongasto.getNumero()) ; 
			initialValues.put("FECHA",dateFormat.format(dordenliquidaciongasto.getFecha() ) ) ; 
			initialValues.put("IDDESTINO",dordenliquidaciongasto.getIddestino()) ; 
			initialValues.put("IDMONEDA",dordenliquidaciongasto.getIdmoneda()) ; 
			initialValues.put("TCMONEDA",dordenliquidaciongasto.getTcmoneda()) ; 
			initialValues.put("TCAMBIO",dordenliquidaciongasto.getTcambio()) ; 
			initialValues.put("IDREGIMEN",dordenliquidaciongasto.getIdregimen()) ; 
			initialValues.put("AFECTO",dordenliquidaciongasto.getAfecto()) ; 
			initialValues.put("INAFECTO",dordenliquidaciongasto.getInafecto()) ; 
			initialValues.put("PIMPUESTO",dordenliquidaciongasto.getPimpuesto()) ; 
			initialValues.put("IMPUESTO",dordenliquidaciongasto.getImpuesto()) ; 
			initialValues.put("IMPORTE",dordenliquidaciongasto.getImporte()) ; 
			initialValues.put("OTROS",dordenliquidaciongasto.getOtros()) ; 
			initialValues.put("IDCONSUMIDOR",dordenliquidaciongasto.getIdconsumidor()) ; 
			initialValues.put("NUMERO_RCOMPRAS",dordenliquidaciongasto.getNumero_rcompras()) ; 
			initialValues.put("IDMEDIDA",dordenliquidaciongasto.getIdmedida()) ; 
			initialValues.put("IDPRODUCTO",dordenliquidaciongasto.getIdproducto()) ; 
			initialValues.put("ITEMALMACEN",dordenliquidaciongasto.getItemalmacen()) ; 
			initialValues.put("PRODUCTO",dordenliquidaciongasto.getProducto()) ; 
			initialValues.put("VENTANA",dordenliquidaciongasto.getVentana()) ; 
			initialValues.put("CANTIDAD",dordenliquidaciongasto.getCantidad()) ; 
			initialValues.put("IDSIEMBRA",dordenliquidaciongasto.getIdsiembra()) ; 
			initialValues.put("IDCAMPANA",dordenliquidaciongasto.getIdcampana()) ; 
			initialValues.put("IDORDENPRODUCCION",dordenliquidaciongasto.getIdordenproduccion()) ; 
			initialValues.put("IDLOTEPRODUCCION",dordenliquidaciongasto.getIdloteproduccion()) ; 
			resultado = mDb.update("DORDENLIQUIDACIONGASTO",initialValues,where,null)>0; 
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
			resultado = mDb.delete("DORDENLIQUIDACIONGASTO",where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public ArrayList<Dordenliquidaciongasto> listar(String where,String order,Integer limit) {
		if(limit == null){
			limit =0;
		}
		ArrayList<Dordenliquidaciongasto> lista  = new ArrayList<Dordenliquidaciongasto>();
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			Cursor cur =  mDb.query("DORDENLIQUIDACIONGASTO",
					new String[] {
							 "IDEMPRESA" ,
							 "IDORDEN" ,
							 "ITEM" ,
							 "GLOSA" ,
							 "IDCONCEPTO" ,
							 "IDCUENTA" ,
							 "IDCCOSTO" ,
							 "IDTIPOMOV" ,
							 "IDCLIEPROV" ,
							 "IDDOCUMENTO" ,
							 "SERIE" ,
							 "NUMERO" ,
							 "FECHA" ,
							 "IDDESTINO" ,
							 "IDMONEDA" ,
							 "TCMONEDA" ,
							 "TCAMBIO" ,
							 "IDREGIMEN" ,
							 "AFECTO" ,
							 "INAFECTO" ,
							 "PIMPUESTO" ,
							 "IMPUESTO" ,
							 "IMPORTE" ,
							 "OTROS" ,
							 "IDCONSUMIDOR" ,
							 "NUMERO_RCOMPRAS" ,
							 "IDMEDIDA" ,
							 "IDPRODUCTO" ,
							 "ITEMALMACEN" ,
							 "PRODUCTO" ,
							 "VENTANA" ,
							 "CANTIDAD" ,
							 "IDSIEMBRA" ,
							 "IDCAMPANA" ,
							 "IDORDENPRODUCCION" ,
							 "IDLOTEPRODUCCION" 
					},
			where, null, null, null, order);
			if (cur!=null){
				cur.moveToFirst();
				int i=0;
				while (cur.isAfterLast() == false) {
					int j=0;
					Dordenliquidaciongasto dordenliquidaciongasto = new Dordenliquidaciongasto() ;
					dordenliquidaciongasto.setIdempresa(cur.getString(j++));
					dordenliquidaciongasto.setIdorden(cur.getString(j++));
					dordenliquidaciongasto.setItem(cur.getString(j++));
					dordenliquidaciongasto.setGlosa(cur.getString(j++));
					dordenliquidaciongasto.setIdconcepto(cur.getString(j++));
					dordenliquidaciongasto.setIdcuenta(cur.getString(j++));
					dordenliquidaciongasto.setIdccosto(cur.getString(j++));
					dordenliquidaciongasto.setIdtipomov(cur.getString(j++));
					dordenliquidaciongasto.setIdclieprov(cur.getString(j++));
					dordenliquidaciongasto.setIddocumento(cur.getString(j++));
					dordenliquidaciongasto.setSerie(cur.getString(j++));
					dordenliquidaciongasto.setNumero(cur.getString(j++));
					dordenliquidaciongasto.setFecha(dateFormat.parse(cur.getString(j++)) );
					dordenliquidaciongasto.setIddestino(cur.getString(j++));
					dordenliquidaciongasto.setIdmoneda(cur.getString(j++));
					dordenliquidaciongasto.setTcmoneda(cur.getDouble(j++));
					dordenliquidaciongasto.setTcambio(cur.getDouble(j++));
					dordenliquidaciongasto.setIdregimen(cur.getString(j++));
					dordenliquidaciongasto.setAfecto(cur.getDouble(j++));
					dordenliquidaciongasto.setInafecto(cur.getDouble(j++));
					dordenliquidaciongasto.setPimpuesto(cur.getDouble(j++));
					dordenliquidaciongasto.setImpuesto(cur.getDouble(j++));
					dordenliquidaciongasto.setImporte(cur.getDouble(j++));
					dordenliquidaciongasto.setOtros(cur.getDouble(j++));
					dordenliquidaciongasto.setIdconsumidor(cur.getString(j++));
					dordenliquidaciongasto.setNumero_rcompras(cur.getString(j++));
					dordenliquidaciongasto.setIdmedida(cur.getString(j++));
					dordenliquidaciongasto.setIdproducto(cur.getString(j++));
					dordenliquidaciongasto.setItemalmacen(cur.getString(j++));
					dordenliquidaciongasto.setProducto(cur.getString(j++));
					dordenliquidaciongasto.setVentana(cur.getString(j++));
					dordenliquidaciongasto.setCantidad(cur.getDouble(j++));
					dordenliquidaciongasto.setIdsiembra(cur.getString(j++));
					dordenliquidaciongasto.setIdcampana(cur.getString(j++));
					dordenliquidaciongasto.setIdordenproduccion(cur.getString(j++));
					dordenliquidaciongasto.setIdloteproduccion(cur.getString(j++));

					lista.add(dordenliquidaciongasto); 
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