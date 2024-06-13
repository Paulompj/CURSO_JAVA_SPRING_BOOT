package Exercicios.Herança.Exercicios;

public class Pessoa {
    private String nome;
    private Genero genero;
    private Funcoes funçao;
    public Pessoa(String nome, Genero genero, Funcoes funçao){
        this.funçao = funçao;
        this.nome = nome;
        this.genero= genero;
    }

    public Funcoes getFunçao() {
        return funçao;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa:" + "\n"+
                "Nome = " + nome + "\n"+
                "Genero = " + genero + "\n" +
                "Função = " + funçao + "\n";
    }
}
