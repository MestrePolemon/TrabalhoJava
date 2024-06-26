package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AtendenteController {
    
    private List<Atendente> atendentes = new ArrayList<>();
    
    public boolean adicionarAtendente(String nome, int idade, String CPF, float salario, float comissao){

        try {
            Atendente atendente = new Atendente(nome, idade, CPF, comissao, salario);
            atendentes.add(atendente);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public void listarAtendentes(){
        for (Atendente atendente : atendentes) {
            System.out.println(atendente);
        }
    }

    public Atendente buscarAtendente(String CPF){
        for (Atendente atendente : atendentes) {
            if(atendente.getCPF().equals(CPF)){
                return atendente;
            }
        }
        return null;
    }

    public boolean removerAtendente(String cpf){
        Iterator<Atendente> iterator = atendentes.iterator();
        while (iterator.hasNext()) {
            Atendente atendente = iterator.next();
            if (atendente.getCPF().equals(cpf)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
