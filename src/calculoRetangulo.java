import Entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class calculoRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("------Bem vindo a calculadora geométrica------");
        Retangulo retangulo;
        retangulo = new Retangulo();
        System.out.println("Informe a altura e largura do retangulo: ");
        System.out.print("Altura: ");
        retangulo.altura = input.nextDouble();
        System.out.print("Largura: ");
        retangulo.largura = input.nextDouble();
        System.out.println(retangulo);



        input.close();
    }
}
