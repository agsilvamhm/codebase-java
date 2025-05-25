package ProjetoFinal.entity;

import java.util.List;

public abstract class Conta {
    private List<Cartao> cartoes;

    public double exibirSaldo(){
        return 0.0;
    };

    public boolean efetuarPix(){
        return false;
    }
}
