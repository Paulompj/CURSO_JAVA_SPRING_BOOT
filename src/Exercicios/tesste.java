package Exercicios;

import Exercicios2.Algoritmo;

import java.util.Scanner;

public class tesste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();
        /*if(nota <= 0)
            System.out.println("zerou");
        else if(nota <= 5)
                System.out.println("Menor igual a 5");
        else if(nota <= 10)
                    System.out.println("Menor igual a 10");*/
        System.out.println(Algoritmo.tamNum(nota));
        System.out.println("Os algarismos são: ");
        for (int i = Algoritmo.algoritmos.size(); i > 0; i -= 1){
            System.out.println(Algoritmo.algoritmos.get(i-1));
        }



        input.close();



    }
}
