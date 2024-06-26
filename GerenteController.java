package Model;

import java.util.ArrayList;
import java.util.List;

public class GerenteController {

    private List<Gerente> gerentes = new ArrayList<>();

    public boolean adicionarGerente(String nome, int idade, String cpf, float bonus, float salario) {
        try {
            Gerente gerente = new Gerente(nome, idade, cpf, bonus, salario);
            gerentes.add(gerente);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public void listarGerentes(){
        for (Gerente gerente : gerentes) {
            System.out.println(gerente);
        }
    }

    public Gerente buscarGerente(String cpf){
        for (Gerente gerente : gerentes) {
            if(gerente.getCPF().equals(cpf)){
                return gerente;
            }
        }
        return null;
    }

    boolean removerGerente(String cpf){
        return gerentes.removeIf(gerente -> gerente.getCPF().equals(cpf));
    }
    
}
