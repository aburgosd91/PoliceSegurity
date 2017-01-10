package com.nisira.core.service;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;

import com.nisira.core.entity.Basedatos;
import com.nisira.core.interfaces.ActivityNisira;
import com.nisira.core.interfaces.ActivityNisiraCompat;
import com.nisira.core.interfaces.FragmentNisira;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

//public class ConsumerService extends AsyncTaskService<String, Void, Integer> {
public class ConsumerService extends AsyncTask<String, Void, String> {
    private final Context context1;
    private Activity activity;
    private Fragment fragment;
    String response = "";
    public ProgressDialog pd;
    private String method;
    private Service ws;
    private LinkedHashMap attribute;
    private Basedatos WSBasedatos;
//    private Empresa WSEmpresa;
//    private Usuario WSUsuario;


    public ConsumerService(Activity activity, Context context, String method, Integer parametro_timeout) {
        this.context1 = context;
        this.activity =activity;
        this.setMethod(method);
        this.ws =new Service(context);
        this.setAttribute(new LinkedHashMap());
        this.WSBasedatos = new Basedatos();
        WSBasedatos.setWsurl(Service.URL);
        WSBasedatos.setIdbasedatosconexion("AUTONOR");
    }
    public ConsumerService(Fragment fragment, Context context, String method, Integer parametro_timeout) {
        this.context1 = context;
        this.fragment =fragment;
        this.setMethod(method);
        this.ws =new Service(context);
        this.setAttribute(new LinkedHashMap());
        this.WSBasedatos = new Basedatos();
        WSBasedatos.setWsurl(Service.URL);
        WSBasedatos.setIdbasedatosconexion("AUTONOR");
    }

    //protected Integer doInBackground(String... args) {
    protected String doInBackground(String... args) {
        try {
            String xmlGson = "";
            switch (getMethod().trim()){
                case TypeMethod.METHOD_VERIFICATION_USER           :
                    xmlGson = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_VERIFICATION_USER, getAttribute());
                    response = ActionService.ACTION_VERIFICATION_USER(WSBasedatos.getIdbasedatos(),xmlGson);
                    break;
                case TypeMethod.METHOD_LIST_CLIEPROV           :
                    response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_LIST_CLIEPROV, getAttribute());
                    break;
                case TypeMethod.METHOD_SYNC_BASEDATOS              : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_BASEDATOS, getAttribute());break;
                case TypeMethod.METHOD_SYNC_CARGOS_PERSONAL        : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_CARGOS_PERSONAL, getAttribute());break;
                case TypeMethod.METHOD_SYNC_CLIEPROV               : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_CLIEPROV, getAttribute());break;
                case TypeMethod.METHOD_SYNC_CONSUMIDOR             : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_CONSUMIDOR, getAttribute());break;
                case TypeMethod.METHOD_SYNC_COTIZACIONVENTAS       : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_COTIZACIONVENTAS, getAttribute());break;
                case TypeMethod.METHOD_SYNC_DCOTIZACIONVENTAS      : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_DCOTIZACIONVENTAS, getAttribute());break;
                case TypeMethod.METHOD_SYNC_DOCUMENTOS             : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_DOCUMENTOS, getAttribute());break;
                case TypeMethod.METHOD_SYNC_DORDENSERVICIOCLIENTE  : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_DORDENSERVICIOCLIENTE, getAttribute());break;
                case TypeMethod.METHOD_SYNC_ESTADOS                : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_ESTADOS, getAttribute());break;
                case TypeMethod.METHOD_SYNC_NUMEMISOR              : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_NUMEMISOR, getAttribute());break;
                case TypeMethod.METHOD_SYNC_ORDENSERVICIOCLIENTE   : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_ORDENSERVICIOCLIENTE, getAttribute());break;
                case TypeMethod.METHOD_SYNC_PERSONAL_SERVICIO      : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_PERSONAL_SERVICIO, getAttribute());break;
                case TypeMethod.METHOD_SYNC_PRODUCTOS              : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_PRODUCTOS, getAttribute());break;
                case TypeMethod.METHOD_SYNC_RUTA_SERVICIO          : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_RUTA_SERVICIO, getAttribute());break;
                case TypeMethod.METHOD_SYNC_RUTAS                  : response = (String)ws.requestObject(WSBasedatos.getWsurl(), TypeMethod.METHOD_SYNC_RUTAS, getAttribute());break;
            }
        } catch (IOException | XmlPullParserException e) {
            response = e.getMessage();
            e.printStackTrace();
        }
        //return 1;
        return response;
    }
    //protected void onPostExecute(Object result) {
    public void onPostExecute(String result) {
        pd.dismiss();

        if(response.trim().contains("failed to connect to") ){
            response = "ERROR: No se puede conectar con NISIRA ERP.";
        }
        if(response.trim().contains("status: 404") ){
            response = "ERROR: Los Servicios Web están inactivos.";
        }

        if(getMethod().compareTo("getVerificarActualizacion") == 0)
        {
            if(response.trim().compareTo("Error de conectividad, Intente de nuevo")==0 || response == null)
            {
                //VerificarVersion(context1, "Error de conectividad, Intente de nuevo");
                super.onPostExecute(result);
                return;
            }
            else{
                //VerificarVersion(context1, res);
                super.onPostExecute(result);
                return;
            }
        }
        try {
            ((ActivityNisira) (activity)).onPostExecuteWebService(ConsumerService.this, response);
        }catch (Exception ex){
            try {
                ((ActivityNisiraCompat) (activity)).onPostExecuteWebService(ConsumerService.this, response);
            }catch (Exception ex2){
                ((FragmentNisira)(fragment)).onPostExecuteWebService(ConsumerService.this, response);
            }
        }
        super.onPostExecute(result);

    }

    public HashMap getAttribute() {
        return attribute;
    }

    public void setAttribute(LinkedHashMap attribute) {
        this.attribute = attribute;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}

