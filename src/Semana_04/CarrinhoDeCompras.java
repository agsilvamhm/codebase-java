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
}
