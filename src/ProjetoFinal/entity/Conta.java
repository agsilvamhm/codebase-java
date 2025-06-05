package ProjetoFinal.entity;

import java.util.List;

public abstract class Conta {
    private static int idConta;
    private double saldo;
    private Cliente cliente;
    private List<Cartao> cartoes;

    public Conta(Cliente cliente){
        this.idConta ++;
        this.cliente = cliente;
    }

    public double exibirSaldo(){
        return this.saldo;
    };

    public boolean efetuarPix(){
        return false;
    }

    public int getIdConta(){
        return idConta;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cartoes=" + cartoes +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
