package Exercicios.Arquivos.Estudo.CSV.ExLoja;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class productCSV {
    static Scanner input = null;
    public static void definirColunas(String caminho, String texto) throws Exception{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, autenticar(caminho)))) {
            input = new Scanner(new File(caminho));
            if(input.hasNextLine()){
                throw new Exception("Colunas ja definidas");
            }
            else{
                String[] vetString = texto.split(";");
                for(int i = 0; i < vetString.length; i+=1){
                    bw.write(vetString[i]+";");
                }
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static boolean autenticar(String caminho){
        if(Files.exists(Path.of(caminho))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void Inicializar(Path e){
        if(!autenticar(String.valueOf(e))){
            try {
                Files.createFile(e);
            } catch (IOException c) {
                throw new RuntimeException("Erro ao criar arquivo: "+c.getMessage());
            }
        }
    }
    public static void Escrever(String caminho, Produto produto){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, autenticar(caminho)))) {
            bw.write(produto.getNome()+";"+produto.getPreco()+";"+produto.getTipo()+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void ler(File file){
        try {
            input = new Scanner(file);
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(input != null){
                input.close();
            }
        }

    }

}
