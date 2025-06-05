package ProjetoFinal.service;

import ProjetoFinal.dao.ContaDao;
import ProjetoFinal.entity.Conta;

public class ContaService {
    ContaDao contaDao;

    public ContaService(){
        contaDao = new ContaDao();
    }

    public void addConta(Conta conta){
        contaDao.addConta(conta);
    }

    public void imprimirContas(){
        contaDao.getListaContas().forEach(System.out::println);
    }
}
