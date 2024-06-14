package Exercicios.Herança.Exercicios.Exercicios2;

import Exercicios2.Date;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aplicação {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos produtos voce deseja cadastrar: ");
        System.out.print("Escolha: ");
        ArrayList<Produto> produtos = new ArrayList<>();
        int escolha = input.nextInt();
        input.nextLine();
        for (int i = 0; i < escolha; i+=1){
            System.out.println("Qual o tipo do produto: ");
            System.out.println("\t1°Comum\n\t2°Importado\n\t3°Usado");
            System.out.print("Escolha: ");
            int tipo = input.nextInt();
            input.nextLine();
            switch (tipo){
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Preço: ");
                    Double preco = input.nextDouble();
                    input.nextLine();
                    produtos.add(new Produto(nome,preco));
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = input.nextLine();
                    System.out.print("Preço: ");
                    preco = input.nextDouble();
                    input.nextLine();
                    System.out.print("Taxa Alfandegária: ");
                    Double Taxa = input.nextDouble();
                    input.nextLine();
                    Produto produtoImportado = new ProdutoImportado(nome,preco,Taxa);
                    produtos.add(produtoImportado);
                    break;
                case 3:
                    System.out.print("Nome: ");
                    nome = input.nextLine();
                    System.out.print("Preço: ");
                    preco = input.nextDouble();
                    input.nextLine();
                    System.out.println("Data de Fabricação: ");
                    String DataDeFabricacao = input.nextLine();
                    Produto produtoUsado = new ProdutoUsado(nome,preco,new Date(DataDeFabricacao));
                    produtos.add(produtoUsado);
                    break;
                default:
                    System.out.println("Escolha Inválida!");
                    break;
            }
        }
        System.out.println("Ficha: ");
        Tags(produtos);
        input.close();
    }
    public static void Tags(ArrayList<Produto> produtos){
        for (int i = 0; i < produtos.size(); i+=1){
            System.out.println(produtos.get(i).EtiquetaDePreco());
            System.out.println();
        }
    }
}
