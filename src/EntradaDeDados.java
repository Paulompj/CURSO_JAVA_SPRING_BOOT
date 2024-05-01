import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        char sexo;
        String palavra1;
        String palavra2;
        int dataNascimento;
        double salario;
        Scanner input = new Scanner(System.in);
        //System.out.print("Digite seu nome: ");
        //palavra1 = input.next();
        //.out.print("Digite seu sobrenome: ");
        //palavra2 = input.next();
        //System.out.print("Digite o ano que voce nasceu: ");
        //dataNascimento = input.nextInt();
        //System.out.print("Digite seu salário: ");
        //salario = input.nextDouble();
        //System.out.printf("Seu nome é : %s %s\n",palavra1,palavra2);
        //System.out.printf("Sua idade: %d anos\n",2024-dataNascimento);
        //System.out.printf("Seu salário: %.2f",salario);
        System.out.print("Digite seu sexo (M = Masculino. F = Feminino): ");
        sexo = input.next().charAt(0);
        System.out.printf("Voce digitou: %c",sexo);


        input.close();
    }
}
