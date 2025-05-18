package Semana_04;

public class Ebook extends Livro{
    private int tamanhoEmMb;

    public Ebook(String titulo, String autor, String isbn, double v, double preco, int tamanhoEmMb){
        super(titulo, autor, isbn,preco);
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public int getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    @Override
    public String toString() {
        return "Ebook : {" +
                "Titulo= " + getTitulo() +
                ", Autor= " + getAutor() +
                ", Isbn= " + getIsbn() +
                ", Preço Total R$ " + calcularPrecoTotal() +
                ", Tamanho " + getTamanhoEmMb() +
                '}';
    }
}
