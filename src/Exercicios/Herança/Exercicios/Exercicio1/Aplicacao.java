package Exercicios.Herança.Exercicios.Exercicio1;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Paulo",40,22.0);
        System.out.println(funcionario1.Pagamento());
        Funcionario funcTer = new FuncionarioTerceirizado("Paulo",100,15.0,200.0);
        System.out.println(funcTer.Pagamento());
    }
}
