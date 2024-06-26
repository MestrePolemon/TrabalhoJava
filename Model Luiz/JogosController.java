
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogosController {

    Scanner scanner = new Scanner(System.in);

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

    public void venderJogos(String id, int quant){

        Jogos jogo_venda = buscarJogo(id);

        if(jogo_venda.getQuantidade()<quant){

            System.out.println("quantidade insuficiente");
            
        }else{

            System.out.println("Deseja prosseguir com a venda ?");
            System.out.println("Confirmar: 1");
            System.out.println("Cancelar: 2");
            int opcao = scanner.nextInt();

            if(opcao ==1){

                jogo_venda.vender(quant);

            }else if(opcao == 2){

                System.out.println("venda cancelada");

            }else{

                System.out.println("Opção invalida");
                System.out.println("Informe novamente");

                venderJogos(id, quant);

            }
        }
    }
}

