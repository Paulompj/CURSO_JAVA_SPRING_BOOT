package Exercicios.Arquivos.Estudo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class testes {
    public static void main(String[] args) {
        Path caminho = Path.of("C:/Users/PC/Desktop/paulo.txt");
        try {
            List<String> linhas = Files.readAllLines(caminho);
            System.out.println(linhas.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
