package ProjetoFinal.dao;

import ProjetoFinal.entity.Cliente;

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
}