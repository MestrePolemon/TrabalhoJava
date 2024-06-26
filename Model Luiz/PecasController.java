
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PecasController {

    private List<Pecas> listPecas = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public boolean adicionarPeca(String nome, String id, double preco, int quantidade, String marca, int ano, String tipo, String modelo)
    {
          try
          {
              listPecas.add(new Pecas(nome,id, preco, quantidade,marca, ano, tipo,modelo));
              return true;
          } catch (Exception erro)
          {
              erro.printStackTrace();
              return false;
          }
    }

    public void listarPecas()
    {
        for (Pecas peca : listPecas) {
            System.out.println(peca);
        }
    }

    public Pecas buscarPeca(String id)
    {
        for (Pecas peca : listPecas) {
            if(peca.getId().equals(id))
            {
                return peca;
            }
        }
        return null;
    }

    boolean removerPeca(String id){
        return listPecas.removeIf(pecas -> pecas.getId().equals(id));
    }


    public void venderPecas(String id, int quant){

        Pecas peca_venda = buscarPeca(id);

        if(peca_venda.getQuantidade()<quant){
            System.out.println("quantidade insuficiente");
        }else{

            System.out.println("Deseja prosseguir com a venda ?");
            System.out.println("Confirmar: 1");
            System.out.println("Cancelar: 2");
            int opcao = scanner.nextInt();

            if(opcao ==1){
                peca_venda.vender(quant);
            }else if(opcao == 2){
                System.out.println("venda cancelada");
            }else{
                System.out.println("Opção invalida");
                System.out.println("Informe novamente");

                venderPecas(id, quant);
            }
        }
    }

}
