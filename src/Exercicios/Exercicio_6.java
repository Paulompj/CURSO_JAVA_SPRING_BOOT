package Exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolhaMenu,gasolina = 0,diesel = 0,alcool = 0;
        System.out.println("1 - Gasolina");
        System.out.println("2 - Diesel");
        System.out.println("3 - Álcool");
        System.out.println("4 - Sair");
        System.out.print("Escolha: ");
        escolhaMenu = input.nextInt();
        while(escolhaMenu != 4){
            if(escolhaMenu == 1){
                gasolina+=1;
            }
            else if(escolhaMenu == 2){
                diesel+=1;
            }
            else if(escolhaMenu == 3){
                alcool+=1;
            }
            else{
                System.out.println("Digite um valor entre 1 e 4;");
            }
            System.out.println("1 - Gasolina");
            System.out.println("2 - Diesel");
            System.out.println("3 - Álcool");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            escolhaMenu = input.nextInt();
        }
        System.out.println("Ficha de dados:");
        System.out.printf("Gasolina: %dL\n",gasolina);
        System.out.printf("Diesel: %dL\n",diesel);
        System.out.printf("Álcool: %dL",alcool);
        input.close();
    }
}
