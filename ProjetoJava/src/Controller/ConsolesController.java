package Controller;

import Model.Atendente;
import Model.Consoles;
import Model.Gerente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsolesController {

    private List<Consoles> listConsole = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ConsolesController() {
        listConsole.add(new Consoles("Playstation 5", 5000, 10, "Sony", 2020, "Console de Mesa", "16GB"));
        listConsole.add(new Consoles("Xbox Series X", 4500, 10, "Microsoft", 2020, "Console de Mesa", "16GB"));
    }

    public boolean adicionarConsole(String nome, float preco, int quantidade, String marca, int ano, String tipo, String memoria) {
        try {
            listConsole.add(new Consoles(nome, preco, quantidade, marca, ano, tipo, memoria));
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
        return true;
    }

    public void listarConsoles() {
        for (Consoles console : listConsole) {
            System.out.println(console);
        }
    }

    public Consoles buscarConsole(int id) {
        for (Consoles console : listConsole) {
            if (console.getId() == id) {
                return console;
            }
        }
        return null;
    }

    public boolean removerConsole(int id) {
        return listConsole.removeIf(console -> console.getId() == id);
    }

    public void venderConsoles(int id, int quant) {


        Consoles console_venda = buscarConsole(id);

        if (console_venda == null) {
            System.out.println("Console não encontrado");
            return;
        }

        if (console_venda.getQuantidade() < quant) {
            System.out.println("quantidade insuficiente");
        } else {

            System.out.println("Deseja prosseguir com a venda ?");
            System.out.println("Confirmar: 1");
            System.out.println("Cancelar: 2");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("Informe o CPF do vendedor");
                String cpf = scanner.nextLine();

                console_venda.vender(quant);

                for (Atendente atendente : AtendenteController.atendentes) {
                    if (atendente.getCPF().equals(cpf)) {
                        atendente.atualizarComissao(quant * console_venda.getPreco());
                        atendente.calcularSalario();
                    }
                }

                for (Gerente gerente : GerenteController.gerentes) {
                    if (gerente.getCPF().equals(cpf)) {
                        gerente.atualizarBonus(quant * console_venda.getPreco());
                        gerente.calcularSalario();
                    }
                }


            } else if (opcao == 2) {
                System.out.println("venda cancelada");
            } else {
                System.out.println("Opção invalida");
                System.out.println("Informe novamente");

                venderConsoles(id, quant);
            }
        }
    }
}
