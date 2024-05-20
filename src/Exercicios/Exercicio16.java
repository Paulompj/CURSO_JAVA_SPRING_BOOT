package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos alunos voce deseja cadastrar: ");
        int numAlunos = input.nextInt();
        input.nextLine();
        Aluno[] vetAlunos = new Aluno[numAlunos];
        for(int i = 0; i < numAlunos; i += 1){
            String nome;
            double nota1,nota2;
            System.out.printf("Aluno %d°\n",i+1);
            System.out.print("Digite o nome: ");
            nome = input.nextLine();
            System.out.print("Digite a nota 1: ");
            nota1 = input.nextDouble();
            input.nextLine();
            System.out.print("Digite a nota 2: ");
            nota2 = input.nextDouble();
            input.nextLine();
            vetAlunos[i] = new Aluno(nome,nota1,nota2);

        }
        System.out.println("Alunos inseridos:");
        for(int i = 0; i < numAlunos; i += 1){
            System.out.printf("Aluno %d: ",i+1);
            System.out.println("Nome: "+vetAlunos[i].getNome());
            System.out.println("Nota 1: "+vetAlunos[i].getNota1());
            System.out.println("Nota 2: "+vetAlunos[i].getNota2());
        }
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < numAlunos; i += 1){
            if(vetAlunos[i].media() >= 6.0){
                System.out.println(vetAlunos[i].getNome());
            }
        }



        input.close();
    }
}
