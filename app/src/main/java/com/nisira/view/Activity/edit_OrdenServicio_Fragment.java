package com.nisira.view.Activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.nisira.gcalderon.policesecurity.R;


public class edit_OrdenServicio_Fragment extends Fragment {
    // TODO: ELEMENTOS DE LAYOUT
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private AutoCompleteTextView listbox;

    // TODO: PARAMETROS DE ENTRADA
    private String mParam1;
    private String mParam2;

    public edit_OrdenServicio_Fragment() {
        // Required empty public constructor
    }

    // TODO: FUNCIONES Y METODOS
    public static edit_OrdenServicio_Fragment newInstance(String param1, String param2) {
        edit_OrdenServicio_Fragment fragment = new edit_OrdenServicio_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_edit__orden_servicio, container, false);
        animacionEntrada();
        String[] NOMBRES = new String[] {
                "Gian", "Giancarlo", "Alex", "Andy","Ayrton","Acevedo","Antonela","Antony","Antonio"
                ,"André", "Joshe", "Alejandro","Aldo"
        };

        listbox = (AutoCompleteTextView) view.findViewById(R.id.autocompletetext1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line,NOMBRES);
        listbox.setAdapter(adapter);

        return view;
    }

    // TODO: TRANSICIONES Y ANIMACIONES

    public void animacionEntrada(){
        Fade fade = (Fade) TransitionInflater.from(getContext()).inflateTransition(R.transition.activity_fade);
        setEnterTransition(fade);
    }



}
