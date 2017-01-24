package com.nisira.view.Activity;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nisira.core.dao.DordenservicioclienteDao;
import com.nisira.core.dao.OrdenservicioclienteDao;
import com.nisira.core.entity.Dordenserviciocliente;
import com.nisira.core.entity.Ordenserviciocliente;
import com.nisira.core.interfaces.FragmentNisira;
import com.nisira.gcalderon.policesecurity.R;
import com.nisira.view.Adapter.Adapter_edt_DOrdenServicio;
import java.util.List;


public class edt_OrdenServicio_Fragment extends FragmentNisira {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextInputEditText txt_documento;
    private TextInputEditText txt_cliente;
    private TextInputEditText txt_nromanual;
    private TextInputEditText txt_nrocont;
    private TextInputEditText txt_nroprecinto;
    private TextInputEditText txt_nroservicio;
    private TextView txt_fecha;
    private TextView txt_estado;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    private Ordenserviciocliente ordenserviciocliente;

    public edt_OrdenServicio_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment edt_OrdenServicio_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static edt_OrdenServicio_Fragment newInstance(String param1, String param2) {
        edt_OrdenServicio_Fragment fragment = new edt_OrdenServicio_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_edt__orden_servicio, container, false);
        animacionEntrada();
        System.out.println("ORDEN SERVICIO");
        ordenserviciocliente = (Ordenserviciocliente) getArguments().getSerializable("OrdenServicio");
        System.out.println(ordenserviciocliente.getNro_oservicio());
        System.out.println(ordenserviciocliente.getNrocontenedor());
        System.out.println(ordenserviciocliente.getNromanual());
        System.out.println(ordenserviciocliente.getNroprecinto());

        txt_documento = (TextInputEditText)view.findViewById(R.id.txt_documento);
        txt_cliente = (TextInputEditText)view.findViewById(R.id.txt_cliente);
        txt_nrocont = (TextInputEditText)view.findViewById(R.id.txt_nrocont);
        txt_nromanual = (TextInputEditText)view.findViewById(R.id.txt_nromanual);
        txt_nroprecinto = (TextInputEditText)view.findViewById(R.id.txt_nroprecinto);
        txt_nroservicio = (TextInputEditText)view.findViewById(R.id.txt_nroservicio);
        txt_fecha = (TextView)view.findViewById(R.id.txt_fecha);
        txt_estado = (TextView)view.findViewById(R.id.txt_estado);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_os);

        txt_nrocont.setText(ordenserviciocliente.getNrocontenedor());
        txt_nromanual.setText(ordenserviciocliente.getNromanual());
        txt_nroprecinto.setText(ordenserviciocliente.getNroprecinto());
        txt_nroservicio.setText(ordenserviciocliente.getNro_oservicio());

        txt_documento.setText(ordenserviciocliente.getIddocumento()+"-"+ ordenserviciocliente.getSerie()+ "-"+ ordenserviciocliente.getIdempresa());
        txt_documento.setHint("Documento: ");
        txt_cliente.setText(ordenserviciocliente.getIdclieprov());
        txt_cliente.setHint("Cliente:");

//        txt_fecha.setText((CharSequence) ordenserviciocliente.getFecha());
        String estado = ordenserviciocliente.getIdestado();
        if(estado.equals("PE")){
            txt_estado.setText("Pendiente");
        }


        recyclerView.setHasFixedSize(true);
        lManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(lManager);
        DordenservicioclienteDao  DordenservicioclienteDao = new DordenservicioclienteDao();
        try {
            List<Dordenserviciocliente> lstordenserviciocliente = DordenservicioclienteDao.ListarxOrdenServicio(ordenserviciocliente);
            adapter = new Adapter_edt_DOrdenServicio(lstordenserviciocliente,getFragmentManager());
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }


    public void animacionEntrada(){
        Slide slide = (Slide) TransitionInflater.from(getContext()).inflateTransition(R.transition.activity_slide);
        setExitTransition(slide);
        setEnterTransition(slide);
    }
}
