package org.example;

public class Departamento {
    private String nome;
    private Categoria categoria;

    public Departamento(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getCategoria() {
        if(this.categoria == null){
            throw new NullPointerException("Produto sem categoria(s)!");
        }
        return this.categoria.getCategoria();
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
