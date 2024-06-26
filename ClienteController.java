package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    public boolean adicionarCliente(String nome, int idade, String cpf, int fidelidade, float desconto) {
        try {
            Cliente cliente = new Cliente(nome, idade, cpf, fidelidade, desconto);
            clientes.add(cliente);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean removerCliente(String cpf) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCPF().equals(cpf)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
