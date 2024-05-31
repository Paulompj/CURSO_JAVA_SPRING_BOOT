package Exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class TesteAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account x = new Account("Paulo",50.000);
        Account y = new Account("André",1.000);
        System.out.println("Dados: \n\t" + DisplayAccount.Exibir(x));
        System.out.println("Dados: \n\t" + DisplayAccount.Exibir(y));
        System.out.println("Modificando Saldos: ");
        x.Deposito(12.000);
        y.Deposito(10.000);
        System.out.println("Dados: \n\t" + DisplayAccount.Exibir(x));
        System.out.println("Dados: \n\t" + DisplayAccount.Exibir(y));
        System.out.println("Retirando Saldo: ");
        x.Retirada(12.000);
        y.Retirada(12.000);
        System.out.println("Dados: \n\t" + DisplayAccount.Exibir(x));
        System.out.println("Dados: \n\t" + DisplayAccount.Exibir(y));
        input.close();
    }
}
