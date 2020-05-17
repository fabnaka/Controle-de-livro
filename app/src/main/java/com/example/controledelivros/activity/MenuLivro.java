package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.controledelivros.R;

public class MenuLivro extends AppCompatActivity {

    private Button voltar;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_livro);

        voltar=findViewById(R.id.buttonVoltarLivro);
        cadastrar=findViewById(R.id.buttonCadastrarLivro);


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadastrarLivro.class);

                startActivity(intent);
            }
        });



    }
}
