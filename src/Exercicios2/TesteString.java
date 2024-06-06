package Exercicios2;

import java.util.Scanner;

public class TesteString {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a data: ");
    String data = input.nextLine();
    /*int dia = Integer.parseInt(data.substring(0,2));
    int mes = Integer.parseInt(data.substring(3,5));*/
    /*int dia = Integer.parseInt(data.substring(0,2));
    int mes = Integer.parseInt(data.substring(3,5));
    int ano = Integer.parseInt(data.substring(6,10));

    System.out.println(dia);
    System.out.println(mes);
    System.out.println(ano);*/
    Date x = new Date(data);
    System.out.println(x.getDia());

    input.close();

    }

}
