package Exercicios2;

import java.time.LocalDate;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private Date DataDeNascimento;

    public HeartRates(String nome, String sobrenome, Date DataDeNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.DataDeNascimento=  DataDeNascimento;
    }
    public int getIdade(){
        return LocalDate.now().getYear()-DataDeNascimento.getAno();
    }
    public double frequenciaCardiacaMaxima(){
        return 220-getIdade();
    }
    public String frequenciaCardiacaAlvo(){
        String message = String.format("%f - %f",(double)85/100*frequenciaCardiacaMaxima(),(double)50/100 * frequenciaCardiacaMaxima());
        return message;
    }

    public int getdia() {
        return DataDeNascimento.getDia();
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }
}
