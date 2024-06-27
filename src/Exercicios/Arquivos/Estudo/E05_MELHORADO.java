package Exercicios.Arquivos.Estudo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E05_MELHORADO {
    public static void main(String[] args) {
        //try with resources
        String caminho = "C:/Users/PC/Desktop/paulo.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(caminho))){
            StringBuilder linhas = new StringBuilder();
            /*String linha1 = bf.readLine();
            while (linha1!=null){
                System.out.println(linha1);
                linha1 = bf.readLine();
            }*/
            String linhaTemp = bf.readLine();
            while(linhaTemp != null){
                linhas.append(linhaTemp+"\n");
                linhaTemp = bf.readLine();
            }
            System.out.println(linhas);
        }catch (IOException e){
            System.err.println("Erro: "+e.getMessage());
        }
    }
}
