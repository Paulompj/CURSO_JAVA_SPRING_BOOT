import java.util.Locale;
import java.util.Scanner;

public class CasaDaMoeda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double cotacaoDolar;
        double compra;
        System.out.print("Quanto está a cotação do dólar: ");
        cotacaoDolar = input.nextDouble();
        System.out.print("Quantos dólares voce deseja comprar: ");
        compra = input.nextDouble();
        double valorReais = (cotacaoDolar * compra)+ (double) 6 /100 * 200 *3.1;
        System.out.println("Valor em reais a ser pago:"+valorReais);
        input.close();
    }
}
