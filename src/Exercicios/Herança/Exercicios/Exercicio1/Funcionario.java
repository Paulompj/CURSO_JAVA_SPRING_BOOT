package Exercicios.Herança.Exercicios.Exercicio1;

public class Funcionario {
    protected String Nome;
    protected Integer Horas;
    protected Double ValorPorHora;
    public Funcionario(String nome, Integer Horas, Double ValorPorHora){
        this.Nome = nome;
        this.Horas = Horas;
        this.ValorPorHora = ValorPorHora;
    }
    public Double Pagamento(){
        return Horas * ValorPorHora;
    }
}
