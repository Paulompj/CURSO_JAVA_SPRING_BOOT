import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        int valor1,valor2,soma;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1° valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite o 2° valor: ");
        valor2 = input.nextInt();
        soma = valor1+valor2;
        System.out.printf("A soma de %d com %d é: %d",valor1,valor2,soma);
    }
}
