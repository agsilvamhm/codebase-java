package ProjetoFinal.service;

import ProjetoFinal.dao.ClienteDao;
import ProjetoFinal.entity.Cliente;
import ProjetoFinal.entity.Endereco;

public class ClienteService {
    ClienteDao clienteDao;

    public ClienteService(){
        clienteDao = new ClienteDao();
    }

    public boolean adicionarCliente(Cliente cliente){
        if (validaCPF(cliente.getCpf())){
            if (validaCliente(cliente.getCpf())){
                cliente.setCpf(cliente.getCpf().replaceAll("[^0-9]", ""));
                clienteDao.addCliente(cliente);
                return true;
            }
        } else {
            System.out.println("Não é possível adicionar o cliente, cpf inválido!" + "\n" + cliente.getCpf());
            return false;
        }
        return false;
    }

    private boolean validaCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");
        // CPF deve ter 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }
        // CPFs com todos os dígitos iguais são inválidos
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digito1 = (resto >= 10) ? 0 : resto;
        // Verifica o primeiro dígito verificador
        if ((cpf.charAt(9) - '0') != digito1) {
            return false;
        }
        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digito2 = (resto >= 10) ? 0 : resto;
        // Verifica o segundo dígito verificador
        if ((cpf.charAt(10) - '0') != digito2) {
            return false;
        }
        return true;
   }

   private boolean validaCliente(String cpf){
        if (clienteDao.getMapaClientes().get(cpf) == null){
            return true;
        };
        System.out.println("Já existe este CPF cadastrado!" + "\n" + cpf);
        return false;
   }

    public void imprimirClientes(){
        for(String chave: clienteDao.getMapaClientes().keySet()){
            Cliente cliente = clienteDao.getMapaClientes().get(chave);
            System.out.println(cliente);
        }
    }

    public void setEndereco(Cliente cliente, Endereco endereco){
        clienteDao.setEndereco(cliente, endereco);
    }

    public Cliente getCliente(String cpf){
        return clienteDao.getCliente(cpf);
    }
}
