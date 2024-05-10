package Exercicios;

import Entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String nome;
        Conta p1;
        int numeroConta,pergunta;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite o numero da conta:");
        numeroConta = input.nextInt();
        System.out.println("Deseja fazer um deposito inicial:");
        System.out.println("1 - sim\n2 - nao");
        System.out.print("Escolha: ");
        pergunta = input.nextInt();
        if(pergunta == 1){
            double depInicial;
            System.out.print("Digite o valor: ");
            depInicial = input.nextDouble();
            p1 = new Conta(nome,numeroConta,depInicial);
        }
        else{
            p1 = new Conta(nome,numeroConta);
        }
        System.out.println(p1);
        System.out.print("Adicione uma quantia:");
        double quantidade;
        quantidade = input.nextDouble();
        p1.adicionar(quantidade);
        System.out.println(p1);
        System.out.print("Saque uma quantia:");
        quantidade = input.nextDouble();
        p1.saque(quantidade);
        System.out.println(p1);


        input.close();
    }
}
