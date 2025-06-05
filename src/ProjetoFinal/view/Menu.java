package ProjetoFinal.view;

import ProjetoFinal.entity.*;
import ProjetoFinal.service.ClienteService;
import ProjetoFinal.service.ContaService;
import ProjetoFinal.service.EnderecoService;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    ClienteService clienteService = new ClienteService();
    EnderecoService enderecoService = new EnderecoService();
    ContaService contaService = new ContaService();

    public void menuPrincipal(){
        int opcao = 0;
        while(opcao !=3){
          desenharMenuPrincipal();
          opcao = input.nextInt();
          switch (opcao){
              case 1:
                  menuCliente();
                  break;
              case 2:
                  menuConta();
                  break;
              case 3:
                  System.out.println("***  Aplicação finalizada!  ***");
                  break;
              default:
                  System.out.println("Operação inválida!");
          }
        }
    }

    private void menuCliente(){
        input.nextLine();
        int opcao = 0;
        while(opcao !=6){
            desenharMenuCliente();
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    cadastrarEndereco();
                    break;
                case 4:
                    listarEnderecos();
                    break;
                case 5:
                    incluirEndereco();
                    break;
                case 6:
                    System.out.println("***  Aplicação finalizada!  ***");
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
        }
    }

    private void menuConta(){
        input.nextLine();
        int opcao = 0;
        while(opcao !=3){
            desenharMenuConta();
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    cadastrarConta();
                    break;
                case 2:
                    imprimirContas();
                    break;
                case 3:
                    System.out.println("***  Aplicação finalizada!  ***");
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
        }
    }

    private void desenharMenuPrincipal(){
        System.out.println("+-------------------[ Menu Principal ]-----------------------+");
        System.out.println("|                                                             |");
        System.out.println("|   01 - Cadastro de cliente                                  |");
        System.out.println("|   02 - Cadastro de conta                                    |");
        System.out.println("|   03 - Sair da aplicação                                    |");
        System.out.println("|                                                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print("| Informe a opção: ");
    }

    private void desenharMenuCliente(){
        System.out.println("+------------------[ Menu de cliente  ]-----------------------+");
        System.out.println("|                                                             |");
        System.out.println("|   01 - Criar um cliente                                     |");
        System.out.println("|   02 - Listar clientes cadastrados                          |");
        System.out.println("|   03 - Cadastrar endereço                                   |");
        System.out.println("|   04 - Listar endereços cadastrados                         |");
        System.out.println("|   05 - Incluir endereço no cliente                          |");
        System.out.println("|   06 - Voltar ao menu principal                             |");
        System.out.println("|                                                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print("| Informe a opção: ");
    }

    private void desenharMenuConta(){
        System.out.println("+--------------------[ Menu de conta ]------------------------+");
        System.out.println("|                                                             |");
        System.out.println("|   01 - Criar conta                                          |");
        System.out.println("|   02 - Imprimir contas                                      |");
        System.out.println("|   03 - Voltar ao menu principal                             |");
        System.out.println("|                                                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print("| Informe a opção: ");
    }

    private void cadastrarCliente(){
        FormCliente form = new FormCliente();
        form.Cadastro(clienteService);
    }

    private void listarClientes(){
        clienteService.imprimirClientes();
    }

    private void cadastrarEndereco(){
        FormEndereco form = new FormEndereco();
        form.cadastro(enderecoService);
    }

    private void cadastrarConta(){
        input.nextLine();
        Conta conta;
        System.out.println();
        System.out.print("Informe o tipo da conta (1 - Conta corrente, 2 - Conta poupança): ");
        int tipo = input.nextInt();
        input.nextLine();
        System.out.print("Informe o CPF do cliente: ");
        String cpf = input.nextLine();

        if (tipo == 1) {
            conta = new ContaCorrente(clienteService.getCliente(cpf));
        } else {
            conta = new ContaPoupanca(clienteService.getCliente(cpf));
        }
        contaService.addConta(conta);
        clienteService.addConta(conta, conta.getCliente());
    }


    private void listarEnderecos(){
        enderecoService.listarEndereco();
    }

    private void incluirEndereco(){
        input.nextLine();
        clienteService.imprimirClientes();
        enderecoService.listarEndereco();
        System.out.print("Informe o CPF do cliente: ");
        String cpf = input.nextLine();
        System.out.print("Informe o id do endereço: ");
        int endereco = input.nextInt();

        clienteService.setEndereco(clienteService.getCliente(cpf), enderecoService.getEndereco(endereco));
    }

    private void imprimirContas(){
        contaService.imprimirContas();
    }
}