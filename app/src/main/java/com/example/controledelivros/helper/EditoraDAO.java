package com.example.controledelivros.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.controledelivros.model.Editora;

import java.util.List;

public class EditoraDAO implements IEditoraDAO {

    private SQLiteDatabase escreve;
    private SQLiteDatabase le;

    public EditoraDAO(Context context) {
        DBHelper db = new DBHelper(context);
        escreve = db.getWritableDatabase();
        le = db.getReadableDatabase();
    }

    @Override
    public boolean salvar(Editora editora) {

        ContentValues cv = new ContentValues();
        cv.put("nomeEditora", editora.getNomeEditora());

        try {
            escreve.insert(DBHelper.TABELA_EDITORAS, null, cv);
            Log.i("INFO", "Editora salva com sucesso!");
        } catch (Exception e){
            Log.e("INFO", "Erro ao salvar editora" + e.getMessage());
            return false;
        }


        return true;
    }

    @Override
    public boolean atualizar(Editora editora) {
        return false;
    }

    @Override
    public boolean deletar(Editora editora) {
        return false;
    }

    @Override
    public List<Editora> listar() {
        return null;
    }
}
