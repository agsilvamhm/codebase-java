package ProjetoFinal.entity;

public enum TipoMovimentacao {
    DEPOSITO(1, "Depósito"),
    SAQUE(-1, "Saque"),
    TRANSFERENCIA(-1, "Transferência"),
    PIX(-1, "PIX");

    private final int operacao;
    private final String descricao;

    TipoMovimentacao(int operacao, String descricao){
        this.operacao = operacao;
        this.descricao = descricao;
    }

    public int getOperacao(){
        return operacao;
    }
}
