package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.controledelivros.R;
import com.example.controledelivros.helper.DBHelper;

public class MainActivity extends AppCompatActivity {

    private Button botaoLivro;
    private Button botaoEditora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLivro = findViewById(R.id.buttonLivro);
        botaoEditora = findViewById(R.id.buttonEditora);

        //Abrir menu livro
        botaoLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MenuLivro.class);

                startActivity(intent);
            }
        });

        //Abrir menu editora
        botaoEditora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuEditora.class);

                startActivity(intent);
            }
        });


    }
}
