package Exercicios;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberDigiteded;
        do{
            System.out.println("Bem vindo");
            System.out.print("Digite sua nota: ");
            numberDigiteded = input.nextInt();
        }while(numberDigiteded > 10 || numberDigiteded < 0);
        input.close();
    }
}
