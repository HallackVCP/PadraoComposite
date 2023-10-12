import org.example.CategoriaComposta;
import org.example.Departamento;
import org.example.SubCategoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DepartamentoTest {



    @Test
    void deveRetornarCategoriasDepartamento(){

        SubCategoria subCategoria1 = new SubCategoria("Acessorios para celular");
        CategoriaComposta categoriaComposta1 = new CategoriaComposta("Smartphones");
        CategoriaComposta categoriaComposta2 = new CategoriaComposta("Eletronicos");
        CategoriaComposta categoriaComposta3 = new CategoriaComposta("Eletrodomesticos");
        SubCategoria subCategoria2 = new SubCategoria("Televisoes");
        SubCategoria subCategoria3 = new SubCategoria("Cozinha");
        categoriaComposta3.addCategoria(subCategoria2);
        categoriaComposta3.addCategoria(subCategoria3);
        categoriaComposta1.addCategoria(subCategoria1);
        categoriaComposta2.addCategoria(categoriaComposta1);
        categoriaComposta2.addCategoria(categoriaComposta3);
        Departamento departamento = new Departamento("Produtos eletronicos", categoriaComposta2);
        assertEquals("Categoria: Eletronicos\n" +
                "Categoria: Smartphones\n" +
                "Sub categoria: Acessorios para celular; \n" +
                "Categoria: Eletrodomesticos\n" +
                "Sub categoria: Televisoes; \n" +
                "Sub categoria: Cozinha; \n", departamento.getCategoria());

    }


    @Test
    void deveRetornarDepartamentoSemCategorias(){
        try {
            Departamento departamento = new Departamento("Teste", null);
            departamento.getCategoria();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Produto sem categoria(s)!", e.getMessage());
        }
    }
}
