package com.example.controledelivros.helper;

import com.example.controledelivros.model.Editora;

import java.util.List;

public interface IEditoraDAO {

    public boolean salvar (Editora editora);
    public boolean atualizar (Editora editora);
    public boolean deletar (Editora editora);
    public List<Editora> listar();

}
