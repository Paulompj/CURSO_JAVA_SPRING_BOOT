package Exercicios.Arquivos.Estudo.CSV.ExLoja;

import java.io.File;
import java.nio.file.Path;

public class main {
    public static void main(String[] args) {
    productCSV.Inicializar(Path.of("./paulo34Produtos.csv"));
        try {
            productCSV.definirColunas("./paulo34Produtos.csv","Nome;Preco;Tipo");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        Produto ou = new Produto("Bicleta",450.0,"Moda Adulta");
    productCSV.Escrever("./paulo34Produtos.csv",ou);
    productCSV.ler(new File("./paulo34Produtos.csv"));

    }
}
