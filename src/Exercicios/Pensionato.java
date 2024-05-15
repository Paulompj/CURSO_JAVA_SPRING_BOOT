package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos quartos voce deseja alugar: ");
        int numPessoas = input.nextInt();
        input.nextLine();
        int quarto;
        Pessoa[] vetor = new Pessoa[10];
        for (int i = 0; i < numPessoas; i += 1){
            String nome;
            int idade;
            System.out.printf("Cadastre a %d° pessoa\n",i+1);
            System.out.print("Digite o nome: ");
            nome = input.nextLine();
            System.out.print("Digite a idade: ");
            idade = input.nextInt();
            input.nextLine();
            System.out.println("Qual quarto voce deseja reservar(1 a 10): ");
            quarto = input.nextInt();
            input.nextLine();
            vetor[quarto] = new Pessoa();
            vetor[quarto].setIdade(idade);
            vetor[quarto].setNome(nome);
        }
        for (int i = 0; i < 9; i += 1){
            if(vetor[i] != null){
                System.out.printf("Quarto %d:\n",i);
                System.out.println(vetor[i].toString());
            }
        }


    }
}
