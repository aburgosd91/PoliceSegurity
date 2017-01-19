package com.nisira.view.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nisira.core.entity.Clieprov;
import com.nisira.gcalderon.policesecurity.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

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
    public CircleImageView seleccion;
    public RelativeLayout fondo_seleccion;
    public boolean bool_seleccion;
    public ListaViewHolder(View v) {
        super(v);
        imagen = (ImageView) v.findViewById(R.id.imagen_personal);
        nombre = (TextView) v.findViewById(R.id.nombre);
        documento = (TextView) v.findViewById(R.id.txtdocumento);
        seleccion = (CircleImageView) v.findViewById(R.id.seleccion);
        fondo_seleccion = (RelativeLayout) v.findViewById(R.id.fondo_seleccion);
        //estado = (CheckBox) v.findViewById(R.id.checkSeleccion);
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
        if(items.get(i).getSeleccion()==1){
            viewHolder.seleccion.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.amarillo));
            viewHolder.seleccion.setImageResource(R.drawable.ic_check_big);
            viewHolder.fondo_seleccion.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.amarillo));
        }else {
            viewHolder.seleccion.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.blue_gray));
            viewHolder.seleccion.setImageResource(R.drawable.ic_none);
            viewHolder.fondo_seleccion.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.blue_gray));
        }
        //viewHolder.estado.setText((items.get(i).getEstado()==1.00?"Activo":"Inactivo"));
        //viewHolder.seleccion.setChecked(false);

        //TODO: EVENTOS
        viewHolder.seleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(items.get(i).getSeleccion()==1)) {
                    viewHolder.seleccion.setBackgroundColor(v.getResources().getColor(R.color.amarillo));
                    viewHolder.seleccion.setImageResource(R.drawable.ic_check_big);
                    viewHolder.fondo_seleccion.setBackgroundColor(v.getResources().getColor(R.color.amarillo));
                    items.get(i).setSeleccion(1);
                    Log.i("DEBUG",i+" "+items.get(i).getRazon_social());

                }else{
                    items.get(i).setSeleccion(0);
                    viewHolder.seleccion.setBackgroundColor(v.getResources().getColor(R.color.blue_gray));
                    viewHolder.seleccion.setImageResource(R.drawable.ic_none);
                    viewHolder.fondo_seleccion.setBackgroundColor(v.getResources().getColor(R.color.blue_gray));
                }
                notifyItemChanged(i);
            }
        });
    }
}