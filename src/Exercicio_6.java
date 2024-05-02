import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("CALCULADORA DE AREAS DE CÍRCULOS:");
        double pi = 3.14159;
        double raio;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        raio = input.nextDouble();
        area = pi * Math.pow(raio,2);
        System.out.printf("A area do circulo é: %.4f",area);

    }
}
