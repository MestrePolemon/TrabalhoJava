
package Model;

import java.util.Scanner;

public class SistemaGameStop {

    private ConsolesController contollerConsole = new ConsolesController();
    private PecasController controllerPecas = new PecasController();
    private JogosController controllerJogos = new JogosController();
    private GerenteController controllerGerente = new GerenteController();
    private AtendenteController controllerAtendente = new AtendenteController();
    private ClienteController controllerCliente = new ClienteController();

    public void adicionarConsole(Scanner scanner)
    {
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o id: ");
        String id = scanner.nextLine();

        System.out.println("Informe o preco: ");
        double preco = scanner.nextDouble();

        System.out.println("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.println("Informe a marca: ");
        String marca = scanner.nextLine();

        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();

        System.out.println("Informe o tipo: ");
        String tipo = scanner.nextLine();

        System.out.println("Informe o modelo: ");
        String modelo = scanner.nextLine();

        System.out.println("Informe a memoria: ");
        String memoria = scanner.nextLine();

        if (!contollerConsole.adicionarConsole(nome, id, preco, quantidade, marca, ano, tipo, modelo, memoria)) {
            System.out.println("Erro ao adicionar");
        } else {
            System.out.println("Console adicionado com sucesso!");
        }

    }
    public void adicionarPeca(Scanner scanner)
    {
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o id: ");
        String id = scanner.nextLine();

        System.out.println("Informe o preco: ");
        double preco = scanner.nextDouble();

        System.out.println("Informe a quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a marca: ");
        String marca = scanner.nextLine();

        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o tipo: ");
        String tipo = scanner.nextLine();

        System.out.println("Informe o modelo: ");
        String modelo = scanner.nextLine();

        if(!controllerPecas.adicionarPeca(nome, id, preco, quantidade, marca, ano, tipo, modelo))
        {
            System.out.println("Erro ao adicionar peca!");
        }else{
            System.out.println("Peca adicionada com sucesso!");
        }

    }

    public void adicionarJogo(Scanner scanner)
    {
        System.out.println("Informe o nome do jogo: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o id: ");
        String id = scanner.nextLine();
        System.out.println("Informe o preco do jogo: ");
        double preco = scanner.nextDouble();
        System.out.println("Informe a quantidade em estoque do jogo: ");
        int quantidade = scanner.nextInt();
        System.out.println("Informe a empresa: ");
        String marca = scanner.nextLine();
        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();
        System.out.println("Informe o genero: ");
        String genero = scanner.nextLine();
        System.out.println("Informe a plataforma: ");
        String plataforma = scanner.nextLine();
        System.out.println("Informe a midia(Digital/Fisica): ");
        String midia = scanner.nextLine();

        if(!controllerJogos.adicionarJogo(nome, id, preco, quantidade, marca, ano, genero, plataforma, midia))
        {
            System.out.println("Erro ao adicionar o jogo!");
        }else{
            System.out.println("Jogo adicionado com sucesso!");
        }


    }

    public void adicionarGerente(Scanner scanner) {
        System.out.println("Informe o nome do gerente: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do gerente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o CPF do gerente: ");
        String cpf = scanner.nextLine();

        System.out.println("Informe o salário do gerente: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Informe o bônus do gerente: ");
        float bonus = scanner.nextFloat();
        scanner.nextLine();

       if(controllerGerente.adicionarGerente(nome, idade, cpf, bonus, salario)){
           System.out.println("Bem vindo a empresa gerente " + nome);
       }else {
           System.out.println("Erro ao adicionar gerente");
       }

    }

    public void adicionarAtendente(Scanner scanner) {
        System.out.println("Informe o nome do atendente: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do atendente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o CPF do atendente: ");
        String cpf = scanner.nextLine();

        System.out.println("Informe o salário do atendente: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Informe a comissão do atendente: ");
        float comissao = scanner.nextFloat();
        scanner.nextLine();

        if(controllerAtendente.adicionarAtendente(nome, idade, cpf, salario, comissao)){
            System.out.println("Bem vindo a empresa atendente " + nome);
        }else{
            System.out.println("Erro ao adicionar atendente");
        }


    }

    public void adicionarCliente(Scanner scanner) {
        System.out.println("Informe o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do cliente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o CPF do cliente: ");
        String cpf = scanner.nextLine();

        System.out.println("Informe a fidelidade do cliente: ");
        int fidelidade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o desconto do cliente: ");
        float desconto = scanner.nextFloat();
        scanner.nextLine();

        if(controllerCliente.adicionarCliente(nome, idade, cpf, fidelidade, desconto)){
            System.out.println("Cliente adicionado com sucesso");
        }else{
            System.out.println("Erro ao adicionar atendente");
        }


    }

    public void visualizarAtendentes(){
        controllerAtendente.listarAtendentes();
    }

    public void visualizarClientes(){
        controllerCliente.listarClientes();
    }

    public void visualizarGerentes(){
        controllerGerente.listarGerentes();
    }

    public void buscarFuncionario(Scanner scanner){
        System.out.println("Informe o CPF do funcionario: ");
        String cpf = scanner.nextLine();

        if(controllerAtendente.buscarAtendente(cpf) != null){
            System.out.println(controllerAtendente.buscarAtendente(cpf));
        }else if(controllerGerente.buscarGerente(cpf) != null){
            System.out.println(controllerGerente.buscarGerente(cpf));
        }else{
            System.out.println("Funcionario não encontrado");
        }
    }

    public void buscarCliente(Scanner scanner){
        System.out.println("Informe o CPF do cliente: ");
        String cpf = scanner.nextLine();

        if(controllerCliente.buscarCliente(cpf) != null){
            System.out.println(controllerCliente.buscarCliente(cpf));
        }else{
            System.out.println("Cliente não encontrado");
        }
    }

    public void visualizarConsoles(){
        contollerConsole.listarConsoles();
    }

    public void visualizarPecas(){
        controllerPecas.listarPecas();
    }

    public void visualizarJogos(){
        controllerJogos.listarJogos();
    }

    public void buscarConsole(Scanner scanner){
        System.out.println("Informe o ID do console: ");
        String id = scanner.nextLine();

        if(contollerConsole.buscarConsole(id) != null){
            System.out.println(contollerConsole.buscarConsole(id));
        }else{
            System.out.println("Console não encontrado");
        }
    }

    public void buscarPeca(Scanner scanner){
        System.out.println("Informe o ID da peça: ");
        String id = scanner.nextLine();

        if(controllerPecas.buscarPeca(id) != null){
            System.out.println(controllerPecas.buscarPeca(id));
        }else{
            System.out.println("Peça não encontrada");
        }
    }

    public void buscarJogo(Scanner scanner){
        System.out.println("Informe o ID do jogo: ");
        String id = scanner.nextLine();

        if(controllerJogos.buscarJogo(id) != null){
            System.out.println(controllerJogos.buscarJogo(id));
        }else{
            System.out.println("Jogo não encontrado");
        }
    }


    public void removerGerente(Scanner scanner) {
        System.out.println("Informe o CPF do gerente a ser removido: ");
        String cpf = scanner.nextLine();

        if (controllerGerente.removerGerente(cpf)) {
            System.out.println("Gerente removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o gerente. Verifique o CPF.");
        }
    }

    public void removerAtendente(Scanner scanner) {
        System.out.println("Informe o CPF do atendente a ser removido: ");
        String cpf = scanner.nextLine();

        if (controllerAtendente.removerAtendente(cpf)) {
            System.out.println("Atendente removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o atendente. Verifique o CPF.");
        }
    }

    public void removerCliente(Scanner scanner) {
        System.out.println("Informe o CPF do cliente a ser removido: ");
        String cpf = scanner.nextLine();

        if (controllerCliente.removerCliente(cpf)) {
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o cliente. Verifique o CPF.");
        }
    }

    public void removerConsole(Scanner scanner) {
        System.out.println("Informe o ID do console a ser removido: ");
        String id = scanner.nextLine();

        if (contollerConsole.removerConsole(id)) {
            System.out.println("Console removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o console. Verifique o ID.");
        }
    }

    public void removerPeca(Scanner scanner) {
        System.out.println("Informe o ID da peça a ser removida: ");
        String id = scanner.nextLine();

        if (controllerPecas.removerPeca(id)) {
            System.out.println("Peça removida com sucesso!");
        } else {
            System.out.println("Não foi possível remover a peça. Verifique o ID.");
        }
    }

    public void removerJogo(Scanner scanner) {
        System.out.println("Informe o ID do jogo a ser removido: ");
        String id = scanner.nextLine();

        if (controllerJogos.removerJogo(id)) {
            System.out.println("Jogo removido com sucesso!");
        } else {
            System.out.println("Não foi possível remover o jogo. Verifique o ID.");
        }
    }
}



