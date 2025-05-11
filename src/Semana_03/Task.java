package Semana_03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String dataCriacao;
    private String descricao;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Task(String descricao){
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now().format(formatter);
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        return "Data da criação: " + getDataCriacao() + " - Tarefa: " + getDescricao() ;
    }
}
