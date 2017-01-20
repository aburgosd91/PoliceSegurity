package com.nisira.view.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nisira.core.entity.Ordenserviciocliente;
import com.nisira.gcalderon.policesecurity.R;
import com.nisira.view.Activity.edt_PersonalServicio_Fragment;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by ABURGOS on 05/01/2017.
 */

public class Adapter_lst_OrdenServicio extends RecyclerView.Adapter<Adapter_lst_OrdenServicio.ListaViewHolder> {

    private List<Ordenserviciocliente> items;
    public FragmentManager fragmentManager;

public static class ListaViewHolder extends RecyclerView.ViewHolder {
    // Campos respectivos de un item
    public ImageView imagen;
    public TextView nombre;
    public TextView ordenservicio;
    public TextView fecha;
    public CircleImageView seleccion;
    public RelativeLayout fondo_seleccion;
    public boolean bool_seleccion;
    public ListaViewHolder(View v) {
        super(v);
        imagen = (ImageView) v.findViewById(R.id.imagen_personal);
        nombre = (TextView) v.findViewById(R.id.nombre);
        ordenservicio = (TextView) v.findViewById(R.id.txtdocumento);
        seleccion = (CircleImageView) v.findViewById(R.id.seleccion);
        fondo_seleccion = (RelativeLayout) v.findViewById(R.id.fondo_seleccion);
        fecha = (TextView) v.findViewById(R.id.txtfecha);
    }
}

    public Adapter_lst_OrdenServicio(List<Ordenserviciocliente> items, FragmentManager fragmentManager) {
        this.items = items;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_ordenservicio, viewGroup, false);
        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder viewHolder, int i) {
        //AQUI VAN TODOS LOS ELEMENTOS DE LA LISTA.
        viewHolder.nombre.setText("("+items.get(i).getRuc()+") "+items.get(i).getCliente());
        viewHolder.ordenservicio.setText(items.get(i).getIddocumento()+" - "+items.get(i).getSerie()+" - "+items.get(i).getNumero());
        viewHolder.fecha.setText(items.get(i).getFecha().toString());

        //TODO: EVENTOS
        viewHolder.seleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewHolder.seleccion.setBackgroundColor(v.getResources().getColor(R.color.amarillo));
                viewHolder.seleccion.setImageResource(R.drawable.ic_check_big);
                viewHolder.fondo_seleccion.setBackgroundColor(v.getResources().getColor(R.color.amarillo));
                Fragment fragment = edt_PersonalServicio_Fragment.newInstance("Asignacion Personal", "ejemplo2");
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.main_content, fragment, "NewFragmentTag");
                ft.commit();

                notifyItemChanged(i);
            }
        });
    }
}