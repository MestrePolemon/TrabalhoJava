package Model;



import java.util.ArrayList;
import java.util.List;

public class JogosController {

    private List<Jogos> jogosList = new ArrayList<>();

    public boolean adicionarJogo(String nome, String id, double preco, int quantidade, String marca, int ano, String genero, String plataforma, String midia)
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

    public void listarJogos()
    {
        for (Jogos jogo : jogosList) {
            System.out.println(jogo);
        }
    }

    public Jogos buscarJogo(String id)
    {
        for (Jogos jogo : jogosList) {
            if(jogo.getId().equals(id))
            {
                return jogo;
            }
        }
        return null;
    }
    boolean removerJogo(String id){
        return jogosList.removeIf(jogo -> jogo.getId().equals(id));
    }
}

