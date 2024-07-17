package Exercicios.Arquivos.UdemyExercicio.aplicacao;

import Exercicios.Arquivos.Estudo.CSV.FuncaoGeral.CSV;
import Exercicios.Arquivos.UdemyExercicio.Entidades.Produto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String caminho = "./arquivoLer.csv";
        String caminhoNovo = "./arquivoFINAL.csv";
        Scanner leitor = null;
        try{
            leitor = new Scanner(new File(caminho));
            int cont = 0;
            leitor.nextLine();
            ArrayList<Produto> produtos = new ArrayList<>();
            while(leitor.hasNextLine()) {
                String[] vetString = leitor.nextLine().split(";");
                Double preco = Double.parseDouble(vetString[1]);
                int quant = Integer.parseInt(vetString[2]);
                produtos.add(new Produto(vetString[0], preco, quant));
            }
            CSV.Incializar(caminhoNovo);
            CSV.definirColunas(caminhoNovo,"Nome;Preco");
            for(int i = 0; i < produtos.size(); i += 1){
                CSV.Escrever(caminhoNovo,produtos.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(leitor != null){
                leitor.close();
            }
        }

    }
}
