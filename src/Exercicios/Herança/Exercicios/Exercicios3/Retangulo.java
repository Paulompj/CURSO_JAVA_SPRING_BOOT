package Exercicios.Herança.Exercicios.Exercicios3;

public class Retangulo extends Forma{
    private Double base;
    private Double altura;
    public Retangulo(Cor x, Double base, Double altura) {
        super(x);
        this.altura = altura;
        this.base = base;
    }



    @Override
    public Double area() {
        return base*altura;
    }
}
