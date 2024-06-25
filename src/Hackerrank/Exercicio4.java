package Hackerrank;

import java.util.Scanner;

public class Exercicio4 {
    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static boolean flag = false;
    static{
        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
        else{
            flag = true;
        }

}//end of class
   public static void main(String[] args){
       if(flag){
           int area=B*H;
           System.out.print(area);
       }

   }//end of main






}
