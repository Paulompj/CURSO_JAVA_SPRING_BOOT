package Exercicios.Herança.Exercicios.Exercicios3;

public class Circulo extends Forma {
    private Double raio;
    public Circulo(Cor x, Double raio) {
        super(x);
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * raio*raio;
    }
}
