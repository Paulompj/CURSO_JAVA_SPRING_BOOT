package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números voce quer comparar: ");
        int somaVetores = 0;
        int numDigitados = input.nextInt();
        int[] vetNum = new int[numDigitados];
        for(int i = 0; i <numDigitados; i += 1){
            System.out.printf("Digite o %d° número: ",i+1);
            vetNum[i] = input.nextInt();
            somaVetores += vetNum[i];
        }
        System.out.println("Media dos valores: "+somaVetores/numDigitados);
        System.out.println("Números abaixo da média: ");
        for(int i = 0; i <numDigitados; i += 1){
            if(vetNum[i]<(somaVetores / numDigitados)){
                System.out.println(vetNum[i]);
            }
        }


    }
}
