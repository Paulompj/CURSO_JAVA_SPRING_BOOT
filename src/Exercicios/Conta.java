package Exercicios;

public class Conta {
    private String nome;
    private Integer número;
    protected Double balanco;
    public Conta(String nome, Integer número, Double balanco){
        this.nome = nome;
        this.número = número;
        this.balanco = balanco;
    }
    public void Saque(Double Valor){balanco-=Valor;}
    public void Deposito(Double Valor){balanco+=Valor;}

    @Override
    public String toString() {
        return "Conta: " + "\n"+
                "Nome = " + nome + "\n"+
                "Número = " + número + "\n"+
                "Balanço = " + balanco + "\n";
    }
}
