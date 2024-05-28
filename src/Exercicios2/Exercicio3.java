package Exercicios2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.println("Seu numero tem: "+Algoritmo.tamNum(numero)+" algoritmos");
        int copiaNum = numero;
        ArrayList<Integer> algoritmos = new ArrayList<Integer>();
        int[] vetorDigitos = new int[Algoritmo.tamNum(numero)];
        int cont;
        int numExecu;
        for(cont = 0,numExecu=0; numero>10;cont+=1,numExecu+=1){
            vetorDigitos[cont] = numero%10;
            numero = numero / 10;
        }
        vetorDigitos[numExecu] = numero;
        System.out.println();
        for(cont = 0; cont<=numExecu;cont+=1){
            System.out.printf("O %d° digito de %d é : ",cont+1,copiaNum);
            System.out.println(vetorDigitos[numExecu-cont]);
        }
        input.close();
    }
}
