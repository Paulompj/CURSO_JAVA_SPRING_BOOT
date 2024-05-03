package Exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int incremento,escolha,escolha2;
        System.out.println("Bem vindo");
        System.out.println("Esse é um programa que exibi números pares ou ímpares");
        System.out.println("Faça sua escolha abaixo:");
        System.out.println("1 - Ímpares\n2 - Pares");
        System.out.print("Escolha:");
        escolha = input.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Deseja que eu exiba os números ímpares até onde:");
                System.out.print("Escolha: ");
                escolha2 = input.nextInt();
                for(incremento=0;incremento<=escolha2;incremento+=1){
                    if(incremento%2 == 1){
                        System.out.printf("%d\n",incremento);
                    }
                }
                break;
            case 2:
                System.out.println("Deseja que eu exiba os números pares até onde:");
                System.out.print("Escolha: ");
                escolha2 = input.nextInt();
                for(incremento=0;incremento<=escolha2;incremento+=1){
                    if(incremento%2 == 0){
                        System.out.printf("%d\n",incremento);
                    }
                }
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }



        input.close();
    }
}
