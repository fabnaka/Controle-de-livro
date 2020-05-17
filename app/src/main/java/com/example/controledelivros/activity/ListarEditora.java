package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.controledelivros.R;
import com.example.controledelivros.adapter.AdapterEditora;
import com.example.controledelivros.model.Editora;

import java.util.ArrayList;
import java.util.List;

public class ListarEditora extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterEditora adapterEditora;
    private List<Editora> listaEditora = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_editora);

        recyclerView=findViewById(R.id.recyclerViewEditora);

    }

    public void carregarListaEditoras(){

        //Listagem de editoras
        Editora editora1 = new Editora();
        editora1.setNomeEditora("Editora Teste1");
        editora1.setId("1");
        listaEditora.add(editora1);

        Editora editora2 = new Editora();
        editora2.setNomeEditora("Editora Teste2");
        editora2.setId("2");
        listaEditora.add(editora2);

        Editora editora3 = new Editora();
        editora3.setNomeEditora("Editora Teste3");
        editora3.setId("3");
        listaEditora.add(editora3);

        Editora editora4 = new Editora();
        editora4.setNomeEditora("Editora Teste4");
        editora4.setId("4");
        listaEditora.add(editora4);

        Editora editora5 = new Editora();
        editora5.setNomeEditora("Editora Teste5");
        editora5.setId("5");
        listaEditora.add(editora5);


        //Configurar o adapter
        adapterEditora = new AdapterEditora(listaEditora);


        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterEditora);

    }

    @Override
    protected void onStart() {
        carregarListaEditoras();
        super.onStart();
    }
}
