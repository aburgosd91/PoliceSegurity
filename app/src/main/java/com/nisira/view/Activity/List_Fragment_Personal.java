package com.nisira.view.Activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.nisira.core.entity.Clieprov;
import com.nisira.core.interfaces.FragmentNisira;
import com.nisira.core.service.ConsumerService;
import com.nisira.core.service.TypeMethod;
import com.nisira.core.util.Util;
import com.nisira.gcalderon.policesecurity.R;
import com.nisira.view.Adapter.List_Adapter_Personal;

import java.util.List;

public class List_Fragment_Personal extends FragmentNisira {

    // TODO: ELEMENTOS DEL LAYOUT
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    private FloatingActionButton fab_agregar;

    // TODO: PARAMETROS DE ENTRADA
    private String mParam1;
    private String mParam2;

    public List_Fragment_Personal() {
        // Required empty public constructor
    }

    // TODO: FUNCIONES Y METODOS
    public static List_Fragment_Personal newInstance(String param1, String param2) {
        List_Fragment_Personal fragment = new List_Fragment_Personal();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista, container, false);
        animacionEntrada();
        fab_agregar = (FloatingActionButton) view.findViewById(R.id.fab_agregar);
        fab_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.main_content, new edit_OrdenServicio_Fragment(), "NewFragmentTag");
                ft.commit();
            }
        });

        // Inflate the layout for this fragment
        recycler = (RecyclerView) view.findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(lManager);

        //Cargar datos desde la BD(items)
        ConsumerService cws = new ConsumerService(this,this.getContext(), TypeMethod.METHOD_LIST_CLIEPROV, 5);
        cws.getAttribute().put("type","XML");
        cws.execute("");
        cws.pd = ProgressDialog.show(this.getActivity(), "SINCRONIZANDO","Sincronizando Personal", true, false);

        return view;
    }
    // TODO: TRANSICIONES Y ANIMACIONES

    public void animacionEntrada(){
        Slide slide = (Slide) TransitionInflater.from(getContext()).inflateTransition(R.transition.activity_slide);
        setExitTransition(slide);
    }
    @Override
    public  void onPostExecuteWebService(ConsumerService cws, String result) {
        if(cws.getMethod().trim().equals(TypeMethod.METHOD_LIST_CLIEPROV)){
            try {
                List<Clieprov> listClieprov = (List<Clieprov>) Util.stringListObject("com.nisira.core.entity.Clieprov",result);
                // Crear un nuevo adaptador
                adapter = new List_Adapter_Personal(listClieprov);
                recycler.setAdapter(adapter);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(getContext(),"Error :"+e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
