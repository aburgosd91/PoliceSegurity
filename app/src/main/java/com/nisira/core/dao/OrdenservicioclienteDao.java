package com.nisira.core.dao;

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

public class OrdenservicioclienteDao extends BaseDao<Ordenserviciocliente> {
	public OrdenservicioclienteDao() {
		super(Ordenserviciocliente.class);
	}
	public OrdenservicioclienteDao(boolean usaCnBase) throws Exception {
		super(Ordenserviciocliente.class, usaCnBase);
	}
	public void mezclarLocal(Ordenserviciocliente obj)throws Exception{
		if(obj !=null){
			List<Ordenserviciocliente> lst= listar("LTRIM(RTRIM(t0.IDEMPRESA)) =? AND LTRIM(RTRIM(t0.IDORDENSERVICIO))=?",obj.getIdempresa().trim(),obj.getIdordenservicio().trim());
			if(lst.isEmpty())
				insertar(obj);
			else
				actualizar(obj);
		}
	}

}