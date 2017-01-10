package com.nisira.view.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.nisira.core.entity.Clieprov;
import com.nisira.gcalderon.policesecurity.R;

import java.util.List;

/**
 * Created by ABURGOS on 05/01/2017.
 */

public class List_Adapter_Personal extends RecyclerView.Adapter<List_Adapter_Personal.ListaViewHolder> {

    private List<Clieprov> items;//Lo cambias por la coleccion que necesites Alex

public static class ListaViewHolder extends RecyclerView.ViewHolder {
    // Campos respectivos de un item
    public ImageView imagen;
    public TextView nombre;
    public TextView documento;
    public TextView estado;
    public CheckBox seleccion;
    public ListaViewHolder(View v) {
        super(v);
        imagen = (ImageView) v.findViewById(R.id.imagen_personal);
        nombre = (TextView) v.findViewById(R.id.nombre);
        documento = (TextView) v.findViewById(R.id.txtdocumento);
        estado = (CheckBox) v.findViewById(R.id.checkSeleccion);
    }
}

    public List_Adapter_Personal(List<Clieprov> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_elementolista, viewGroup, false);
        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder viewHolder, int i) {
        //AQUI VAN TODOS LOS ELEMENTOS DE LA LISTA.
        //viewHolder.imagen.setImageResource());
        viewHolder.nombre.setText(items.get(i).getRazon_social());
        viewHolder.documento.setText(items.get(i).getRuc());
        viewHolder.estado.setText((items.get(i).getEstado()==1.00?"Activo":"Inactivo"));
//        viewHolder.seleccion.setChecked(false);
    }
}