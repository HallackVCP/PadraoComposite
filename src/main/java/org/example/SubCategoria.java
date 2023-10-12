package org.example;

public class SubCategoria extends Categoria{


    public SubCategoria(String nome) {
        super(nome);
    }

    @Override
    public String getCategoria() {
        return "Sub categoria: "+ this.getNome() + "; \n";
    }
}
