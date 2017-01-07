package com.nisira.core.service;

import com.nisira.core.dao.UsuarioDao;
import com.nisira.core.entity.Usuario;
import com.thoughtworks.xstream.XStream;

import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

/**
 * Created by aburgos on 06/01/2017.
 */

public class ActionService {

    public static String ACTION_VERIFICATION_USER (String db,String response){
        try {

            XStream xstream = new XStream();
            xstream.processAnnotations(Usuario.class);
            Usuario usuario = (Usuario)xstream.fromXML(response);

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
