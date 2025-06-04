package ProjetoFinal.service;

import ProjetoFinal.dao.EnderecoDao;
import ProjetoFinal.entity.Endereco;

public class EnderecoService {
    EnderecoDao enderecoDao;

    public EnderecoService(){
        enderecoDao = new EnderecoDao();
    }

    public void adicionarEndereco(Endereco endereco){
        enderecoDao.adicionarEndereco(endereco);
    }

    public void listarEndereco(){
        enderecoDao.getListaEndereco().forEach(System.out::println);
    }

    public Endereco getEndereco(int indice){
        return  enderecoDao.getEndereco(indice);
    }
}
