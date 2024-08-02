package FABIO.TEC1;

import java.util.Scanner;

public class DeAteExercicio {
    public static void main(String[] args) {
        int de = 0;
        int pares = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int ate = input.nextInt();
        while(de < ate){
            if(de % 2 == 0){
                pares+=1;
            }
            de+=1;
        }
        System.out.printf("Entre 0 e %d existem %d numeros pares",ate,pares);
        input.close();
    }
}
