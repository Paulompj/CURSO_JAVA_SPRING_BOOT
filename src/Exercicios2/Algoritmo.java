package Exercicios2;

public class Algoritmo {
    static int numExecucoes = 0;
    public static int tamNum(int numero){
        for(numExecucoes = 0; numero > 10;numExecucoes+=1){
            numero = numero/10;
        }
        numExecucoes+=1;
        return numExecucoes;
    }
}
