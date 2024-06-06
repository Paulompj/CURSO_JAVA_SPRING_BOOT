package Entidades;

import Exercicios2.Date;

import java.time.LocalDate;

public class Contrato_Por_Hora {
    private Date data;
    private double valorPorHora;
    private double horasTrabalhadas;
    public Contrato_Por_Hora(Date data, double valorPorHora, double horasTrabalhadas){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getMes(){return data.getMes();}
    public int getDia(){return data.getDia();}
    public int getAno(){return data.getAno();}

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data = " + data +"\n"+
                "Valor/Hora = " + valorPorHora +"\n"+
                "horasTrabalhadas = " + horasTrabalhadas;
    }
}
