package com.nisira.view.Activity;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.nisira.core.dao.Personal_servicioDao;
import com.nisira.core.entity.Dordenserviciocliente;
import com.nisira.core.entity.Ordenserviciocliente;
import com.nisira.core.entity.Personal_servicio;
import com.nisira.core.interfaces.FragmentNisira;
import com.nisira.gcalderon.policesecurity.R;
import com.nisira.view.Adapter.Adapter_edt_PersonalServicio;


import java.util.List;


public class edt_PersonalServicio_Fragment extends FragmentNisira {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String OPCION = "param1";
    private static final String ANTERIOR = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private EditText txt_documento;
    private EditText txt_cliente;
    private TextView txt_estado;
    private TextInputEditText txt_producto;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    private Dordenserviciocliente dordenserviciocliente;
    private Ordenserviciocliente ordenserviciocliente;
    private FloatingActionButton  btn_agregar;

    public edt_PersonalServicio_Fragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static edt_PersonalServicio_Fragment newInstance(String param1, String param2) {
        edt_PersonalServicio_Fragment fragment = new edt_PersonalServicio_Fragment();
        Bundle args = new Bundle();
        args.putString(OPCION, param1);
        args.putString(ANTERIOR, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(OPCION);
            mParam2 = getArguments().getString(ANTERIOR);
            dordenserviciocliente = (Dordenserviciocliente) getArguments().getSerializable("DOrdenServicio");
            ordenserviciocliente = (Ordenserviciocliente) getArguments().getSerializable("OrdenServicio");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edt_personalservicio, container, false);
        animacionEntrada();

        txt_documento = (EditText)view.findViewById(R.id.txt_documento);
        txt_cliente = (EditText)view.findViewById(R.id.txt_cliente);
        txt_producto = (TextInputEditText)view.findViewById(R.id.txt_producto);
        txt_estado = (TextView)view.findViewById(R.id.txt_estado);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_os);
        btn_agregar = (FloatingActionButton)view.findViewById(R.id.fab_agregar);
        if(dordenserviciocliente==null){
            //do something
        }
        txt_documento.setText(ordenserviciocliente.getIddocumento()+ " " +
                ordenserviciocliente.getSerie()+ "-"+
                ordenserviciocliente.getNumero());
        txt_cliente.setText(ordenserviciocliente.getCliente());
        txt_producto.setText(dordenserviciocliente.getDescripcion_servicio());
        if(ordenserviciocliente.getIdestado().equals("PE")){
            txt_estado.setText("Pendiente");
        }
        recyclerView.setHasFixedSize(true);
        lManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(lManager);
        Personal_servicioDao  personal_servicioDao = new Personal_servicioDao();
        try {
            List<Personal_servicio> list = personal_servicioDao.listarxDordenservicio(dordenserviciocliente);
            Adapter_edt_PersonalServicio adapter = new Adapter_edt_PersonalServicio(list,getFragmentManager());
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO EVENTOS

        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = mnt_PersonalServicio_Fragment.newInstance("Asignacion Personal", "ejemplo2");
                //fragment.setArguments(bundle);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.main_content, fragment, "NewFragmentTag");
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        return view;
    }


    public void animacionEntrada(){
        Slide slide = (Slide) TransitionInflater.from(getContext()).inflateTransition(R.transition.activity_slide);
        setExitTransition(slide);
        setEnterTransition(slide);
    }
}
