package ProjetoFinal.entity;

public enum Categoria {
    COMUM(1),
    SUPER(2),
    PREMIUM(3);

    private int numeroCategoria;

    Categoria(int numeroCategoria) {
        this.numeroCategoria = numeroCategoria;
    }

    public int getNumeroCategoria(){
        return numeroCategoria;
    }

    public static Categoria fromCategoria(int numero) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.getNumeroCategoria() == numero) {
                return categoria;
            }
        }
        System.out.println("Nenhuma categoria encontrada!");
        return null;
    }
}
