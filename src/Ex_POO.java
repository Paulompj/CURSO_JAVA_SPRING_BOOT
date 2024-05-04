import java.util.Locale;
import java.util.Scanner;

public class Ex_POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double xA,xB,xC,yA,yB,yC,areaX,areaY,px,py;
        System.out.println("Digite as medidas dos lados do triangulo X:");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();
        System.out.println("Digite as medidas dos lados do triangulo y:");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();
        px = (xA+xB+xC)/2;
        py = (yA+yB+yC)/2;
        areaX = Math.sqrt(px*(px-xA)*(px-xB)*(px-xC));
        areaY = Math.sqrt(py*(py-yA)*(py-yB)*(py-yC));
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
