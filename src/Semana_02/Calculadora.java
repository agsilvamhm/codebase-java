package Semana_02;

public class Calculadora {

    public double calcular(double valor1, double valor2, char operacao){
        switch (operacao) {
            case '+':
                return soma(valor1, valor2);
            case '-':
                return subtracao(valor1, valor2);
            case '*':
                return multiplicacao(valor1, valor2);
            case '/':
                return divisao(valor1, valor2);
            default:
                return -1;
        }
    }

    private double soma(double valor1, double valor2){
        return valor1 + valor2;
    }

    private double subtracao(double valor1, double valor2){
        return valor1 - valor2;
    }

    private double multiplicacao(double valor1, double valor2){
        return valor1 * valor2;
    }

    private double divisao(double valor1, double valor2){
        if (valor2 == 0) return 0;
        return valor1 / valor2;
    }
}
