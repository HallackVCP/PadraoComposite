package org.example;

public abstract class Categoria {

    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public abstract String getCategoria();
}
