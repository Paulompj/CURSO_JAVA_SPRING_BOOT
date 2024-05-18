package Exercicios;
import Exercicios.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testeeeee {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int escolha;
            ArrayList<Exercicios.Pessoa> pessoas = new ArrayList<Exercicios.Pessoa>();
        do{
            System.out.println("Bem vindo a agenda digital: ");
            System.out.println("1 - Exbir contatos\n2 - Criar novo contato\n3 - Excluir contato\n4 - Sair");
            System.out.print("Escolha: ");
            escolha = input.nextInt();
            input.nextLine();

            switch (escolha){
                case 1:
                    if(pessoas.size()== 0){
                        System.out.println("Nenhum contato salvo!");
                    }
                    int cont = 0;
                    for (Exercicios.Pessoa p:pessoas){
                        cont += 1;
                        System.out.printf("\n%d Contato: \n",cont);
                        System.out.println(p.toString());
                        System.out.println();
                    }
                    break;
                case 2:
                    String nome;
                    int idade;
                    System.out.print("Digite o nome do contato: ");
                    nome = input.nextLine();
                    System.out.print("Digite a idade: ");
                    idade = input.nextInt();
                    Pessoa p1 = new Pessoa();
                    p1.setNome(nome);
                    p1.setIdade(idade);
                    input.nextLine();
                    pessoas.add(p1);
                    System.out.println("\nContato adicionado com sucesso!");
                    break;
                case 3:
                    int cont2 = 0;
                    System.out.println("Contatos existentes:  ");
                    for (Exercicios.Pessoa p:pessoas){
                        cont2+=1;
                        System.out.printf("\n%d Contato: \n",cont2);
                        System.out.println(p.toString());
                        System.out.println();
                    }
                    System.out.print("Digite Indice do ctt que deseja excluir: ");
                    int escolha1 = input.nextInt();
                    input.nextLine();
                    pessoas.remove(escolha1-1);
                    break;
            }
        }while (escolha!=4);
        System.out.println("Saindo...");

        input.close();
    }

}
