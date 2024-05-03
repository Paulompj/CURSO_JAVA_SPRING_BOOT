package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int numeroAlunos=0;
        int a = 0;
        double mediaGeral = 0.0,notas=0.0,somaNotas=0.0;
        System.out.println("Bem vindo ao programa");
        System.out.print("Digite a quantidade de alunos na clase: ");
        numeroAlunos = input.nextInt();
        while(a!=numeroAlunos){
            System.out.printf("Digite a nota do aluno %d: ",a+1);
            notas = input.nextDouble();
            somaNotas+=notas;
            a+=1;
        }
        System.out.printf("A soma das notas é: %.2f\n",somaNotas);
        mediaGeral = somaNotas/numeroAlunos;
        System.out.printf("A media da turma é: %.2f",mediaGeral);

        input.close();
    }
}
