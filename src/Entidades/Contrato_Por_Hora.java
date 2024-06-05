package Entidades;

import java.time.LocalDate;

public class Contrato_Por_Hora {
    private LocalDate data;
    private double valorPorHora;
    private double horasTrabalhadas;
    public Contrato_Por_Hora(LocalDate data, double valorPorHora, double horasTrabalhadas){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getMes() {
        return data.getMonthValue();
    }

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data = " + data +"\n"+
                "Valor/Hora = " + valorPorHora +"\n"+
                "horasTrabalhadas = " + horasTrabalhadas;
    }
}
