package ProjetoFinal.dao;

import ProjetoFinal.entity.Cliente;

import java.util.ArrayList;

public class ClienteDao {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
}
