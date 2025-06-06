package ProjetoFinal.entity;

public class Movimentacao {
    private TipoMovimentacao tipo;
    private double valor;

    public Movimentacao(TipoMovimentacao tipo, Double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                " tipo= " + tipo +
                ", valor= " + valor +
                '}';
    }
}
