package ProjetoFinal.entity;

import java.util.ArrayList;
import java.util.List;

import static ProjetoFinal.entity.TipoMovimentacao.SAQUE;

public abstract class Conta {
    private static int idConta;
    private double saldo;
    private Cliente cliente;
    private List<Movimentacao> movimentacoes;
    private List<Cartao> cartoes;

    public Conta(Cliente cliente){
        this.idConta ++;
        this.cliente = cliente;
        this.saldo = 0;
        this.movimentacoes = new ArrayList<>();
        this.cartoes = new ArrayList<>();
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

    public void adicionarMovimentacao(TipoMovimentacao movimento, double valor){
        if ( valor <=0){
            System.out.println("Valor da transação deve ser positivo!");
            return;
        }

        if (movimento.getOperacao() < 0 && (this.saldo + (valor * movimento.getOperacao()) < 0 )) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        Movimentacao novoMovimentacao = new Movimentacao(movimento, valor);
        this.movimentacoes.add(novoMovimentacao);
        this.saldo += (valor * movimento.getOperacao());
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
