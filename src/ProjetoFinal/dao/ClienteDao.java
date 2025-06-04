package ProjetoFinal.dao;

import ProjetoFinal.entity.Cliente;
import ProjetoFinal.entity.Endereco;

import java.util.ArrayList;
import java.util.HashMap;

public class ClienteDao {
    private HashMap<String, Cliente> mapaClientes = new HashMap<>();

    public void addCliente(Cliente cliente) {
        int id = mapaClientes.size() + 1;
        cliente.setId(id);
        mapaClientes.put(cliente.getCpf(), cliente);
    }

    public HashMap<String, Cliente> getMapaClientes() {
        return mapaClientes;
    }

    public void setEndereco(Cliente cliente, Endereco endereco){
        cliente.setEndereco(endereco);
    }

    public Cliente getCliente(String cpf){
        return mapaClientes.get(cpf);
    }
}