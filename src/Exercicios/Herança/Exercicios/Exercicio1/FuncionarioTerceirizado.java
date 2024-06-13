package Exercicios.Herança.Exercicios.Exercicio1;

public class FuncionarioTerceirizado extends Funcionario {
    protected Double ValorAdicional;

    public FuncionarioTerceirizado(String nome, Integer Horas, Double ValorPorHora, Double ValorAdicional) {
        super(nome, Horas, ValorPorHora);
        this.ValorAdicional = ValorAdicional;
    }
    @Override
    public Double Pagamento(){
        return Horas * ValorPorHora + (ValorAdicional*1.10);
    }
}
