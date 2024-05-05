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
        x.a = input.nextDouble();
        x.a = input.nextDouble();
        System.out.println("Digite as medidas dos lados do triangulo y:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
        double px = (x.a+x.b+x.c)/2;
        double py = (y.a+y.b+y.c)/2;
        double areaX = Math.sqrt(px*(px-x.a)*(px-x.b)*(px-x.c));
        double areaY = Math.sqrt(py*(py-y.a)*(py-y.b)*(py-y.c));
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
