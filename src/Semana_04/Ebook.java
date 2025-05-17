package Semana_04;

public class Ebook extends Livro{
    private int tamanhoEmMb;

    public Ebook(String titulo, String autor, String isbn, double preco, int tamanhoEmMb){
        super(titulo, autor, isbn,preco);
        this.tamanhoEmMb = tamanhoEmMb;
    }

}
