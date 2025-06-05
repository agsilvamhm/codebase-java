package ProjetoFinal.view;

import ProjetoFinal.entity.Categoria;
import ProjetoFinal.entity.Cliente;
import ProjetoFinal.service.ClienteService;

import java.util.Scanner;

public class FormCliente {
    Scanner input = new Scanner(System.in);

    public void Cadastro(ClienteService service){
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
        if(service.adicionarCliente(cliente)){
            System.out.println("*** Cliente cadastrado com sucesso! ***");
        } else {
            System.out.println("--- Não foi possível cadastrar o cliente! ---");
        }
    }
}
