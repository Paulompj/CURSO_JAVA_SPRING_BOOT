package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double peso,altura,imc;
        String nome;
        System.out.println("------Bem vindo a calculadora de IMC------");
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite sua altura em metros (ex:1.60): ");
        altura = input.nextDouble();
        System.out.print("Digite seu peso em kgs (ex:60): ");
        peso = input.nextDouble();
        System.out.println("DADOS CADASTRADOS COM SUCESSO!");
        imc = peso/(altura*altura);
        if(imc<=20.0){
            System.out.printf("Nome: %s\n",nome);
            System.out.printf("Seu imc: %.2f\n",imc);
            System.out.println("Voce está abaixo do peso");
        }
        else if(imc>20.0 && imc<=25.0){
            System.out.printf("Nome: %s\n",nome);
            System.out.printf("Seu imc: %.2f\n",imc);
            System.out.println("Voce está com o peso normal para o seu tamanho");
        }
        else if(imc>25.0 && imc<=30.0){
            System.out.printf("Nome: %s\n",nome);
            System.out.printf("Seu imc: %.2f\n",imc);
            System.out.println("Voce está obeso");
        }

        input.close();
    }
}
