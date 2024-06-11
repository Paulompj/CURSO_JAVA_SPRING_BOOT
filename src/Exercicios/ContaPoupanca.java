package Exercicios;

public class ContaPoupanca extends Conta{
    private Double TaxDeJuros;
    public ContaPoupanca(String nome, Integer número, Double balanco, Double taxDeJuros) {
        super(nome, número, balanco);
        this.TaxDeJuros = taxDeJuros;
    }
    public void UptadeBalance(){
        balanco += balanco * TaxDeJuros;
    }
}
