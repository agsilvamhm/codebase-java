package ProjetoFinal.entity;

import java.util.ArrayList;
import java.util.List;

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

    public double getSaldo(){
        return this.saldo;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao){
        if ( movimentacao.getValor() <=0){
            System.out.println("Valor da transação deve ser positivo!");
            return;
        }

        if (movimentacao.getTipo().getOperacao() < 0 && (this.saldo + (movimentacao.getValor() * movimentacao.getTipo().getOperacao()) < 0 )) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        this.movimentacoes.add(movimentacao);
        this.saldo += (movimentacao.getValor() * movimentacao.getTipo().getOperacao());
    }

    public void imprimirMovimentacoes(){
        this.movimentacoes.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cartoes=" + cartoes +
                ", saldo= " + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
