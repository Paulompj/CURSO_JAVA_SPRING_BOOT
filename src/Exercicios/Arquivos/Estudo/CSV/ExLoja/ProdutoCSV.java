package Exercicios.Arquivos.Estudo.CSV.ExLoja;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProdutoCSV {
    public static void main(String[] args) {
        Path caminho = Path.of("./Produtos.csv");
        boolean x = false;
            if (!Files.exists(caminho)) {
                try {
                    Files.createFile(caminho);
                    x = true;
                } catch (IOException e) {
                    System.out.println("Erro na criação do arquivo: "+e.getMessage());
                }

            }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./Produtos.csv",x))) {
            Produto p = new Produto("Bola",14.0,"Brinquedo");
            bw.write("Nome;Preço;Tipo\n");
            bw.write(p.getNome()+";"+p.getPreco()+";"+p.getTipo()+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
