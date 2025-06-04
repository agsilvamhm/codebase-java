package ProjetoFinal.entity;

import java.util.List;

public abstract class Conta {
    private double saldo;
    private Cliente cliente;
    private List<Cartao> cartoes;

    public double exibirSaldo(){
        return this.saldo;
    };

    public boolean efetuarPix(){
        return false;
    }
}
