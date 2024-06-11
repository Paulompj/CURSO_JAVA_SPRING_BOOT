package Exercicios.Herança.Exercicios;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public String barulho(){return "AU AU AU";};
    public void BalançarRabo(){ };
}
