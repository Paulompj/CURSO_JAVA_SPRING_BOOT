package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números voce quer comparar: ");
        int numDigitados = input.nextInt();
        int[] vetNum = new int[numDigitados];
        for(int i = 0; i <numDigitados; i += 1){
            System.out.printf("Digite o %d° número: ",i+1);
            vetNum[i] = input.nextInt();
        }
        int maiorNum = vetNum[0];
        for(int i = 1; i <numDigitados; i += 1){
            if(maiorNum < vetNum[i]){
                maiorNum = vetNum[i];
            }
            else{}
        }
        System.out.println("O maior número é: "+maiorNum);
        input.close();
    }
}
