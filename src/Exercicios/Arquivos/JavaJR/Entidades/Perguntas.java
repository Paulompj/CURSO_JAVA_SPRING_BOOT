package Exercicios.Arquivos.JavaJR.Entidades;

import Exercicios.Arquivos.JavaJR.Exception.IdadeException;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Perguntas {
    static{
        Locale.setDefault(Locale.US);
    }
    static ArrayList<String> perguntas = TXT.armazenarPerguntas("./formulario.txt");
    static Scanner input = new Scanner(System.in);
    public static String cadastronome(){
        System.out.println(perguntas.get(0));
        System.out.print("Resposta: ");
        String x = input.nextLine();
        return x;
    }
    public static String cadastroemail(){
        System.out.println(perguntas.get(1));
        System.out.print("Resposta: ");
        String x = input.nextLine();
        try {
            views.verificarEmail(x);
            views.verificarArroba(x);
        }catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return x;
    }
    public static int cadastroidade(){
        System.out.println(perguntas.get(2));
        System.out.print("Resposta: ");
        int x = input.nextInt();
        try {
            views.verificarIdade(x);
        } catch (IdadeException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        input.nextLine();
        return x;
    }
    public static double cadastroaltura(){
        System.out.println(perguntas.get(3));
        System.out.print("Resposta: ");
        double U = input.nextDouble();
        input.nextLine();
        return U;
    }





}
