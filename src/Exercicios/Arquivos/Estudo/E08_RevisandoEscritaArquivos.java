package Exercicios.Arquivos.Estudo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E08_RevisandoEscritaArquivos {
    public static void main(String[] args) {
        String caminho = "C:/Users/PC/Desktop/paulo.txt";
        String[] vetString = new String[]{"Santificado seja","O teu nome","Venha a nós","O teu reino"};
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))){
            for(String x:vetString){
                bw.write(x);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
