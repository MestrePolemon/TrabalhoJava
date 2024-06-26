package Model;

import java.util.ArrayList;
import java.util.List;

public class ConsolesController {

    private List<Consoles> listConsole= new ArrayList<>();

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
}
