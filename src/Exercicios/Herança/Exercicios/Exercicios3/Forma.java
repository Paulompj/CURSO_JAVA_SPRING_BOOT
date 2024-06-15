package Exercicios.Herança.Exercicios.Exercicios3;

public abstract class Forma {
    private Cor cor;

    public Forma(Cor x){
        this.cor = x;
    }
    public Cor getCor() {
        return cor;
    }

    public abstract Double area();

}
