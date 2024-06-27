package Exercicios.Arquivos.Estudo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class E03_LendoArqs {
    //Lendo arq com LIST
    public static void main(String[] args) {
        Path arquivo = Paths.get("C:/Users/PC/Desktop/in.txt");
        try {
            List<String> lendoArq = Files.readAllLines(arquivo);
            for(int i = 0; i < lendoArq.size(); i += 1){
                System.out.printf("Linha %d: %s\n",i+1,lendoArq.get(i));
            }
            String vet[] = lendoArq.get(0).split(",");
            System.out.println("LENDO VETOR:");
            System.out.println(vet[0]+"\n"+vet[1]);
        } catch (NoSuchFileException x){
            System.out.println("Arquivo nao encontrado");
        } catch (IOException e) {
            System.err.println("Erro: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
