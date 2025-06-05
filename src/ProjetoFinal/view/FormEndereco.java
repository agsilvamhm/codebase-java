package ProjetoFinal.view;

import ProjetoFinal.entity.Endereco;
import ProjetoFinal.service.EnderecoService;

import java.util.Scanner;

public class FormEndereco {
    Scanner input = new Scanner(System.in);

    public void cadastro(EnderecoService service){
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
        service.adicionarEndereco(endereco);
        System.out.println("*** Endereço incluído com sucesso ***");
    }
}
