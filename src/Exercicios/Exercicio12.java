package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar: ");
        int tamVetor = input.nextInt();
        int[] vet = new int[tamVetor];
        for(int i = 0; i < tamVetor; i+=1){
            System.out.print("Digite o numero: ");
            vet[i] = input.nextInt();
        }
        System.out.println("Pares:");
        int numPares = 0;
        for(int i = 0; i < tamVetor; i+=1){
          if (vet[i]%2==0){
              System.out.println(vet[i]);
              numPares+=1;
          }
          else{}
        }
        System.out.println("Quantidade de números pares: "+numPares);


        input.close();
    }
}
