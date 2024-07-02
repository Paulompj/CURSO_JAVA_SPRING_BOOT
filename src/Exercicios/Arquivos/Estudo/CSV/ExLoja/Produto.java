package Exercicios.Arquivos.Estudo.CSV.ExLoja;

public class Produto {
    private String nome;
    private Double preco;
    private String tipo;
    public Produto(String nome, Double preco, String tipo){
        this.preco = preco;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

}
