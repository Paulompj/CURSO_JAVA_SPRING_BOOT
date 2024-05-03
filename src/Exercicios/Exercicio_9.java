package Exercicios;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        String nomeUsuario;
        int senhaUsuario;
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo");
        System.out.println("Cadastre-se abaixo");
        System.out.print("Seu nome completo: ");
        nomeUsuario = input.nextLine();
        System.out.print("Crie uma senha: ");
        senhaUsuario = input.nextInt();



        input.close();
    }
}
