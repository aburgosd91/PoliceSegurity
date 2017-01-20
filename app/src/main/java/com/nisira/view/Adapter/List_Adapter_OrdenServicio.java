package com.nisira.view.Adapter;

import android.content.Context;
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
import com.nisira.view.Activity.mnt_DPersonalServicio_Fragment;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by gcalderon on 17/01/2017.
 */

public class List_Adapter_OrdenServicio extends RecyclerView.Adapter<List_Adapter_OrdenServicio.ListaViewHolder>{

    private List<Ordenserviciocliente> items;//Lo cambias por la coleccion que necesites Alex
    Context context;
    FragmentManager fragmentManager;

    public class ListaViewHolder extends RecyclerView.ViewHolder {
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

        }
    }

    public List_Adapter_OrdenServicio(List<Ordenserviciocliente> items, FragmentManager fragmentManager) {
        this.items = items;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public List_Adapter_OrdenServicio.ListaViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        context = viewGroup.getContext();
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_elementolista2, viewGroup, false);
        return new List_Adapter_OrdenServicio.ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(List_Adapter_OrdenServicio.ListaViewHolder viewHolder, int i) {

        viewHolder.nombre.setText("("+items.get(i).getRuc()+") "+items.get(i).getCliente());
        viewHolder.documento.setText(items.get(i).getSerie()+'-'+items.get(i).getNumero()+" - FR : "+items.get(i).getFecha());
        viewHolder.seleccion.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.blue_gray));
        viewHolder.seleccion.setImageResource(R.drawable.ic_arrow_white);
        viewHolder.fondo_seleccion.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.blue_gray));

        viewHolder.fondo_seleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.seleccion.setBackgroundColor(v.getResources().getColor(R.color.amarillo));
                viewHolder.seleccion.setImageResource(R.drawable.ic_check_big);
                viewHolder.fondo_seleccion.setBackgroundColor(v.getResources().getColor(R.color.amarillo));

                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.main_content, new mnt_DPersonalServicio_Fragment(), "NewFragmentTag");
                ft.commit();
            }
        });

    }

}
