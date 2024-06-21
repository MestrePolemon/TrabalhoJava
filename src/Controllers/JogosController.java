package Controllers;
import java.util.ArrayList;
import java.util.List;

import Model.Jogos;
public class JogosController {

    private List<Jogos> jogosList = new ArrayList<>();

    boolean adicionarJogo(String nome, String id, double preco, int quantidade, String marca, int ano, String genero, String plataforma, String midia)
    {
        try
        {
            jogosList.add(new Jogos(nome, id, preco, quantidade, marca, ano, genero, plataforma, midia));
            return true;
        }catch (Exception erro)
        {
            erro.printStackTrace();
            return false;
        }
    }
}
