package Exercicios.Herança.Exercicios;

import java.util.Arrays;

public class Aluno extends Pessoa{
    private int serie;
    private int[] notas = new int[3];
    public Aluno(String nome, Genero genero, Funcoes funçao, int serie, int[] notas) {
        super(nome, genero, funçao);
        this.serie = serie;
        this.notas = notas;
    }

    public StringBuilder getNotas() {
        StringBuilder x = new StringBuilder();
        for(int i = 0; i <= 3; i+=1){
            x.append(notas[i]+" ");
        }
        return x;
    }

    public int getSerie() {
        return serie;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Notas: " + getNotas()+"\n";
    }
}
