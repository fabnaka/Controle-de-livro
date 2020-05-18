package com.example.controledelivros.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.controledelivros.R;
import com.example.controledelivros.helper.EditoraDAO;
import com.example.controledelivros.model.Editora;
import com.google.android.material.textfield.TextInputEditText;

public class CadastrarEditora extends AppCompatActivity {

    private TextInputEditText nomeEditora;
    private Button cadastrar;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_editora);


        nomeEditora=findViewById(R.id.textInputEditTextNomeEditora);
        cadastrar=findViewById(R.id.buttonCadastarEditora);
        voltar=findViewById(R.id.buttonVoltarCadastroEditora);


        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditoraDAO editoraDAO = new EditoraDAO(getApplicationContext());

                String nomeEditoraa = nomeEditora.getText().toString();

                if (!nomeEditoraa.isEmpty()){
                    Editora editora = new Editora ();
                    editora.setNomeEditora(nomeEditoraa);
                    editoraDAO.salvar(editora);
                    finish();
                }
            }
        });



        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
