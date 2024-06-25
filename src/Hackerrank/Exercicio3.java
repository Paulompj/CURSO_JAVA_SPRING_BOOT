package Hackerrank;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        try {
            int n = in .nextInt();
            in.close();

            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (RuntimeException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


