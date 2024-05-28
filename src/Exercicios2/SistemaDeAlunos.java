package Exercicios2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SistemaDeAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int escolha0;
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        do{
            System.out.println("\tBem vindo ao Sistema Cadastro de alunos");

            System.out.println("1 - Cadastrar Aluno\n2 - Visualizar Alunos\n3 - Sair");
            System.out.print("Escolha: ");
            escolha0 = input.nextInt();
            input.nextLine();
            int cont = 1;
            switch (escolha0){
                case 1:
                    String nome;
                    int idade;
                    double[] notas = new double[2];
                    System.out.print("Digite o nome: ");
                    nome = input.nextLine();
                    System.out.print("Digite a sua idade: ");
                    idade = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite a 1° nota: ");
                    notas[0] = input.nextDouble();
                    input.nextLine();
                    System.out.print("Digite a 2° nota: ");
                    notas[1] = input.nextDouble();
                    input.nextLine();
                    Alunos.add(new Aluno(nome,idade,notas));
                    LocalDate hora = LocalDate.now();
                    System.out.printf("Aluno %d° cadastrado com sucesso\n",cont);
                    System.out.println(hora);

                    cont +=1;
                    break;
                case 2:
                    if (Alunos.isEmpty() == true){
                        System.out.println("Nenhum aluno cadastrado");
                    }
                    else{
                    for (int indice = 0; indice < Alunos.size(); indice +=1){
                        System.out.printf("\tAluno %d: \n",indice+1);
                        System.out.println(Alunos.get(indice));
                    }
                    }
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while(escolha0 != 3);

        input.close();
    }
}
