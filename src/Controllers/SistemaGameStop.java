package Controllers;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Model.*;

public class SistemaGameStop {

    private ConsolesController contollerConsole = new ConsolesController();
    private PecasController controllerPecas = new PecasController();
    private JogosController controllerJogos = new JogosController();

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

}

