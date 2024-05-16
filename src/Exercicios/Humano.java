package Exercicios;

public class Humano {
    private double altura;
    private char genero;

    public Humano(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }
    public Humano(){}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
