package com.nisira.core.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.nisira.core.database.DataBaseClass;
import com.nisira.core.entity.*;

public class UsuarioDao {

	public Boolean insert(Usuario usuario) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDBASEDATOS",usuario.getIdbasedatos()); 
			initialValues.put("IDEMPRESA",usuario.getIdempresa()); 
			initialValues.put("IDUSUARIO",usuario.getIdusuario()); 
			initialValues.put("IDVENDEDOR",usuario.getIdvendedor()); 
			initialValues.put("PASSWORD",usuario.getPassword()); 
			initialValues.put("ESTADO",usuario.getEstado()); 
			resultado = mDb.insert("USUARIO",null,initialValues)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public Boolean update(Usuario usuario, String where) {
		Boolean resultado = false;
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ContentValues initialValues = new ContentValues();
			initialValues.put("IDBASEDATOS",usuario.getIdbasedatos()) ; 
			initialValues.put("IDEMPRESA",usuario.getIdempresa()) ; 
			initialValues.put("IDUSUARIO",usuario.getIdusuario()) ; 
			initialValues.put("IDVENDEDOR",usuario.getIdvendedor()) ; 
			initialValues.put("PASSWORD",usuario.getPassword()) ; 
			initialValues.put("ESTADO",usuario.getEstado()) ; 
			resultado = mDb.update("USUARIO",initialValues,where,null)>0; 
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
			resultado = mDb.delete("USUARIO",where,null)>0; 
		} catch (Exception e) {
		}finally {
			mDb.close();
		} 
		return resultado; 
	} 

	public ArrayList<Usuario> listar(String where, String order, Integer limit) {
		if(limit == null){
			limit =0;
		}
		ArrayList<Usuario> lista  = new ArrayList<Usuario>();
		SQLiteDatabase mDb  = SQLiteDatabase.openDatabase(DataBaseClass.PATH_DATABASE,null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
		try{
			Cursor cur =  mDb.query("USUARIO",
					new String[] {
							 "IDBASEDATOS" ,
							 "IDEMPRESA" ,
							 "IDUSUARIO" ,
							 "IDVENDEDOR" ,
							 "PASSWORD" ,
							 "ESTADO" 
					},
			where, null, null, null, order);
			if (cur!=null){
				cur.moveToFirst();
				int i=0;
				while (cur.isAfterLast() == false) {
					int j=0;
					Usuario usuario = new Usuario() ;
					usuario.setIdbasedatos(cur.getString(j++));
					usuario.setIdempresa(cur.getString(j++));
					usuario.setIdusuario(cur.getString(j++));
					usuario.setIdvendedor(cur.getString(j++));
					usuario.setPassword(cur.getString(j++));
					usuario.setEstado(cur.getDouble(j++));

					lista.add(usuario); 
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
	/*-Inicio-*/

	public static String TABLE_NAME = "PRODUCTO";

	public Usuario buscarPorUsuario(String IDBASEDATOS, String IDUSUARIO){
		String where = " LTRIM(RTRIM(IDBASEDATOS)) = LTRIM(RTRIM('"+IDBASEDATOS+"')) AND  LTRIM(RTRIM(IDUSUARIO)) = LTRIM(RTRIM('"+IDUSUARIO+"'))";
		List<Usuario> l = listar(where,"",0);
		if (l.isEmpty()) {
			return null;
		} else {
			return l.get(0);
		}
	}

//	public Boolean login(String IDBASEDATOS, String IDEMPRESA, String IDUSUARIO, String PASSWORD){
//		Boolean selogueo = false;
//		String PASSWORD_ENCRYPTADO = Clave.Encriptar(PASSWORD);
//
//		String where = " LTRIM(RTRIM(IDBASEDATOS)) = LTRIM(RTRIM('"+IDBASEDATOS+"')) " +
//				" AND LTRIM(RTRIM(IDEMPRESA)) = LTRIM(RTRIM('"+IDEMPRESA+"')) " +
//				" AND LTRIM(RTRIM(IDUSUARIO)) = LTRIM(RTRIM('"+IDUSUARIO+"')) " +
//				" AND LTRIM(RTRIM(PASSWORD)) = LTRIM(RTRIM('"+PASSWORD_ENCRYPTADO+"'))  " ;
//
//		List<Usuario> l = listar(where,"",0);
//		if (!l.isEmpty()) {
//			if(l.size()>0){
//				selogueo = true;
//			}
//		}
//		return selogueo;
//	}

	public Boolean deletePorBaseDatos(String IDBASEDATOS){

		String where = " LTRIM(RTRIM(IDBASEDATOS)) = LTRIM(RTRIM('"+IDBASEDATOS+"')) ";


		return delete(where);
	}

	/*-Fin-*/
}