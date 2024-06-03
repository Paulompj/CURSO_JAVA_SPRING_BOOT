package Exercicios2;

import java.time.LocalDate;

public class Date {
    private int dia;
    private int mes;
    private int ano;
    public Date(){
        LocalDate x = LocalDate.now();
        this.dia = x.getDayOfMonth();
        this.mes = x.getMonthValue();
        this.ano = x.getYear();
    }
    public Date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString(){
        return String.format("%d/%d/%d",dia,mes,ano);
    }
}
