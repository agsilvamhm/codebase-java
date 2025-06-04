package ProjetoFinal.entity;

import java.util.List;
import java.util.Objects;

public class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private Categoria categoria;
    private List<Conta> contas;

    public Cliente(String cpf, String nome, String dataNascimento, Categoria categoria){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.categoria = categoria;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Id=" + id + '\'' +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", categoria=" + categoria +
                ", endereco=" + endereco +
                ", contas=" + contas +
                '}';
    }
}