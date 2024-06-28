package Controller;

import Model.Gerente;

import java.util.ArrayList;
import java.util.List;

public class GerenteController {

    public static List<Gerente> gerentes = new ArrayList<>();

    public GerenteController() {
        gerentes.add(new Gerente("Luiz", 20, "65384435755", 10, 10000));
        gerentes.add(new Gerente("Yuji", 30, "14333166926", 20, 20000));
    }

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
            gerente.calcularSalario();
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

    public boolean removerGerente(String cpf){
        return gerentes.removeIf(gerente -> gerente.getCPF().equals(cpf));
    }
    
}
