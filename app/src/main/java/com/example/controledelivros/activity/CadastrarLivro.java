package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.controledelivros.R;
import com.google.android.material.textfield.TextInputEditText;

public class CadastrarLivro extends AppCompatActivity {

    private TextInputEditText tituloLivro;
    private TextInputEditText edicaoLivro;
    private Spinner editora;
    private Button cadastrar;
    private Button voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_livro);


        tituloLivro=findViewById(R.id.textInputEditTextTitulo);
        edicaoLivro=findViewById(R.id.textInputEditTextEdicao);
        editora=findViewById(R.id.spinnerEditora);
        cadastrar=findViewById(R.id.buttonCadastrarLivro);
        voltar=findViewById(R.id.buttonVoltarCadastro);


        //Configuração botão voltar
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
