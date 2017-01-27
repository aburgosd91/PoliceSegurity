package com.nisira.core.service;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nisira.core.entity.Clieprov;
import com.nisira.core.service.response.ClieprovResponse;
import com.nisira.core.view.BaseView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aburgos on 26/01/2017.
 */

public class VolleyService {
    private static final String TAG ="VolleyService";
    private RequestQueue queue;
    private Context context;
    private BaseView view;
    /*PARAMETROS*/
    private List<Clieprov> dataClieprov;
    public VolleyService(BaseView view, Context context) {
        this.view = view;
        this.context = context;
    }
    public void load(){
        dataClieprov = new ArrayList<>();
        queue = Volley.newRequestQueue(context);
        String url=Service.URL;
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,url,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("load",response.toString());
                        Log.v(TAG, response.toString());
                        GsonBuilder builder = new GsonBuilder();
                        Gson gson = builder.create();
                        ClieprovResponse objects = gson.fromJson(response.toString(), ClieprovResponse.class);
                        dataClieprov= objects.getdatos();
                        view.completeSuccess(dataClieprov,100);
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("Cliprov", "Error: " + error.getMessage());
                // hide the progress dialog
                view.completeError(dataClieprov,100);
            }
        })
        {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("type", "JSON");
                return params;
            }
        };

        Log.i("Data Clieprov",dataClieprov.toString());
        queue.add(jsonObjReq);
    }
}
