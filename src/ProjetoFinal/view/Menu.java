package ProjetoFinal.view;

import ProjetoFinal.entity.Categoria;
import ProjetoFinal.entity.Cliente;
import ProjetoFinal.entity.Endereco;
import ProjetoFinal.service.ClienteService;
import ProjetoFinal.service.EnderecoService;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    ClienteService clienteService = new ClienteService();
    EnderecoService enderecoService = new EnderecoService();

    public void menuPrincipal(){
        int opcao = 0;
        while(opcao !=2){
          desenharMenuPrincipal();
          opcao = input.nextInt();
          switch (opcao){
              case 1:
                  menuCliente();
                  break;
              case 2:
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

    private void desenharMenuPrincipal(){
        System.out.println("+-------------------[ Sistema Bancário ]----------------------+");
        System.out.println("|                                                             |");
        System.out.println("|   01 - Cadastro de cliente                                  |");
        System.out.println("|   02 - Sair da aplicação                                    |");
        System.out.println("|                                                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.print("| Informe a opção: ");
    }

    private void desenharMenuCliente(){
        System.out.println("+---------------[ Menu cliente selecionado ]------------------+");
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

    private void cadastrarCliente(){
        input.nextLine();
        System.out.println();
        System.out.print("Informe o nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Informe o CPF: ");
        String cpf = input.nextLine();
        System.out.print("Informe a data de nascimento: ");
        String dataNascimento = input.nextLine();
        System.out.print("Informe a categoria (1-Comum, 2-Super, 3-Premium): ");
        int identificador = input.nextInt();

        Cliente cliente = new Cliente(cpf,nome,dataNascimento, Categoria.fromCategoria(identificador));
        if(clienteService.adicionarCliente(cliente)){
            System.out.println("*** Cliente cadastrado com sucesso! ***");
        } else {
            System.out.println("--- Não foi possível cadastrar o cliente! ---");
        }
    }

    private void listarClientes(){
        clienteService.imprimirClientes();
    }

    private void cadastrarEndereco(){
        input.nextLine();
        System.out.println();
        System.out.print("Informe o CEP: ");
        String cep = input.nextLine();
        System.out.print("Informe a sigla do estado: ");
        String uf = input.nextLine();
        System.out.print("Informe a cidade: ");
        String cidade = input.nextLine();
        System.out.print("Informe o bairro: ");
        String bairro = input.nextLine();
        System.out.print("Informe o logradouro: ");
        String logradouro = input.nextLine();
        System.out.print("Informe o número: ");
        int numero = input.nextInt();

        Endereco endereco = new Endereco(cep, uf, cidade, bairro, logradouro, numero);
        enderecoService.adicionarEndereco(endereco);
        System.out.println("*** Endereço incluído com sucesso ***");
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
}