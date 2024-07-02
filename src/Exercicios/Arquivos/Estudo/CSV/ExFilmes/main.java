package Exercicios.Arquivos.Estudo.CSV.ExFilmes;

public class main {
    public static void main(String[] args) {
        Filme f1 = new Filme("Transformers", 10, true);

        // Adicionar filme ao arquivo
        FilmeCSV.AdicionarFilme(f1);

        // Ler filmes do arquivo
        FilmeCSV.ListarFilme();
    }
}
