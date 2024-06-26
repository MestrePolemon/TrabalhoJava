
package Model;


import java.util.ArrayList;
import java.util.List;

public class PecasController {

    private List<Pecas> listPecas = new ArrayList<>();

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

}
