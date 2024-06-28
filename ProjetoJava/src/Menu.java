import java.util.Scanner;


public class Menu {

    public void menuFuncionario() {
        System.out.println("[1] Adicionar");
        System.out.println("[2] Visualizar");
        System.out.println("[3] Buscar");
        System.out.println("[4] Remover");
        System.out.println("[5] Vender");
        System.out.println("[6] voltar");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                adicionar();
                break;
            case 2:
                visualizar();
                break;
            case 3:
                buscar();
                break;
            case 4:
                remover();
                break;
            case 5:
                vender();
                break;
            case 6:
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }

    public void menuCliente(){
        System.out.println("[1] Visualizar");
        System.out.println("[2] Buscar");
        System.out.println("[3] voltar");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                visualizarProdutos();
                break;
            case 2:
                buscarProduto();
                break;
            case 3:
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }

    public SistemaGameStop sistGame = new SistemaGameStop();
    public Scanner scanner = new Scanner(System.in);

    public void inicioMenu() {
        System.out.println("BEM VINDO");

        int opcao = 6;

        while (opcao != 7) {

            System.out.println("[1] Funcionario");
            System.out.println("[2] Cliente");
            System.out.println("[0] Sair");

            System.out.print(" > OPÇÃO: ");
            int op = scanner.nextInt();
            scanner.nextLine();


            switch (op) {
                case 1:
                    menuFuncionario();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 0:
                    opcao = 7;
                    System.out.println("Obrigado por vir, volte sempre!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

    }
    public void adicionar() {
        System.out.println();
        System.out.println("[1] - Nova Pessoa");
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

    public void adicionarPessoa() {
        System.out.println();
        System.out.println("[1] - Novo Gerente");
        System.out.println("[2] - Novo Atendente");
        System.out.println("[3] - Novo Cliente");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
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

    public void adicionarProduto() {
        System.out.println();
        System.out.println("[1] - Novo Console");
        System.out.println("[2] - Novo Peça");
        System.out.println("[3] - Novo Jogo");
        System.out.println("[4] - Adicionar ao Estoque");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

            case 1:
                sistGame.adicionarConsole(scanner);
                break;
            case 2:
                sistGame.adicionarPeca(scanner);
                break;
            case 3:
                sistGame.adicionarJogo(scanner);
                break;
            case 4:
                adicionarEstoque(scanner);
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void adicionarEstoque(Scanner scanner) {
        System.out.println();
        System.out.println("[1] - Adicionar Console");
        System.out.println("[2] - Adicionar Peça");
        System.out.println("[3] - Adicionar Jogo");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

            case 1:
                sistGame.adicionarEstoqueConsole(scanner);
                break;
            case 2:
                sistGame.adicionarEstoquePeca(scanner);
                break;
            case 3:
                sistGame.adicionarEstoqueJogo(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }


    public void visualizar() {

        System.out.println("[1] - Visualizar pessoas");
        System.out.println("[2] - Visualizar produtos");
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

    public void visualizarProdutos() {

        System.out.println("\n");
        System.out.println("[1] - Ver Consoles");
        System.out.println("[2] - Ver Peças");
        System.out.println("[3] - Ver Jogos");
        System.out.println("[0] - Sair");


        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

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

    public void buscar() {
        System.out.println("[1] - Buscar Pessoa");
        System.out.println("[2] - Buscar Produto");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                buscarPessoa();
                break;
            case 2:
                buscarProduto();
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void buscarPessoa() {
        System.out.println("[1] - Buscar funcionario");
        System.out.println("[2] - Buscar cliente");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                sistGame.buscarFuncionario(scanner);
                break;
            case 2:
                sistGame.buscarCliente(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void buscarProduto() {
        System.out.println("[1] - Buscar console");
        System.out.println("[2] - Buscar peça");
        System.out.println("[3] - Buscar jogo");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                sistGame.buscarConsole(scanner);
                break;
            case 2:
                sistGame.buscarPeca(scanner);
                break;
            case 3:
                sistGame.buscarJogo(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void remover() {
        System.out.println("[1] - Remover Pessoa");
        System.out.println("[2] - Remover Produto");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                removerPessoa();
                break;
            case 2:
                removerProduto();
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void removerPessoa() {
        System.out.println("[1] - Remover Gerente");
        System.out.println("[2] - Remover Atendente");
        System.out.println("[3] - Remover Cliente");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                sistGame.removerGerente(scanner);
                break;
            case 2:
                sistGame.removerAtendente(scanner);
                break;
            case 3:
                sistGame.removerCliente(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void removerProduto() {
        System.out.println("[1] - Remover Console");
        System.out.println("[2] - Remover Peça");
        System.out.println("[3] - Remover Jogo");
        System.out.println("[4] - Remover do Estoque");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                sistGame.removerConsole(scanner);
                break;
            case 2:
                sistGame.removerPeca(scanner);
                break;
            case 3:
                sistGame.removerJogo(scanner);
                break;
            case 4:
                removerEstoque(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void removerEstoque(Scanner scanner){
        System.out.println();
        System.out.println("[1] - Remover Console");
        System.out.println("[2] - Remover Peça");
        System.out.println("[3] - Remover Jogo");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

            case 1:
                sistGame.removerEstoqueConsole(scanner);
                break;
            case 2:
                sistGame.removerEstoquePeca(scanner);
                break;
            case 3:
                sistGame.removerEstoqueJogo(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public void vender() {
        System.out.println("[1] - Vender Console");
        System.out.println("[2] - Vender Peça");
        System.out.println("[3] - Vender Jogo");
        System.out.println("[0] - Sair");

        System.out.print(" > OPÇÃO: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                sistGame.venderConsole(scanner);
                break;
            case 2:
                sistGame.venderPeca(scanner);
                break;
            case 3:
                sistGame.venderJogo(scanner);
                break;
            default:
                System.out.println("\n\nSAINDO.....\n\n");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.inicioMenu();
    }

}
