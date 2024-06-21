package Controllers;

import java.util.ArrayList;
import java.util.List;

import Model.Pecas;

public class PecasController {

    private List<Pecas> listPecas = new ArrayList<>();

    boolean adicionarPeca(String nome, String id, double preco, int quantidade, String marca, int ano, String tipo, String modelo)
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

}
