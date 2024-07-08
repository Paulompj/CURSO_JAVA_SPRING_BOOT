package Exercicios.Arquivos.JavaJR.Entidades;

import Exercicios.Arquivos.UdemyExercicio.Entidades.Produto;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class TXT {
    static Scanner input = null;
    public static int pegarNumeroUsuario(){
        String caminho = "./Usuarios";
        int cont = 0;
        if(views.autenticar()){
            File x = new File("./Usuarios");
            File[] n = x.listFiles();
            for(File c:n){
                cont = Integer.parseInt(c.getName().substring(0,1));
            }
        }
        return  cont;
    }
    public static int pegarNumeroPergunta(){
        String caminho = "./formulario.txt";
        int contador = 0;
        try{
            /*String linha = br.readLine().substring(0,2);
            while(linha != null){
                System.out.println(linha);
                linha = br.readLine().substring(0,2);
            }*/
            input = new Scanner(Path.of(caminho));
            while(input.hasNextLine()){
                contador = Integer.parseInt(input.nextLine().substring(0,1).replaceAll(" ",""));
            }
            return contador;
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void cadastrarPergunta(String Pergunta){
        String caminho = "./formulario.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
            int cont = pegarNumeroPergunta()+1;
            bw.write(cont+" - "+Pergunta+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static boolean autenticar(String caminho){
        if(Files.exists(Path.of(caminho))){
            return false;
        }
        else{
            return true;
        }
    }
    public static void lerPegunta(String caminho){
        if(Files.exists(Path.of(caminho))) {
            try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                String linha = br.readLine();
                while(linha != null){
                    System.out.println(linha);
                    linha = br.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            throw new RuntimeException("Arquivo nao existe");
        }
    }
    public static ArrayList<String> armazenarPerguntas(String caminho){
        ArrayList<String> perguntas = new ArrayList<>();
        if(Files.exists(Path.of(caminho))) {
            try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                String linha = br.readLine();
                while (linha != null) {
                    perguntas.add(linha);
                    linha = br.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return perguntas;
    }
    public static void Escrever(String caminho, Usuario user){
        if(autenticar(caminho)){
            try {
                Files.createFile(Path.of(caminho));
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo: "+e.getMessage());
            }
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
            bw.write("Nome: "+user.getNome()+"\n"
            +"Email: "+user.getEmail()+"\n"+
                    "Idade: "+user.getIdade()+"\n"+
                    "Altura: "+user.getAltura()+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
