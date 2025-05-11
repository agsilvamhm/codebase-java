package Semana_03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private LocalDateTime dataCriacao;
    private String descricao;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Task(String descricao){
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataCriacao() {
        return dataCriacao.format(formatter);
    }

    @Override
    public String toString() {
        return "Data da criação: " + getDataCriacao() + " - Tarefa: " + getDescricao() ;
    }
}
