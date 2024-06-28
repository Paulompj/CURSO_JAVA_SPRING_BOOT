package Exercicios.Arquivos.Estudo.Atalho;

import java.io.*;
import java.util.Scanner;

public class Arquivo {
    private static Scanner leitor = null;
    public static void Exibir(File caminho){
        try {
            leitor = new Scanner(caminho);
            while(leitor.hasNextLine()){
                System.out.println(leitor.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(leitor != null){
                leitor.close();
            }
        }
    }
    public static String Escrever(File caminho, String texto){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))){
            bw.write(texto);
            return "Sucesso!";
        } catch (IOException e) {
            System.out.println("Erro");
            throw new RuntimeException(e);
        }
    }
}
