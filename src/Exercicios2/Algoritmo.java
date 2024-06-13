package Exercicios2;

import java.util.ArrayList;

public class Algoritmo {
    static int numExecucoes = 0;
    public static ArrayList<Integer> algoritmos = new ArrayList<>();
    public static int tamNum(int numero){
        for(numExecucoes = 0; numero > 10;numExecucoes+=1){
            algoritmos.add(numero%10);
            numero = numero/10;
        }
        algoritmos.add(numero%10);
        numExecucoes+=1;
        return numExecucoes;
    }

}
