package ProjetoFinal.dao;

import ProjetoFinal.entity.Endereco;

import java.util.ArrayList;
import java.util.List;

public class EnderecoDao {
    private List<Endereco> listaEndereco = new ArrayList<>();

    public void adicionarEndereco(Endereco endereco){
        listaEndereco.add(endereco);
    }

    public List<Endereco> getListaEndereco(){
        return listaEndereco;
    }

    public Endereco getEndereco(int indice){
        return listaEndereco.get(indice);
    }
}
