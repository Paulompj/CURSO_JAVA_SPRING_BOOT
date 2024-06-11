package Exercicios;

public class ContaEmpresa extends Conta {
    private Double Limite;

    public ContaEmpresa(String nome, Integer número, Double balanco,Double Limite) {
        super(nome, número, balanco);
        this.Limite = Limite;
    }

    public Double getLimite() {
        return Limite;
    }

    public void setLimite(Double limite) {
        Limite = limite;
    }

    @Override
    public String toString() {
        return super.toString()+"Limite: "+Limite;
    }
}
