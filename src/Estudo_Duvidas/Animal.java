package Estudo_Duvidas;

public abstract class Animal {
    private String tipo;
    private String som;

    public Animal(String tipo, String som){
        this.tipo = tipo;
        this.som = som;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSom() {
        return som;
    }
}
