package Semana_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Task> tarefas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 5){
            System.out.println("+------------------[ Tarefas ]--------------------+");
            System.out.println("|    Selecione a opção:                           |");
            System.out.println("( 1 ) - Adicionar uma tarefa:                     |");
            System.out.println("( 2 ) - Remover   uma tarefa:                     |");
            System.out.println("( 3 ) - Listar as tarefas em ordem alfabérica:    |");
            System.out.println("( 4 ) - Listar as tarefas em ordem cronologica:   |");
            System.out.println("( 5 ) - Sair da aplicação:                        |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("| Informe a opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    newTask(tarefas);
                case 2:
                    break;
                case 3:
                    listarTaskDescricao(tarefas);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Aplicação finalizada !");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }
    }

    private static void newTask(ArrayList tarefas){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a descrição da tarefa: ");
        String descricao = input.nextLine();
        Task tarefa = new Task(descricao);
        tarefas.add(tarefa);
    }

    private static void listarTaskDescricao(ArrayList<Task> tarefas){
        tarefas.sort(Comparator.comparing(Task::getDescricao));
        for (Task task: tarefas){
            System.out.println(task);
        }
    }
}
