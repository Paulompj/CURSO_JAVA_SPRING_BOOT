package Exercicios.Arquivos.Estudo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07_RevisandoComoLer {
    public static void main(String[] args) {
        /* File file = new File("C:/Users/PC/Desktop/paulo.txt");
        Scanner leitor = null;
        try{
            leitor = new Scanner(file);
            while(leitor.hasNextLine()){
                System.out.println(leitor.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/


        //Diretórios
        /*Path diretorio = Path.of("C:/Users/PC/Desktop");
        Path file = Path.of("C:/Users/PC/Desktop/paulo.txt");
        if(Files.isDirectory(diretorio)){
            System.out.println("É um diretório!");
        }
        else{
            System.out.println("Nao é um diretório!");
        }
        if(Files.exists(file)){
            System.out.println("É um arquivo!");
        }
        else{
            System.out.println("Nao é um arquivo!");
        }*/


        //2° Método de Leitura
        /*Path arquivo = Path.of("C:/Users/PC/Desktop/paulo.txt");
        try {
            List<String> linhas = Files.readAllLines(arquivo);
            for(String x: linhas){
                System.out.println(x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        //3° Método de Leitura
        String caminho = "C:/Users/PC/Desktop/paulo.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha = br.readLine();
            while (linha!=null){
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
