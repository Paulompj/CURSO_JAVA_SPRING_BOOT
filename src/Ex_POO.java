import Entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Ex_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Triangulo x,y;
         x = new Triangulo();
         y = new Triangulo();

        System.out.println("Digite as medidas dos lados do triangulo X:");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Digite as medidas dos lados do triangulo y:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
        double areaX = x.area();
        double areaY = y.area();
        System.out.println("A area do triângulo x é: "+areaX);
        System.out.println("A area do triângulo y é: "+areaY);
        if(areaX>areaY){
            System.out.println("A area do triângulo x é maior");
        }
        else{
            System.out.println("A area do triângulo y é maior");
        }




        input.close();
    }
}
