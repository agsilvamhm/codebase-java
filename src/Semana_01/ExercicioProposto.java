package Semana_01;

import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
        float valor1, valor2, resultado;
        char operador;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        valor1 = input.nextFloat();
        System.out.println("Informe o segundo número: ");
        valor2 = input.nextFloat();
        System.out.println("Informe a operação a ser executada (+, -, *, /): ");
        operador = input.next().charAt(0);
        switch (operador) {
            case '+':
                resultado = valor1 + valor2;
                resultadoEscolhido("A operação escolhida foi adição ",resultado);
            break;
            case '-':
                resultado = valor1 - valor2;
                resultadoEscolhido("A operação escolhida foi subtração ",resultado);
                break;
            case '*':
                resultado = valor1 * valor2;
                resultadoEscolhido("A operação escolhida foi multiplicação ",resultado);
                break;
            case '/':
                if (valor2 == 0) {
                    System.out.println("Operação inválida!");
                } else {
                    resultado = valor1 / valor2;
                    resultadoEscolhido("A operação escolhida foi divisão ", resultado);
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }

    public static void resultadoEscolhido(String mensagem, float resultado){
        System.out.println(mensagem + " o resultado foi = " + resultado);
    }
}
