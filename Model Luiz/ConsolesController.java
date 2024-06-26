

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsolesController {

    private List<Consoles> listConsole= new ArrayList<>();
    Scanner scanner  = new Scanner(System.in);

    public boolean adicionarConsole(String nome, String id, double preco, int quantidade, String marca, int ano, String tipo, String modelo, String memoria)
    {
        try
        {
            listConsole.add(new Consoles(nome,id,preco,quantidade,marca,ano,tipo, modelo, memoria));
        }catch(Exception erro)
        {
            erro.printStackTrace();
            return false;
        }
        return true;
    }

    public void listarConsoles()
    {
        for (Consoles console : listConsole) {
            System.out.println(console);
        }
    }

    public Consoles buscarConsole(String id)
    {
        for (Consoles console : listConsole) {
            if(console.getId().equals(id))
            {
                return console;
            }
        }
        return null;
    }

    boolean removerConsole(String id){
        return listConsole.removeIf(console -> console.getId().equals(id));
    }

    public void venderConsoles(String id, int quant){

        Consoles console_venda = buscarConsole(id);

        if(console_venda.getQuantidade()<quant){
            System.out.println("quantidade insuficiente");
        }else{

            System.out.println("Deseja prosseguir com a venda ?");
            System.out.println("Confirmar: 1");
            System.out.println("Cancelar: 2");
            int opcao = scanner.nextInt();

            if(opcao ==1){
                console_venda.vender(quant);
            }else if(opcao == 2){
                System.out.println("venda cancelada");
            }else{
                System.out.println("Opção invalida");
                System.out.println("Informe novamente");

                venderConsoles(id, quant);
            }
        }
    }
}
