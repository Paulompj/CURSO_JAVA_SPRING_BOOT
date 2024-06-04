package Exercicios2;

import java.util.Scanner;

public class TestePlaneta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o planeta: ");
        String Escolha = input.nextLine().toUpperCase();
        System.out.println(SistemaSolar.Autenticar(Escolha));

        input.close();
    }

}
