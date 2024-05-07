import Entidades.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        int quantidade,escolha;
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao controlador de estoque");
        Product produto;
        produto = new Product();
        System.out.print("Digite o nome do produto:");
        produto.nome = input.nextLine();
        System.out.print("Digite o preço do produto:");
        produto.preco = input.nextDouble();
        System.out.print("Digite a quantidade do produto:");
        produto.quantidade = input.nextInt();
        System.out.println(produto.toString());
        System.out.println("Deseja alguma alteração antes de salvar: ");
        System.out.println("1 - Aumentar numero em estoque\n2 - Diminuir número em estoque\n3 - Finalizar e salvar");
        System.out.print("Escolha: ");
        escolha = input.nextInt();
        switch (escolha){
            case 1:
                System.out.print("Digite a quantidade de"+produto.nome+" que deseja inserir no estoque:");
                quantidade = input.nextInt();
                produto.AdicionarProdutos(quantidade);
                System.out.println(produto);
                break;

            case 2:
                System.out.print("Digite a quantidade de"+produto.nome+" que deseja tirar do estoque:");
                quantidade = input.nextInt();
                produto.RemoverProdutos(quantidade);
                System.out.println(produto);
                break;

            case 3:
                System.out.println("Salvando...");
                break;
            default:
                System.out.println("Opção nao existente");
                break;
        }
        input.close();
    }
}
