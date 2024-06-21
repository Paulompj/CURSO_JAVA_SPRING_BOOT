package Exercicios.Excecoes.Try_Catch;

import java.util.Scanner;

public class TesteException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "Paulo";
        int userSenha = 123;
        int i = 1;
        while(i == 1) {
            try {
                i = 0;
                System.out.print("Digite nome de Usuário: ");
                String nomeDigitado = input.nextLine();
                System.out.print("Digite sua senha: ");
                int senhaDigitada = input.nextInt();
                input.nextLine();
                if (senhaDigitada != userSenha || !username.equals(nomeDigitado)) {
                    System.out.println("Usuario ou senha incorretos");
                } else {
                    System.out.println("LOGADO");
                }
            } catch (RuntimeException e) {
                System.out.println("Dados inválidos!");
                i = 1;
                input.nextLine();
            }
        }
        input.close();
    }
}
