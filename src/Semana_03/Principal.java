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
                    break;
                case 2:
                    removeTask(tarefas);
                    break;
                case 3:
                    listarTaskDescricao(tarefas);
                    break;
                case 4:
                    listarTaskData(tarefas);
                    break;
                case 5:
                    System.out.println("Aplicação finalizada !");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    input.nextLine();
                    System.out.println();
            }
        }
    }

    private static void newTask(ArrayList<Task> tarefas){
        Scanner input = new Scanner(System.in);
        boolean isExist = false;
        System.out.println("Informe a descrição da tarefa: ");
        String descricao = input.nextLine();
        for(Task tarefa: tarefas){
            if (tarefa.getDescricao().equals(descricao)){
                isExist = true;
                System.out.println("*** Tarefa já existe  ***");
                System.out.println(tarefa);
                System.out.println("*************************");
            }
        }

        if (!isExist) {
            Task tarefa = new Task(descricao);
            tarefas.add(tarefa);
        }
    }

    private static void listarTaskDescricao(ArrayList<Task> tarefas){
        tarefas.sort(Comparator.comparing(Task::getDescricao));
        for (Task task: tarefas){
            System.out.println(task);
        }
    }

    private static void listarTaskData(ArrayList<Task> tarefas){
        tarefas.sort(Comparator.comparing(Task::getDataCriacao));
        for (Task task: tarefas){
            System.out.println(task);
        }
    }

    private static void removeTask(ArrayList<Task> tarefas){
        Scanner input = new Scanner(System.in);
        boolean isExist = false;
        int indice = -1;

        System.out.println("Informe a tarefa a ser excluída: ");
        String descricao = input.nextLine();

        for(Task tarefa: tarefas){
            if (tarefa.getDescricao().equals(descricao)){
                isExist = true;
                indice = tarefas.indexOf(tarefa);
            }
        }

        if (isExist) {
            System.out.println("Deseja realmente excluir a tarefa?");
            char afirmacao = input.next().charAt(0);
            if (afirmacao == 's' || afirmacao == 'S'){
                tarefas.remove(indice);
            }
        } else {
            System.out.println("** Tarefa não localizada! **");
        }
    }

}
