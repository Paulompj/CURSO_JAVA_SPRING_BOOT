package Exercicios2;

import java.time.LocalDateTime;

public class SecondAluno {
    private String nome;
    LocalDateTime DataHora;
    public SecondAluno(String nome, LocalDateTime dataHora){
        this.nome = nome;
        this.DataHora = dataHora;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return DataHora;
    }

    @Override
    public String toString() {
        return "SecondAluno{" +
                "nome='" + nome + '\'' +
                ", DataHora=" + DataHora +
                '}';
    }
}
