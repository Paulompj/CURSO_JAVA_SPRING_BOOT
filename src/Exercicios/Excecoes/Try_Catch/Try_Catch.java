package Exercicios.Excecoes.Try_Catch;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        try{
        String[] vetString = {"PAULO","Felipe","Neymar"};
        System.out.print("Digite a posição do vetor que voce deseja acessar: ");
        int escolha = input.nextInt();
        input.nextLine();
        System.out.printf("Posição %d do vetor: %s\n",escolha,(vetString[escolha]));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Inexistente");
        }
        catch (InputMismatchException x){
            System.out.println("Formado de entrada INVÁLIDO");
        }
        finally {
            System.out.println("Finalizado");
        }



        input.close();
    }
}
