package Exercicios.Arquivos.Estudo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class E04_CriandoArq {
    //CRIANDO ARQUIVO
    public static void main(String[] args) {
        Path caminho = Paths.get("C:/Users/PC/Desktop/paulo.txt");
        try {
            String x = "Paysandu maior do norte";
            if(Files.notExists(caminho)){
                Files.createFile(caminho);
            }
            //Files.write(caminho,x.getBytes(StandardCharsets.UTF_8));
            List<String> linhas = Files.readAllLines(caminho);
            for(String a: linhas){
                System.out.println(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
