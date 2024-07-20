package Exercicios.Interfaces.AbstrataEInterface.Aplication;

import Exercicios.Interfaces.AbstrataEInterface.Entidades.Forma;
import Exercicios.Interfaces.AbstrataEInterface.Figuras.Circulo;

public class Aplication {
    public static void main(String[] args) {
        Forma figura = new Circulo(4.0);
        System.out.println(figura);
    }
}
