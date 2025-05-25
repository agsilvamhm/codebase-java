package ProjetoFinal.entity;

import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private Categoria categoria;
    private List<Conta> contas;
}
