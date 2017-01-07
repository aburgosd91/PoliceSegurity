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
public class DordenservicioclienteDao{

	public Boolean insert(Dordenserviciocliente dordenserviciocliente) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",dordenserviciocliente.getIdempresa()); 
			initialValues.put("IDORDENSERVICIO",dordenserviciocliente.getIdordenservicio()); 
			initialValues.put("ITEM",dordenserviciocliente.getItem()); 
			initialValues.put("IDVEHICULO",dordenserviciocliente.getIdvehiculo()); 
			initialValues.put("PLACA_CLIENTE",dordenserviciocliente.getPlaca_cliente()); 
			initialValues.put("HORA_REQ",dordenserviciocliente.getHora_req()); 
			initialValues.put("FECHA_FIN_SERVICIO",dateFormat.format(dordenserviciocliente.getFecha_fin_servicio() ) ); 
			initialValues.put("FECHACREACION",dateFormat.format(dordenserviciocliente.getFechacreacion() ) ); 
			resultado = mDb.insert("DORDENSERVICIOCLIENTE",null,initialValues)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public Boolean update(Dordenserviciocliente dordenserviciocliente,String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDEMPRESA",dordenserviciocliente.getIdempresa()) ; 
			initialValues.put("IDORDENSERVICIO",dordenserviciocliente.getIdordenservicio()) ; 
			initialValues.put("ITEM",dordenserviciocliente.getItem()) ; 
			initialValues.put("IDVEHICULO",dordenserviciocliente.getIdvehiculo()) ; 
			initialValues.put("PLACA_CLIENTE",dordenserviciocliente.getPlaca_cliente()) ; 
			initialValues.put("HORA_REQ",dordenserviciocliente.getHora_req()) ; 
			initialValues.put("FECHA_FIN_SERVICIO",dateFormat.format(dordenserviciocliente.getFecha_fin_servicio() ) ) ; 
			initialValues.put("FECHACREACION",dateFormat.format(dordenserviciocliente.getFechacreacion() ) ) ; 
			resultado = mDb.update("DORDENSERVICIOCLIENTE",initialValues,where,null)>0; 
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
			resultado = mDb.delete("DORDENSERVICIOCLIENTE",where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public ArrayList<Dordenserviciocliente> listar(String where,String order,Integer limit) {
		if(limit == null){
			limit =0;
		}
		ArrayList<Dordenserviciocliente> lista  = new ArrayList<Dordenserviciocliente>();
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			Cursor cur =  mDb.query("DORDENSERVICIOCLIENTE",
					new String[] {
							 "IDEMPRESA" ,
							 "IDORDENSERVICIO" ,
							 "ITEM" ,
							 "IDVEHICULO" ,
							 "PLACA_CLIENTE" ,
							 "HORA_REQ" ,
							 "FECHA_FIN_SERVICIO" ,
							 "FECHACREACION" 
					},
			where, null, null, null, order);
			if (cur!=null){
				cur.moveToFirst();
				int i=0;
				while (cur.isAfterLast() == false) {
					int j=0;
					Dordenserviciocliente dordenserviciocliente = new Dordenserviciocliente() ;
					dordenserviciocliente.setIdempresa(cur.getString(j++));
					dordenserviciocliente.setIdordenservicio(cur.getString(j++));
					dordenserviciocliente.setItem(cur.getString(j++));
					dordenserviciocliente.setIdvehiculo(cur.getString(j++));
					dordenserviciocliente.setPlaca_cliente(cur.getString(j++));
					dordenserviciocliente.setHora_req(cur.getDouble(j++));
					dordenserviciocliente.setFecha_fin_servicio(dateFormat.parse(cur.getString(j++)) );
					dordenserviciocliente.setFechacreacion(dateFormat.parse(cur.getString(j++)) );

					lista.add(dordenserviciocliente); 
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