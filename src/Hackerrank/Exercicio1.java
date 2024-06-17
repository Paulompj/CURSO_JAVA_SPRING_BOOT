package Hackerrank;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] vetstring = new String[3];
        Integer[] vetInt = new Integer[3];
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            vetstring[i] = s1;
            Integer x=sc.nextInt();
            sc.nextLine();
            vetInt[i] = x;
        }
        System.out.println("================================");
        for (int i=0;i<3;i++){
            if(vetInt[i] < 100){
                System.out.printf("%-15s%03d%n",vetstring[i],vetInt[i]);
                System.out.println();
            }
            else{
                System.out.printf("%-15s%03d%n",vetstring[i],vetInt[i]);
                System.out.println();
            }
        }

    }
}
