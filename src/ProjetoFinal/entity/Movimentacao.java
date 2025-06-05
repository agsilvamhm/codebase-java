package ProjetoFinal.entity;

public class Movimentacao {
    private TipoMovimentacao tipo;
    private double valor;

    public Movimentacao(TipoMovimentacao tipo, Double valor){
        this.tipo = tipo;
        this.valor = valor;
    }
}
