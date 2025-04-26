package Semana_01;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá Mundo!");
        Scanner leia = new Scanner(System.in);
        int idade;
        System.out.println("Qual sua idade?");
        idade = leia.nextInt();
        System.out.println("Minha idade é " + idade);
    }
}
