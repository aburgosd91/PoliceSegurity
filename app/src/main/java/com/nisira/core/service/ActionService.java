package com.nisira.core.service;

import com.nisira.core.entity.Usuario;
import com.nisira.core.util.Util;

/**
 * Created by aburgos on 06/01/2017.
 */

public class ActionService {

    public static String ACTION_VERIFICATION_USER (String db,String response){
        try {
            Usuario usuario = (Usuario) Util.stringObject("com.nisira.core.entity.Usuario",response);
            if(usuario!=null)
                return "OK";
            return "";
        }
        catch (Exception e)
        {
            return e.getMessage();
//            if(VERERRORESSINCRONIZACION==1)
//            {
//                return e.toString();
//            }
//            else
//            {
//                return "Error de conectividad, Intente de nuevo";
//            }
        }
    }
}
