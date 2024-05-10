import Entidades.TesteEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        TesteEncapsulamento produto1 = new TesteEncapsulamento();
        System.out.println(produto1);
        produto1.setNome("Vasco");
        produto1.setCodigo(101001);
        produto1.setPreco(69.90);
        System.out.println("Atualizando produto");
        System.out.println("Nome: "+produto1.getNome());
        System.out.printf("Preço: %.2f\n",produto1.getPreco());
        System.out.println("Codigo: "+produto1.getCodigo());




        input.close();
    }
}
