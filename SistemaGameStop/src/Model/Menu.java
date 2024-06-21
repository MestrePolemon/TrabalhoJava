package Model;
import java.util.Scanner;
import Model.SistemaGameStop;
public class Menu {

    public SistemaGameStop sistGame = new SistemaGameStop();
    public Scanner scanner = new Scanner(System.in);

    public void inicioMenu()
    {
        System.out.println("BEM VINDO");

        int opcao=0;

        while(opcao != 3)
        {
            System.out.println("[1] Adicionar");
            System.out.println("[2] Visualizar");
            System.out.println("[3] Sair");

            opcao = Integer.parseInt(scanner.nextLine());

            switch(opcao)
            {
                case 1:
                    adicionar();
                    break;
                case 2:
                    visualizar();
                    break;
                case 3:
                    System.out.println("Obrigado por vir, volte sempre!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
                default:
                    System.out.println("\n\nSAINDO.....\n\n");

            }

        }

    }

    public void adicionar() {


        System.out.println();
        System.out.println("[1] - Novo Pessoa");
        System.out.println("[2] - Novo Produto");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                adicionarPessoa();
                break;
            case 2:
                adicionarProduto();
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void adicionarPessoa(){

        System.out.println();
        System.out.println("[1] - Novo Gerente");
        System.out.println("[2] - Novo Atendente");
        System.out.println("[3] - Novo Cliente");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao){
            case 1:
                sistGame.adicionarGerente(scanner);
                break;

            case 2:
                sistGame.adicionarAtendente(scanner);
                break;

            case 3:
                sistGame.adicionarCliente(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");

        }

    }

    public void adicionarProduto(){

        System.out.println();
        System.out.println("[1] - Novo Console");
        System.out.println("[2] - Novo Peças");
        System.out.println("[3] - Novo Jogos");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao){

            case 1:
                sistGame.adicionarConsole(Scanner scanner);
                break;
            case 2:
                sistGame.adicionarPecas(Scanner scanner);
                break;
            case 3:
                sistGame.adicionarJogos(Scanner scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }


    public void visualizar(){

        System.out.println("[1] - Visualizar produtos");
        System.out.println("[2] - Visualizar Pessoas");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

            case 1:
                visualizarPessoas();
                break;
            case 2:
                visualizarProdutos();
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }

    }

    public void visualizarPessoas() {

        System.out.println("\n");
        System.out.println("[1] - Ver Atendente");
        System.out.println("[2] - Ver Gerentes");
        System.out.println("[3] - Ver Clientes");
        System.out.println("[0] - Sair");


        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

            case 1:
                sistGame.visualizarAtendentes();
                break;
            case 2:
                sistGame.visualizarGerentes();
                break;
            case 3:
                sistGame.visualizarClientes();
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

        public void visualizarProdutos(){

            System.out.println("\n");
            System.out.println("[1] - Ver Consoles");
            System.out.println("[2] - Ver Peças");
            System.out.println("[3] - Ver Jogos");
            System.out.println("[0] - Sair");


            System.out.print(" > OPÇÃO: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao){

                case 1:
                    sistGame.visualizarConsoles();
                    break;
                case 2:
                    sistGame.visualizarPecas();
                    break;
                case 3:
                    sistGame.visualizarJogos();
                    break;
                default:
                    System.out.println("\n\nSAINDO.....\n\n");
            }

    }



}
