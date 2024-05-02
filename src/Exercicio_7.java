import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numeroFuncionario,horasTrabalhadas;
        double salario,valorPorhora;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu número: ");
        numeroFuncionario = input.nextInt();
        System.out.print("Digite seu numero de horas trabalhadas: ");
        horasTrabalhadas = input.nextInt();
        System.out.print("Digite quanto voce ganha por hora trabalhada: ");
        valorPorhora = input.nextDouble();
        salario = (double) horasTrabalhadas*valorPorhora;
        System.out.printf("Seu número: %d\n",numeroFuncionario);
        System.out.printf("Seu salário: R$%.2f",salario);








    }
}
