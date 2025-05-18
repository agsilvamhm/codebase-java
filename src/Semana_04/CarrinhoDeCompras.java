package Semana_04;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Livro> lista;

    public CarrinhoDeCompras(){
        this.lista = new ArrayList<Livro>();
    }

    public double calcularTotal(){
        double total = 0.0;
        for(Livro l: lista){
            total += l.getPreco();
        }
        return total;
    }

    public void adicionarLivro(Livro livro){
        this.lista.add(livro);
    }

    public void imprimirCarrinho(){
        double precototal = 0.0;

        for(Livro l :lista){
            System.out.println(l);
            precototal += l.calcularPrecoTotal();
        }
        System.out.println();
        System.out.println("+------------------------------------+");
        System.out.println("|  Valor total do carrinho R$ " + precototal);

    }
}
