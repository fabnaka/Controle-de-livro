package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.controledelivros.R;

public class MenuEditora extends AppCompatActivity {

    private Button cadastrarEditora;
    private Button listarEditora;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_editora);

        voltar=findViewById(R.id.buttonVoltarEditora);
        cadastrarEditora=findViewById(R.id.buttonMenuCadastrarEditora);
        listarEditora = findViewById(R.id.buttonListarEditora);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cadastrarEditora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastrarEditora.class);
                startActivity(intent);

            }
        });

        listarEditora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ListarEditora.class);
                startActivity(intent);
            }
        });

    }
}
