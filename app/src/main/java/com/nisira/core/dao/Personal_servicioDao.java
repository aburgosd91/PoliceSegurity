package com.nisira.core.dao;

import com.nisira.core.entity.*;
import android.database.sqlite.SQLiteDatabase;
import com.nisira.core.database.DataBaseClass;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class Personal_servicioDao{

	public Boolean insert(Personal_servicio personal_servicio) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",personal_servicio.getIdempresa()); 
			initialValues.put("IDORDENSERVICIO",personal_servicio.getIdordenservicio()); 
			initialValues.put("ITEM",personal_servicio.getItem()); 
			initialValues.put("IDPERSONAL",personal_servicio.getIdpersonal()); 
			initialValues.put("DNI",personal_servicio.getDni()); 
			initialValues.put("NOMBRES",personal_servicio.getNombres()); 
			initialValues.put("HORA_REQ",personal_servicio.getHora_req()); 
			initialValues.put("HORA_LLEGADA",personal_servicio.getHora_llegada()); 
			initialValues.put("HORA_INICIO_SERV",personal_servicio.getHora_inicio_serv()); 
			initialValues.put("HORA_FIN_SERV",personal_servicio.getHora_fin_serv()); 
			initialValues.put("HORA_LIBERACION",personal_servicio.getHora_liberacion()); 
			initialValues.put("IDCARGO",personal_servicio.getIdcargo()); 
			initialValues.put("FECHAREGISTRO",dateFormat.format(personal_servicio.getFecharegistro() ) ); 
			initialValues.put("FECHAOPERACION",dateFormat.format(personal_servicio.getFechaoperacion() ) ); 
			resultado = mDb.insert("PERSONAL_SERVICIO",null,initialValues)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public Boolean update(Personal_servicio personal_servicio,String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",personal_servicio.getIdempresa()) ; 
			initialValues.put("IDORDENSERVICIO",personal_servicio.getIdordenservicio()) ; 
			initialValues.put("ITEM",personal_servicio.getItem()) ; 
			initialValues.put("IDPERSONAL",personal_servicio.getIdpersonal()) ; 
			initialValues.put("DNI",personal_servicio.getDni()) ; 
			initialValues.put("NOMBRES",personal_servicio.getNombres()) ; 
			initialValues.put("HORA_REQ",personal_servicio.getHora_req()) ; 
			initialValues.put("HORA_LLEGADA",personal_servicio.getHora_llegada()) ; 
			initialValues.put("HORA_INICIO_SERV",personal_servicio.getHora_inicio_serv()) ; 
			initialValues.put("HORA_FIN_SERV",personal_servicio.getHora_fin_serv()) ; 
			initialValues.put("HORA_LIBERACION",personal_servicio.getHora_liberacion()) ; 
			initialValues.put("IDCARGO",personal_servicio.getIdcargo()) ; 
			initialValues.put("FECHAREGISTRO",dateFormat.format(personal_servicio.getFecharegistro() ) ) ; 
			initialValues.put("FECHAOPERACION",dateFormat.format(personal_servicio.getFechaoperacion() ) ) ; 
			resultado = mDb.update("PERSONAL_SERVICIO",initialValues,where,null)>0; 
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
			resultado = mDb.delete("PERSONAL_SERVICIO",where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public ArrayList<Personal_servicio> listar(String where,String order,Integer limit) {
		if(limit == null){
			limit =0;
		}
		ArrayList<Personal_servicio> lista  = new ArrayList<Personal_servicio>();
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			Cursor cur =  mDb.query("PERSONAL_SERVICIO",
					new String[] {
							 "IDEMPRESA" ,
							 "IDORDENSERVICIO" ,
							 "ITEM" ,
							 "IDPERSONAL" ,
							 "DNI" ,
							 "NOMBRES" ,
							 "HORA_REQ" ,
							 "HORA_LLEGADA" ,
							 "HORA_INICIO_SERV" ,
							 "HORA_FIN_SERV" ,
							 "HORA_LIBERACION" ,
							 "IDCARGO" ,
							 "FECHAREGISTRO" ,
							 "FECHAOPERACION" 
					},
			where, null, null, null, order);
			if (cur!=null){
				cur.moveToFirst();
				int i=0;
				while (cur.isAfterLast() == false) {
					int j=0;
					Personal_servicio personal_servicio = new Personal_servicio() ;
					personal_servicio.setIdempresa(cur.getString(j++));
					personal_servicio.setIdordenservicio(cur.getString(j++));
					personal_servicio.setItem(cur.getString(j++));
					personal_servicio.setIdpersonal(cur.getString(j++));
					personal_servicio.setDni(cur.getString(j++));
					personal_servicio.setNombres(cur.getString(j++));
					personal_servicio.setHora_req(cur.getDouble(j++));
					personal_servicio.setHora_llegada(cur.getDouble(j++));
					personal_servicio.setHora_inicio_serv(cur.getDouble(j++));
					personal_servicio.setHora_fin_serv(cur.getDouble(j++));
					personal_servicio.setHora_liberacion(cur.getDouble(j++));
					personal_servicio.setIdcargo(cur.getString(j++));
					personal_servicio.setFecharegistro(dateFormat.parse(cur.getString(j++)) );
					personal_servicio.setFechaoperacion(dateFormat.parse(cur.getString(j++)) );

					lista.add(personal_servicio); 
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