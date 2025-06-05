package ProjetoFinal.entity;

public class ContaCorrente extends Conta{
    private int numero;
    private double taxaManutencaoMensal;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.numero = super.getIdConta();
    }

    @Override
    public int getIdConta() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta Corrente{" +
                "Número = " + getIdConta() +
                '}';
    }
}
