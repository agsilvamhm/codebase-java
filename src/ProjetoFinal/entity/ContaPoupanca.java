package ProjetoFinal.entity;

public class ContaPoupanca extends Conta{
    private int numero;
    private double taxaRendimento;


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.numero = super.getIdConta();
    }

    @Override
    public int getIdConta() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta Poupanca{" +
                "Número = " + getIdConta() +
                '}';
    }
}
