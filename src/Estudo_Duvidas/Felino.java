package Estudo_Duvidas;

public class Felino extends Animal{
    public Felino(String tipo, String som){
        super(tipo, som);
    }

    @Override
    public String getSom(){
        return " Cade o som ";
    }
}
