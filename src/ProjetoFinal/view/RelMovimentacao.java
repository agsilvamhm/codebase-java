package ProjetoFinal.view;

import ProjetoFinal.entity.Conta;
import ProjetoFinal.service.ContaService;

import java.util.Scanner;

public class RelMovimentacao {
    Scanner input = new Scanner(System.in);

    public void imprimir(ContaService service){
        System.out.println();
        System.out.println("Informe o número da conta: ");
        int numero = input.nextInt();
        Conta conta = service.getConta(numero);
        conta.imprimirMovimentacoes();
    }
}
