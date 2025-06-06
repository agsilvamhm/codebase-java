package ProjetoFinal.view;

import ProjetoFinal.entity.Conta;
import ProjetoFinal.entity.Movimentacao;
import ProjetoFinal.entity.TipoMovimentacao;
import ProjetoFinal.service.ContaService;

import java.util.Scanner;

public class FormMovimentacao {
    Scanner input = new Scanner(System.in);

    public void lancarMovimentacao(ContaService contaService){
        Conta conta;
        Conta conta2;
        double valor;
        Movimentacao movimentacao;
        Movimentacao movimentacao2;

        System.out.println("+-------------[ Lançar movimentações ]---------------+");
        System.out.print(" Informe o número da conta: ");
        int numero = input.nextInt();
        conta = contaService.getConta(numero);
        System.out.println("Escolha a operação : " + "\n" + "01 - Depósito" + "\n" + "02 - Saque" + "\n" + "03 - Transferência" + "\n" + "04 - PIX");
        input.nextLine();
        int opcao = input.nextInt();
        switch (opcao){
            case 1:
                System.out.print(" Informe o valor para o deposito: ");
                valor = input.nextDouble();
                movimentacao = new Movimentacao(TipoMovimentacao.DEPOSITO, valor);
                conta.adicionarMovimentacao(movimentacao);
                break;
            case 2:
                System.out.print(" Informe o valor para o saque: ");
                valor = input.nextDouble();
                movimentacao = new Movimentacao(TipoMovimentacao.SAQUE, valor);
                conta.adicionarMovimentacao(movimentacao);
                break;
            case 3:
                System.out.print(" Informe o valor da transferência: ");
                valor = input.nextDouble();
                System.out.println("Informe a conta a receber: ");
                int conta_2 = input.nextInt();
                conta2 = contaService.getConta(conta_2);
                movimentacao = new Movimentacao(TipoMovimentacao.TRANSFERENCIA, valor);
                conta.adicionarMovimentacao(movimentacao);
                movimentacao2 = new Movimentacao(TipoMovimentacao.R_TRANSFERENCIA, valor);
                conta2.adicionarMovimentacao(movimentacao2);
                break;
            case 4:
                System.out.print(" Informe o valor do PIX: ");
                valor = input.nextDouble();
                System.out.println("Informe a conta a receber: ");
                int conta_3 = input.nextInt();
                conta2 = contaService.getConta(conta_3);
                movimentacao = new Movimentacao(TipoMovimentacao.PIX, valor);
                conta.adicionarMovimentacao(movimentacao);
                movimentacao2 = new Movimentacao(TipoMovimentacao.R_PIX, valor);
                conta2.adicionarMovimentacao(movimentacao2);
                break;
            default:
                System.out.println("Operação inválida!");
        }


    }
}
