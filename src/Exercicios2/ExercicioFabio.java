package Exercicios2;

import java.util.Scanner;

public class ExercicioFabio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        if(num<0){
            System.exit(0);
        }
        else{
            if(num>21){
                System.exit(0);
            }
            else{
                int soma = 0;
                for(int i = 1; i < num; i += 1){
                    soma += i;
                }
                System.out.println(soma);
            }
        }

        input.close();
    }
}
