package Exercicios.Arquivos.Estudo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//Escrita em arquivos
public class E06_EscritaEmArqs {
    public static void main(String[] args) {
        String[] vetString = new String[]{"Pai ", "Nosso", "Que estas", "No céu"};
        String caminho = "C:/Users/PC/Desktop/paulo.txt";
        try (BufferedWriter BW = new BufferedWriter(new FileWriter(caminho))) {
            for(String palavra: vetString){
                BW.write(palavra);
                BW.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
