package com.example.controledelivros.model;

import java.io.Serializable;

public class Editora implements Serializable {

    private String id;
    private String nomeEditora;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
}
