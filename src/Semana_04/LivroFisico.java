package Semana_04;

public class LivroFisico extends Livro{
    private double peso;
    private double frete;

    public LivroFisico(String titulo, String autor, String isbn, double preco, double peso, double frete){
        super(titulo, autor, isbn,preco);
        this.peso = peso;
        this.frete = frete;
    }

    public double getFrete(){
        return this.frete;
    }

    @Override
    public double calcularPrecoTotal(){
        return this.getPreco() + this.getFrete();
    }

    @Override
    public String toString() {
        return "Livro : {" +
                "Titulo= " + getTitulo() +
                ", Autor= " + getAutor() +
                ", Isbn= " + getIsbn() +
                ", Preço Total R$ " + calcularPrecoTotal() +
                ", Frete R$ " + getFrete() +
                '}';
    }
}
