import Entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double aumento;
        Funcionario funcionario = new Funcionario();
        System.out.println("Bem vindo");
        System.out.print("Digite o nome do funcionário:");
        funcionario.nome = input.nextLine();
        System.out.print("Digite o salário bruto do funcionário:");
        funcionario.salarioBruto = input.nextDouble();
        System.out.print("Digite o imposto a ser cobrado:");
        Funcionario.imposto = input.nextDouble();
        System.out.println(funcionario.toString());
        System.out.print("Em quantos % voce deseja aumentar o salário do funcionário: ");
        aumento = input.nextDouble();
        funcionario.AumentarSalario(aumento);
        System.out.println(funcionario.toString());




        input.close();
    }
}
