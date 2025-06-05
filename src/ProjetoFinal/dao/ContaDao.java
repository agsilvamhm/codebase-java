package ProjetoFinal.dao;

import ProjetoFinal.entity.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaDao {
    private List<Conta> listaContas;

    public ContaDao(){
        listaContas = new ArrayList<>();
    }

    public void addConta(Conta conta){
        listaContas.add(conta);
    }

    public List<Conta> getListaContas(){
        return listaContas;
    }
}
