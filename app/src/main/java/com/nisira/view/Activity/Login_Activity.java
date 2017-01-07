package com.nisira.view.Activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import com.nisira.core.database.DataBaseClass;
import com.nisira.core.interfaces.ActivityNisiraCompat;
import com.nisira.core.interfaces.VariableGlobal;
import com.nisira.core.service.ConsumerService;
import com.nisira.core.service.TypeMethod;
import com.nisira.core.util.Util;
import com.nisira.gcalderon.policesecurity.R;

public class Login_Activity extends ActivityNisiraCompat  implements ActivityCompat.OnRequestPermissionsResultCallback,SearchView.OnQueryTextListener,SearchView.OnCloseListener{
    private static final int PERMISSION_REQUEST_CODE = 1;
    /*CONTROLLER*/
    Button btn_login;
    EditText txtuser;
    EditText txtpassword;
    /*ADDITIONAL*/
    VariableGlobal variablesglobales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        variablesglobales = (VariableGlobal)getApplication();
        if (Build.VERSION.SDK_INT >= 23)
        {
            if (checkPermission())
            {
                //Realizando la conexion por defecto y sincronizando base de datos local SQLITE del dispositivo movil
                //Creacion de carpetas
                try {
                    DataBaseClass.SincronizarDB(getApplication());
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            } else {
                requestPermission();
                return;
            }
        }
        else
        {
            //Realizando la conexion por defecto y sincronizando base de datos local SQLITE del dispositivo movil
            //Creacion de carpetas
            try {
                DataBaseClass.SincronizarDB(getApplication());
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        if(Util.isOnLine(this.getApplicationContext()))
        {
            SincronizarCredenciales();
        }
        txtuser = (EditText) findViewById(R.id.txtUser);
        txtpassword = (EditText)findViewById(R.id.txtPassword);
        btn_login = (Button)  findViewById(R.id.button);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verification_login();
                //startActivity(new Intent(Login_Activity.this, SplashScreen_Activity.class));
                //startActivity(new Intent(Login_Activity.this, NavigationPolice_Activity.class));
            }
        });
    }

    @Override
    public boolean onClose() {
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }
    private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(Login_Activity.this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }
    public static void startInstalledAppDetailsActivity(final Activity context) {
        if (context == null) {
            return;
        }
        final Intent i = new Intent();
        i.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        i.addCategory(Intent.CATEGORY_DEFAULT);
        i.setData(Uri.parse("package:" + context.getPackageName()));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        i.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        context.startActivity(i);
    }

    private void requestPermission() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(Login_Activity.this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

            String mensaje = "El aplicativo no tiene permiso de almacenamiento.?Ir a ajustes para brindar el permiso de almacenamiento al aplicativo.?";
            AlertDialog alert =  Util.msgboxConfirmacion(Login_Activity.this,mensaje,"PERMISO DE ALMACENAMIENTO");
            alert.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startInstalledAppDetailsActivity(Login_Activity.this);
                    alert.dismiss();
                }
            });

        } else {
            ActivityCompat.requestPermissions(Login_Activity.this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.e("value", "Permission Granted, Now you can use local drive .");
                } else {
                    Log.e("value", "Permission Denied, You cannot use local drive .");
                }
                break;
        }
    }
    /***********ACTION**************/
    public void verification_login(){
        if(txtuser.getText().toString().trim().length()==0){
            Util.msgbox(this,"Ingresar Usuario","ERROR");
            return;
        }

        if(txtpassword.getText().toString().trim().length()==0){
            Util.msgbox(this,"Ingresar Contraseña","ERROR");
            return;
        }

        /*********** CONECTAR SERVIDOR *************/
        ConsumerService cws = new ConsumerService(Login_Activity.this,getApplicationContext(), TypeMethod.METHOD_VERIFICATION_USER, 5);
        cws.getAttribute().put("type","XML");
        cws.getAttribute().put("user",txtuser.getText());
        cws.getAttribute().put("password",txtpassword.getText());
        cws.execute("");
        cws.pd = ProgressDialog.show(Login_Activity.this, "SINCRONIZANDO","Sincronizando Base de Datos", true, false);

    }
    /**************METHOD ADDITIONAL*****************/
    public void SincronizarCredenciales(){
//        ConsumerService cws = new ConsumerService(Login_Activity.this,getApplicationContext(), ConsumirServiciosWeb.WS_SYNC_DB_EMP_USER_VEND, 5);
//        String EMPRESA_CLIENTE = "CAYALTI";
//        cws.setEmpresacliente(EMPRESA_CLIENTE);
//        cws.execute("");
//        cws.pd = ProgressDialog.show(Login.this, "SINCRONIZANDO","Sincronizando Base de Datos", true, false);
    }
    @Override
    public  void onPostExecuteWebService(ConsumerService cws, String result) {

        if(cws.getMethod().trim().equals(TypeMethod.METHOD_VERIFICATION_USER)){
            if(result.trim().equals("OK")){
                Toast.makeText(getApplicationContext(),"Session Exitosa !!!.",Toast.LENGTH_SHORT).show();
                //llenar();
            }
            else{
                Toast.makeText(getApplicationContext(),"Error:"+result.trim(),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
