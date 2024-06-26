package Exercicios.Excecoes.Exercicio2;

import Exercicios.Excecoes.Exercicio2.Entidades.Account;
import Exercicios.Excecoes.Exercicio2.Excecao.DepositoException;
import Exercicios.Excecoes.Exercicio2.Excecao.SaqueException;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        try {
            Account x = new Account(7,"Paulo",400.0,200.0);
            x.Saque(600.0);
        } catch (SaqueException e){
            System.err.println("Erro: " + e.getMessage());
        } catch (DepositoException h){
            System.err.println("Erro: "+h.getMessage());
        }

        input.close();
    }
}
