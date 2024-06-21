package Controllers;

import java.util.ArrayList;
import java.util.List;

import Model.Consoles;
public class ConsolesController {

    private List<Consoles> listConsole= new ArrayList<>();

    boolean adicionarConsole(String nome, String id, double preco, int quantidade, String marca, int ano, String tipo, String modelo, String memoria)
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
}
