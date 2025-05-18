package Semana_04;

public abstract class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private double preco;

    public Livro(String titulo, String autor, String isbn, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public double calcularPrecoTotal(){
        return getPreco();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
