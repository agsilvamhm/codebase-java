package Semana_04;

import java.util.Scanner;

public class Principal {
  //  private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Livro livro1 = new LivroFisico("Mito ou verdade","Flávio Bolsonaro","978-85-94307-00-2",100.00,300,25.30);
        Livro livro2 = new LivroFisico("A História do Brasil para Quem Tem Pressa", "Rodrigo Telles", "978-85-431-0771-3", 39.90, 256, 15.50);
        Livro livro3 = new LivroFisico("O Homem Mais Rico da Babilônia", "George S. Clason", "978-85-9508-153-6", 29.90, 160, 12.00);
        Livro livro4 = new LivroFisico("Pequeno Manual Antirracista", "Djamila Ribeiro", "978-85-5534-146-8", 24.90, 128, 10.00);
        Livro livro5 = new LivroFisico("12 Regras Para a Vida: Um Antídoto Para o Caos", "Jordan B. Peterson", "978-85-422-1219-8", 49.90, 448, 20.00);

        Ebook ebook1 = new Ebook("A História do Brasil para Quem Tem Pressa", "Rodrigo Telles", "978-85-431-0771-3", 39.90, 256, 200);
        Ebook ebook2 = new Ebook("O Homem Mais Rico da Babilônia", "George S. Clason", "978-85-9508-153-6", 29.90, 160, 150);
        Ebook ebook3 = new Ebook("Pequeno Manual Antirracista", "Djamila Ribeiro", "978-85-5534-146-8", 24.90, 128, 180);
        Ebook ebook4 = new Ebook("12 Regras Para a Vida: Um Antídoto Para o Caos", "Jordan B. Peterson", "978-85-422-1219-8", 49.90, 448, 300);
        Ebook ebook5 = new Ebook("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", "978-85-254-3780-7", 59.90, 464, 250);

        carrinho.adicionarLivro(livro1);
        carrinho.adicionarLivro(livro2);
        carrinho.adicionarLivro(livro3);
        carrinho.adicionarLivro(livro4);
        carrinho.adicionarLivro(livro5);
        carrinho.adicionarLivro(ebook1);
        carrinho.adicionarLivro(ebook2);
        carrinho.adicionarLivro(ebook3);
        carrinho.adicionarLivro(ebook4);
        carrinho.adicionarLivro(ebook5);

        carrinho.imprimirCarrinho();

    }
}
