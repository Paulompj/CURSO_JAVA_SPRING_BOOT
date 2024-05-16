package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas voce deseja cadastrar: ");
        int numPessoas = input.nextInt();
        input.nextLine();
        Humano[] vetPessoas = new Humano[numPessoas];
        for(int i = 0; i < numPessoas; i += 1){
            double altura;
            char genero;
            System.out.printf("Cadastre a %d° pessoa: \n",i+1);
            System.out.print("Altura: ");
            altura = input.nextDouble();
            input.nextLine();
            System.out.print("Genero: ");
            genero = input.next().charAt(0);
            input.nextLine();
           vetPessoas[i] = new Humano(altura,genero);
        }
        double maiorAltura = vetPessoas[0].getAltura();
        double menorAltura = vetPessoas[0].getAltura();
        int contHomens = 0;
        int contmulheres = 0;
        for(int i = 1; i < numPessoas; i += 1){
            if(maiorAltura < vetPessoas[i].getAltura()){
                maiorAltura = vetPessoas[i].getAltura();
            }
            else{}
            if(menorAltura > vetPessoas[i].getAltura()){
                menorAltura = vetPessoas[i].getAltura();
            }
            else{}
        }
        for (int i = 0; i < numPessoas; i += 1){
            if(vetPessoas[i].getGenero() == 'M' || vetPessoas[i].getGenero() == 'm'){
                contHomens+=1;
            }
            else{
                contmulheres += 1;
            }
        }
        System.out.printf("Maiot altura: %.2f\n",maiorAltura);
        System.out.printf("Menor altura: %.2f\n",menorAltura);
        System.out.println("Quantidade de mulheres: "+contmulheres);
        System.out.println("Quantidade de homens: "+contHomens);
    }
}
