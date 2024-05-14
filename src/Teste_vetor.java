import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Teste_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int tamanhoVetor = input.nextInt();
        double[] vet = new double[tamanhoVetor];
        double soma = 0.0;
        for(int i =0; i < tamanhoVetor; i += 1){
            System.out.printf("Digite a nota %d°: ",i+1);
            vet[i] = input.nextDouble();
            soma+=vet[i];
        }
        System.out.println("Ficha:");
        System.out.println("Notas do aluno:");
        for(int i=0;i<tamanhoVetor;i+=1){
            System.out.printf("Nota %d: %.2f\n",i+1,vet[i]);
        }
        System.out.println("Soma das notas: "+soma);
        System.out.println("Media das notas: "+soma/tamanhoVetor);



        }


    }

