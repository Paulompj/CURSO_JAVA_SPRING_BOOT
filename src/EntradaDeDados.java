import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        String palavra1;
        String palavra2;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        palavra1 = input.next();
        System.out.print("Digite seu sobrenome: ");
        palavra2 = input.next();
        System.out.printf("Seu nome é : %s %s",palavra1,palavra2);
        input.close();
    }
}
