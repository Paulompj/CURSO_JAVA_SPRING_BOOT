package Exercicios.Arquivos.Estudo.Atalho;

import java.io.File;
import java.nio.file.Files;

public class Teste {
    public static void main(String[] args) {
        File caminho = new File("C:/Users/PC/Desktop");
        File[] pastas = caminho.listFiles(File::isFile);
        for(File x: pastas){
            System.out.println(x);
        }
        System.out.println(pastas.length);
    }
}
