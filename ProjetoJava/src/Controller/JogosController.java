package Controller;

import Model.Atendente;
import Model.Gerente;
import Model.Jogos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogosController {

    Scanner scanner = new Scanner(System.in);

    private List<Jogos> jogosList = new ArrayList<>();

    public JogosController() {
        jogosList.add(new Jogos("Cyberpunk 2077", 200, 10, "CD Projekt Red", 2020, "RPG", "PC", "Digital"));
        jogosList.add(new Jogos("The Witcher 3", 100, 10, "CD Projekt Red", 2015, "RPG", "PC", "Digital"));
    }

    public boolean adicionarJogo(String nome, float preco, int quantidade, String marca, int ano, String genero, String plataforma, String midia) {
        try {
            jogosList.add(new Jogos(nome, preco, quantidade, marca, ano, genero, plataforma, midia));
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public void listarJogos() {
        for (Jogos jogo : jogosList) {
            System.out.println(jogo);
        }
    }

    public Jogos buscarJogo(int id) {
        for (Jogos jogo : jogosList) {
            if (jogo.getId() == id) {
                return jogo;
            }
        }
        return null;
    }

    public boolean removerJogo(int id) {
        return jogosList.removeIf(jogo -> jogo.getId() == id);
    }

    public void venderJogos(int id, int quant) {

        Jogos jogo_venda = buscarJogo(id);

        if (jogo_venda == null) {
            System.out.println("Jogo não encontrado");
        }

        if (jogo_venda.getQuantidade() < quant) {

            System.out.println("quantidade insuficiente");

        } else {

            System.out.println("Deseja prosseguir com a venda ?");
            System.out.println("Confirmar: 1");
            System.out.println("Cancelar: 2");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                String cpf;

                System.out.println("Informe o CPF do vendedor");
                cpf = scanner.nextLine();


                boolean vendedorEncontrado = false;

                for (Atendente atendente : AtendenteController.atendentes) {
                    if (atendente.getCPF().equals(cpf)) {
                        atendente.atualizarComissao(quant * jogo_venda.getPreco());
                        atendente.calcularSalario();
                        vendedorEncontrado = true;
                    }
                }

                for (Gerente gerente : GerenteController.gerentes) {
                    if (gerente.getCPF().equals(cpf)) {
                        gerente.atualizarBonus(quant * jogo_venda.getPreco());
                        gerente.calcularSalario();
                        vendedorEncontrado = true;
                    }
                }

                if (vendedorEncontrado) {
                    jogo_venda.vender(quant);
                    System.out.println("Vendedor encontrado e salário atualizado.");
                } else {
                    System.out.println("Vendedor não encontrado.");
                }


            } else if (opcao == 2) {

                System.out.println("venda cancelada");

            } else {

                System.out.println("Opção invalida");
                System.out.println("Informe novamente");

                venderJogos(id, quant);

            }
        }
    }

    public void adicionarJogos(int id, int quantidade){
        Jogos jogo = buscarJogo(id);
        jogo.adicionarProduto(quantidade);
    }

    public void removerJogos(int id, int quantidade){
        Jogos jogo = buscarJogo(id);
        jogo.removerProduto(quantidade);
    }
}

