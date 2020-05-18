package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.example.controledelivros.R;
import com.example.controledelivros.adapter.AdapterEditora;
import com.example.controledelivros.helper.DBHelper;
import com.example.controledelivros.helper.EditoraDAO;
import com.example.controledelivros.helper.RecyclerItemClickListener;
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




        //Adicionar evento de clique
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Log.i("clique","onItemClick");
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Log.i("clique","onLongItemClick");
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }

    public void carregarListaEditoras(){

        //Listagem de editoras
        EditoraDAO editoraDAO = new EditoraDAO(getApplicationContext());
        listaEditora = editoraDAO.listar();



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
