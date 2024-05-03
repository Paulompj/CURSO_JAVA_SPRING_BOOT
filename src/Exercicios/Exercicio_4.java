package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int senhaCorreta = 2002;
        int senhaDigitada;
        System.out.println("Faça Login:");
        System.out.print("Digite a senha: ");
        senhaDigitada = input.nextInt();
        while(senhaDigitada != senhaCorreta){
            System.out.println("Senha Incorreta!");
            System.out.print("Digite a senha novamente: ");
            senhaDigitada = input.nextInt();
                if(senhaDigitada == senhaCorreta){
                    System.out.println("Senha Correta!");
                    System.out.println("Logando...");

                }
        }

        input.close();
    }
}
