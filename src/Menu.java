import Controllers.ConsolesController;
import Controllers.SistemaGameStop;

import java.util.Scanner;
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

            opcao=scanner.nextInt();
            scanner.nextLine();

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

            }

        }

    }

    void adicionar()
    {
        System.out.println("Escolha o que deseja adicionar: ");
        System.out.println("[1] Peças");
        System.out.println("[2] Consoles");
        System.out.println("[3] Jogo");
        int op = scanner.nextInt();
        scanner.nextLine();

        switch(op)
        {
            case 1:
                sistGame.adicionarPeca(scanner);
                break;
            case 2:
                sistGame.adicionarConsole(scanner);
                break;
            case 3:
                sistGame.adicionarJogo(scanner);
                break;

            default:
                System.out.println("Opcao invalida!");
                break;
        }

    }
    
    void visualizar()
    {
        System.out.println("Escolha o que deseja visualizar: ");
        System.out.println("[1] Peças");
        System.out.println("[2] Consoles");
        System.out.println("[3] Jogos");
        int op = scanner.nextInt();


    }
    

}
