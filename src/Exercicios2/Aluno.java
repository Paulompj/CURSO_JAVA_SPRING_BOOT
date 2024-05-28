package Exercicios2;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas = new double[2];
    public Aluno(String nome, int idade,double[] notas){
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public double media(){
        return (notas[0] + notas[1])/ notas.length;
    }

    @Override
    public String toString() {
        return "Aluno :" +"\n"+
                "nome=" + nome + "\n"+
                "idade=" + idade+"\n" +
                "notas=" + Arrays.toString(notas)
                ;
    }
}
