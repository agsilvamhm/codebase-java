package Semana_02;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        double valor1, valor2;
        char operador;
        Calculadora calculadora = new Calculadora();

        Scanner entrada = new Scanner(System.in);
        System.out.println("+---------[ Calculadora ]----------------+");
        System.out.println("Informe o primeiro valor: ");
        valor1 = entrada.nextDouble();
        System.out.println("Informe o Segundo valor: ");
        valor2 = entrada.nextDouble();
        System.out.println("Informe a operação a ser executada (+,-,*,/)");
        operador = entrada.next().charAt(0);

        if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
            System.out.println(calculadora.calcular(valor1, valor2, operador));
        } else {
            System.out.println("Operação inválida!");
        }
    }
}
