package com.example.controledelivros.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.controledelivros.R;
import com.example.controledelivros.model.Editora;

import java.util.List;

public class AdapterEditora extends RecyclerView.Adapter<AdapterEditora.MyViewHolder> {

    private List<Editora> listaEditoras;

    public AdapterEditora(List<Editora> lista){
        this.listaEditoras=lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_editora,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Editora editora = listaEditoras.get(position);
        holder.nome.setText(editora.getNomeEditora());
        holder.id.setText(editora.getId());


    }

    @Override
    public int getItemCount() {
        return this.listaEditoras.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView id;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textViewTituloEditoraListagem);
            id = itemView.findViewById(R.id.textViewId);

        }
    }


}
