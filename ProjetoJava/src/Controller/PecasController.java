package Controller;

import Model.Atendente;
import Model.Gerente;
import Model.Pecas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PecasController {

    private List<Pecas> listPecas = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public PecasController() {
        listPecas.add(new Pecas("Placa de video", 5000, 10, "Nvidia", 2020, "RTX 3080"));
        listPecas.add(new Pecas("Processador", 4500, 10, "Intel", 2020, "i9 10900k"));
    }

    public boolean adicionarPeca(String nome, float preco, int quantidade, String marca, int ano, String tipo)
    {
          try
          {
              listPecas.add(new Pecas(nome, preco, quantidade,marca, ano, tipo));
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

    public Pecas buscarPeca(int id)
    {
        for (Pecas peca : listPecas) {
            if(peca.getId() == id)
            {
                return peca;
            }
        }
        return null;
    }

    public boolean removerPeca(int id){
        return listPecas.removeIf(pecas -> pecas.getId() == id);
    }


    public void venderPecas(int id, int quant){

        Pecas peca_venda = buscarPeca(id);

        if (peca_venda == null){
            System.out.println("Peca não encontrada");
        }

        if(peca_venda.getQuantidade()<quant){
            System.out.println("quantidade insuficiente");
        }else{

            System.out.println("Deseja prosseguir com a venda ?");
            System.out.println("Confirmar: 1");
            System.out.println("Cancelar: 2");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao ==1){

                System.out.println("Informe o CPF do vendedor");
                String cpf = scanner.nextLine();

                peca_venda.vender(quant);

                for (Atendente atendente : AtendenteController.atendentes) {
                    if(atendente.getCPF().equals(cpf)){
                        atendente.atualizarComissao(quant*peca_venda.getPreco());
                        atendente.calcularSalario();
                    }
                }

                for (Gerente gerente : GerenteController.gerentes) {
                    if(gerente.getCPF().equals(cpf)){
                        gerente.atualizarBonus(quant * peca_venda.getPreco());
                        gerente.calcularSalario();
                    }
                }
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
