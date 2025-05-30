package ProjetoFinal.entity;

public class Endereco {
    private String cep;
    private String uf;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int  numero;

    public Endereco(String cep, String uf, String cidade, String bairro, String logradouro, int numero){
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}