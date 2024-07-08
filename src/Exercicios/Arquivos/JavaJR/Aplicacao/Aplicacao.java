package Exercicios.Arquivos.JavaJR.Aplicacao;

import Exercicios.Arquivos.JavaJR.Entidades.TXT;
import Exercicios.Arquivos.JavaJR.Entidades.Usuario;
import Exercicios.Arquivos.JavaJR.Entidades.Perguntas;
import Exercicios.Arquivos.JavaJR.Entidades.views;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    static Scanner input = new Scanner(System.in);
    static{
        Locale.setDefault(Locale.US);
    }

    public static void main(String[] args) {
        int escolha = 0;
        int flush = 0;
        int cont = TXT.pegarNumeroUsuario();
        do{
            System.out.println("\t1 - Cadastrar o usuário");
            System.out.println("\t2 - Listar Usuários cadastrados");
            System.out.println("\t3 - Detalhar dados de Usuário");
            System.out.println("\t4 - Cadastrar nova pergunta");
            System.out.println("\t5 - Sair");
            System.out.print("Escolha: ");
            escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:
                    cont+=1;
                    views.cadastrarUsuario(cont);
                    break;
                case 2:
                    views.listarUsuarios();
                    break;
                case 3:
                    views.detalharUsuario();
                    break;
                case 4:
                    System.out.print("Digite a pergunta: ");
                    String pergunta = input.nextLine();
                    TXT.cadastrarPergunta(pergunta);
                    break;
                case 5:
                    break;
            }
        }while(escolha != 5);

    }
}
