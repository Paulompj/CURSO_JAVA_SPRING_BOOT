package Entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public static double imposto;
    public double SalarioLiquido(){
        return salarioBruto - imposto;
    }
    public void AumentarSalario(double x){
        salarioBruto = salarioBruto +(salarioBruto * x/100);
    }
    public String toString(){
        return "\nFicha do Funcionário:\n"+
                "Nome: "+nome+"\n"+
                "Salario Bruto: "+salarioBruto+"\n"+
                "Salario Líquido: "+SalarioLiquido();

    }
}
