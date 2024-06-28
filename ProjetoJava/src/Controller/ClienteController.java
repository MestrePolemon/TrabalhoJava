package Controller;

import Model.Cliente;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    public ClienteController() {
        clientes.add(new Cliente("Jorge", 20, "40660434709", true));
        clientes.add(new Cliente("Matheus", 30, "84928653343", false));
    }

    public boolean adicionarCliente(String nome, int idade, String cpf, boolean fidelidade) {
        try {
            Cliente cliente = new Cliente(nome, idade, cpf, fidelidade);
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
