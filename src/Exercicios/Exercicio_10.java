package Exercicios;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeUsuario;
        int idade;
        double salario;
        char sexo;
        System.out.println("Bem-Vindo");
        System.out.print("Digite seu nome: ");
        nomeUsuario = input.nextLine();
        if(nomeUsuario.length()<=3){
            do{
                System.out.println("Nome inválido");
                System.out.println("O nome precisa ser maior do que 3 caracteres:");
                System.out.print("Digite seu nome: ");
                nomeUsuario = input.nextLine();
            }while(nomeUsuario.length()<=3);
        }
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        if(idade > 150 || idade <=0){
            do{
                System.out.println("Idade inválida");
                System.out.println("Sua idade precisa estar entre 0 e 150");
                System.out.print("Digite sua idade: ");
                idade = input.nextInt();
            }while(idade > 150 || idade <=0);
        }
        System.out.print("Digite seu salario: ");
        salario = input.nextDouble();
        if(salario<0){
            do{
                System.out.println("Formato de salario inválido");
                System.out.println("Seu salário nao pode ser menor que zero");
                System.out.print("Digite seu salario: ");
                salario = input.nextDouble();

            }while(salario<0);
        }
        do {
            System.out.print("Digite seu genero (F = Feminino ; M = Masculino: ");
            sexo = input.next().charAt(0);

        } while (sexo != 'F' && sexo != 'M');
}
}
