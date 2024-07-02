package Exercicios.Arquivos.Estudo.CSV.ExFilmes.dados;

import Exercicios.Arquivos.Estudo.CSV.ExLoja.Produto;
import Exercicios.Arquivos.Estudo.CSV.FuncaoGeral.CSV;

public class Teste {
    public static void main(String[] args) {
        /*String caminho = "./HojeProducts.csv";
        CSV.Incializar(caminho);
        Produto p = new Produto("Bola", 15.00, "Futebol");
        Produto y = new Produto("Peteca", 5.00, "Bola de gude");
        CSV.Escrever(caminho, p);
        CSV.Escrever(caminho,y);
        CSV.ler(caminho);*/
        String[] x ="Paulo;si;19".split(";");
        for(String h:x){
            System.out.println(h);
        }
    }
}
