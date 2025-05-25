package ProjetoFinal.view;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void menuPrincipal(){
        int opcao = 0;
        while(opcao !=2){
          desenharMenuPrincipal();
          opcao = input.nextInt();
          switch (opcao){
              case 1:
                  menuCadastro();
                  break;
              case 2:
                  System.out.println("***  Aplicação finalizada!  ***");
                  break;
              default:
                  System.out.println("Operação inválida!");
          }
        }
    }

    private void desenharMenuPrincipal(){
        System.out.println("+-------------------[ Sistema Bancário ]----------------------+");
        System.out.println("|                                                             |");
        System.out.println("|   01 - Cadastro de cliente                                  |");
        System.out.println("|   02 - Sair da aplicação                                    |");
        System.out.println("|                                                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print("| Informe a opção: ");
    }

    private void menuCadastro(){
        input.nextLine();
        System.out.println(" Menu cliente selecionado!");
    }
}