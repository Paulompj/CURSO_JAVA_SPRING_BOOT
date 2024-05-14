import Entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Teste_vet_class {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de pessoas que deseja cadastrar:");
        int numeroCadastradas = input.nextInt();
        input.nextLine();
        Pessoa[] pessoas = new Pessoa[numeroCadastradas];
        double somaAlturas = 0.0;
        int menos16 = 0;
        for(int i = 0; i < numeroCadastradas;  i+=1){
            String nome;
            int idade;
            double altura;
            pessoas[i] = new Pessoa();
            System.out.printf("%d° Pessoa a ser cadastrada:\n",i+1);
            System.out.print("Digite o nome: ");
            nome = input.nextLine();
            pessoas[i].setNome(nome);
            System.out.print("Digite a idade: ");
            idade = input.nextInt();
            pessoas[i].setIdade(idade);
            System.out.print("Digite a altura: ");
            altura = input.nextDouble();
            pessoas[i].setAltura(altura);
            System.out.printf("%d° cadastrada com sucesso\n",i+1);
            somaAlturas+=pessoas[i].getAltura();
            if(pessoas[i].getIdade()<16){
                menos16+=1;
            }
            else{}
            input.nextLine();
        }
        System.out.println("Dados Gerais:");
        System.out.printf("Media de altura: %.2f\n",somaAlturas/numeroCadastradas);
        System.out.println("Pessoas com menos de 16 anos: "+menos16);
        for(int i = 0; i<numeroCadastradas; i+=1){
            if(pessoas[i].getIdade()<16){
                System.out.printf("Nome: %s\n",pessoas[i].getNome());
            }
            else{}
        }
        input.close();
    }
}
