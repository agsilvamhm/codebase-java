package ProjetoFinal.service;

import ProjetoFinal.dao.ClienteDao;

public class ClienteService {
    ClienteDao clienteDao;

    public boolean addCliente(){
        if (!validaCPF("cpf")) {
            return false;
        }
        return false;
    }

    private boolean validaCPF(String cpf){
        return false;
    }
}
