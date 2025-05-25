package ProjetoFinal.entity;

public abstract class Cartao {
    private double taxaUtilizacao;
    private boolean ativo;
    private boolean bloqueado;
    private String password;
    private double limite;


    public boolean realizarPagamento(){
        return false;
    }

    public boolean mudarSenha(){
        return false;
    }

    private boolean atualizarLimite(){
        return false;
    }

}
