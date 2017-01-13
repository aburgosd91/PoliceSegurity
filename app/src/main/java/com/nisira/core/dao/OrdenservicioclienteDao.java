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

public class OrdenservicioclienteDao{

	public Boolean insert(Ordenserviciocliente ordenserviciocliente) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",ordenserviciocliente.getIdempresa()); 
			initialValues.put("IDORDENSERVICIO",ordenserviciocliente.getIdordenservicio()); 
			initialValues.put("IDDOCUMENTO",ordenserviciocliente.getIddocumento()); 
			initialValues.put("SERIE",ordenserviciocliente.getSerie()); 
			initialValues.put("NUMERO",ordenserviciocliente.getNumero()); 
			initialValues.put("NROMANUAL",ordenserviciocliente.getNromanual()); 
			initialValues.put("IDCLIEPROV",ordenserviciocliente.getIdclieprov()); 
			initialValues.put("FECHA",dateFormat.format(ordenserviciocliente.getFecha() ) ); 
			initialValues.put("TIPO_SERVICIO",ordenserviciocliente.getTipo_servicio()); 
			initialValues.put("AMBITO_SERVICIO",ordenserviciocliente.getAmbito_servicio()); 
			initialValues.put("IDESTADO",ordenserviciocliente.getIdestado()); 
			initialValues.put("SINCRONIZA",ordenserviciocliente.getSincroniza()); 
			initialValues.put("FECHACREACION",dateFormat.format(ordenserviciocliente.getFechacreacion() ) ); 
			initialValues.put("NROCONTENEDOR",ordenserviciocliente.getNrocontenedor()); 
			initialValues.put("NROPRECINTO",ordenserviciocliente.getNroprecinto()); 
			initialValues.put("NRO_OSERVICIO",ordenserviciocliente.getNro_oservicio()); 
			resultado = mDb.insert("ORDENSERVICIOCLIENTE",null,initialValues)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public Boolean update(Ordenserviciocliente ordenserviciocliente,String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",ordenserviciocliente.getIdempresa()) ; 
			initialValues.put("IDORDENSERVICIO",ordenserviciocliente.getIdordenservicio()) ; 
			initialValues.put("IDDOCUMENTO",ordenserviciocliente.getIddocumento()) ; 
			initialValues.put("SERIE",ordenserviciocliente.getSerie()) ; 
			initialValues.put("NUMERO",ordenserviciocliente.getNumero()) ; 
			initialValues.put("NROMANUAL",ordenserviciocliente.getNromanual()) ; 
			initialValues.put("IDCLIEPROV",ordenserviciocliente.getIdclieprov()) ; 
			initialValues.put("FECHA",dateFormat.format(ordenserviciocliente.getFecha() ) ) ; 
			initialValues.put("TIPO_SERVICIO",ordenserviciocliente.getTipo_servicio()) ; 
			initialValues.put("AMBITO_SERVICIO",ordenserviciocliente.getAmbito_servicio()) ; 
			initialValues.put("IDESTADO",ordenserviciocliente.getIdestado()) ; 
			initialValues.put("SINCRONIZA",ordenserviciocliente.getSincroniza()) ; 
			initialValues.put("FECHACREACION",dateFormat.format(ordenserviciocliente.getFechacreacion() ) ) ; 
			initialValues.put("NROCONTENEDOR",ordenserviciocliente.getNrocontenedor()) ; 
			initialValues.put("NROPRECINTO",ordenserviciocliente.getNroprecinto()) ; 
			initialValues.put("NRO_OSERVICIO",ordenserviciocliente.getNro_oservicio()) ; 
			resultado = mDb.update("ORDENSERVICIOCLIENTE",initialValues,where,null)>0; 
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
			resultado = mDb.delete("ORDENSERVICIOCLIENTE",where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public ArrayList<Ordenserviciocliente> listar(String where,String order,Integer limit) {
		if(limit == null){
			limit =0;
		}
		ArrayList<Ordenserviciocliente> lista  = new ArrayList<Ordenserviciocliente>();
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			Cursor cur =  mDb.query("ORDENSERVICIOCLIENTE",
					new String[] {
							 "IDEMPRESA" ,
							 "IDORDENSERVICIO" ,
							 "IDDOCUMENTO" ,
							 "SERIE" ,
							 "NUMERO" ,
							 "NROMANUAL" ,
							 "IDCLIEPROV" ,
							 "FECHA" ,
							 "TIPO_SERVICIO" ,
							 "AMBITO_SERVICIO" ,
							 "IDESTADO" ,
							 "SINCRONIZA" ,
							 "FECHACREACION" ,
							 "NROCONTENEDOR" ,
							 "NROPRECINTO" ,
							 "NRO_OSERVICIO" 
					},
			where, null, null, null, order);
			if (cur!=null){
				cur.moveToFirst();
				int i=0;
				while (cur.isAfterLast() == false) {
					int j=0;
					Ordenserviciocliente ordenserviciocliente = new Ordenserviciocliente() ;
					ordenserviciocliente.setIdempresa(cur.getString(j++));
					ordenserviciocliente.setIdordenservicio(cur.getString(j++));
					ordenserviciocliente.setIddocumento(cur.getString(j++));
					ordenserviciocliente.setSerie(cur.getString(j++));
					ordenserviciocliente.setNumero(cur.getString(j++));
					ordenserviciocliente.setNromanual(cur.getString(j++));
					ordenserviciocliente.setIdclieprov(cur.getString(j++));
					ordenserviciocliente.setFecha(dateFormat.parse(cur.getString(j++)) );
					ordenserviciocliente.setTipo_servicio(cur.getString(j++));
					ordenserviciocliente.setAmbito_servicio(cur.getString(j++));
					ordenserviciocliente.setIdestado(cur.getString(j++));
					ordenserviciocliente.setSincroniza(cur.getString(j++));
					ordenserviciocliente.setFechacreacion(dateFormat.parse(cur.getString(j++)) );
					ordenserviciocliente.setNrocontenedor(cur.getString(j++));
					ordenserviciocliente.setNroprecinto(cur.getString(j++));
					ordenserviciocliente.setNro_oservicio(cur.getString(j++));

					lista.add(ordenserviciocliente); 
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