package org.example;

import java.util.ArrayList;
import java.util.List;

public class CategoriaComposta extends Categoria{

    private List<Categoria> categorias;

    public CategoriaComposta(String nome) {
        super(nome);
        this.categorias = new ArrayList<Categoria>();
    }

    public void addCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }
    @Override
    public String getCategoria() {
        String saida = "";
        saida = "Categoria: " + this.getNome() + "\n";
        for (Categoria categoria : categorias) {
            saida += categoria.getCategoria();
        }
        return saida;
    }
}
