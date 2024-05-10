import Entidades.ConversorDeMoeda;
import java.util.Locale;
import java.util.Scanner;

public class CasaDeCambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double cotacaoDolar;
        double compra;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a cotação:");
        cotacaoDolar = input.nextDouble();
        System.out.print("Quantos dólares voce deseja comprar: ");
        compra = input.nextDouble();
        System.out.println("Valor a ser pago em reais:"+ ConversorDeMoeda.Conversor(cotacaoDolar,compra));
        input.close();
    }
}
