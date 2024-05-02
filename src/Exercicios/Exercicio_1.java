package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num1 = input.nextInt();
        if (num1<0){
            System.out.println("O número é negativo");
        }
        else {
            System.out.println("O número é positivo");
        }
        input.close();
    }
}
