package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas você deseja cadastrar: ");
        int numPessoas = input.nextInt();
        input.nextLine();
        Pessoa[] vetPessoas = new Pessoa[numPessoas];
        for(int i = 0; i < numPessoas; i += 1){
            String nome;
            int idade;
            vetPessoas[i] = new Pessoa();
            System.out.printf("Cadastre a %d° Pessoa:\n",i+1);
            System.out.print("Digite o nome:");
            nome = input.nextLine();
            vetPessoas[i].setNome(nome);
            System.out.print("Digite a idade:");
            idade = input.nextInt();
            vetPessoas[i].setIdade(idade);
            input.nextLine();
        }
        int maiorIdade = vetPessoas[0].getIdade();
        Pessoa[] pessoaMaiorIdade = new Pessoa[1];
        for(int i = 1; i < numPessoas; i += 1){
            if(maiorIdade < vetPessoas[i].getIdade()){
                pessoaMaiorIdade[0] = new Pessoa();
                maiorIdade = vetPessoas[i].getIdade();
                pessoaMaiorIdade[0] = vetPessoas[i];
            }
            else{}
        }
        System.out.printf("Maior idade: %s\n",pessoaMaiorIdade[0].getNome());
        System.out.printf("Idade: %d",pessoaMaiorIdade[0].getIdade());

        input.close();
    }
}
