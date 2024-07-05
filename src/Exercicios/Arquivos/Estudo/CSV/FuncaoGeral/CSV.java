package Exercicios.Arquivos.Estudo.CSV.FuncaoGeral;

import Exercicios.Arquivos.UdemyExercicio.Entidades.Produto;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CSV {
    static Scanner input = null;
    private static boolean autenticar(String caminho){
        if(Files.exists(Path.of(caminho))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void Incializar(String caminho){
        if(!autenticar(caminho)){
            try {
                Files.createFile(Path.of(caminho));
            } catch (IOException e) {
                throw new RuntimeException("Erro ao criar o arquivo\ncaminho: "+caminho);
            }
        }
    }
    public static void definirColunas(String caminho, String texto){
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
            throw new RuntimeException(e.getCause());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static void Escrever(String caminho, Produto produto){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, autenticar(caminho)))) {
            input = new Scanner(new File(caminho));
            if(!input.hasNextLine()){
                throw new Exception("Colunas ainda nao definidas");
            }
            bw.write(produto.getNome()+";"+produto.getPreco()+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void ler(String caminho){
        try {
            input = new Scanner(new File(caminho));
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(input != null){
                input.close();
            }
        }

    }
}
