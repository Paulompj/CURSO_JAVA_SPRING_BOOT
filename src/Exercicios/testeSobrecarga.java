package Exercicios;

import Entidades.TesteEncapsulamento;

public class testeSobrecarga {
    public static void main(String[] args) {
        TesteEncapsulamento produto = new TesteEncapsulamento();
        System.out.println("Antes do init");
        System.out.println(produto.getNome());
        System.out.println(produto.getCodigo());
        System.out.println(produto.getPreco());
        produto.init("Halter",101,169.90);
        System.out.println("Depois do init");
        System.out.println(produto.getNome());
        System.out.println(produto.getCodigo());
        System.out.println(produto.getPreco());
        produto.init("Halter",101,169.90,"Halter de 30kg, com tecnlogia inovadora. Pontencializando seus ganhos musculares");
        System.out.println("Depois do 2 init");
        System.out.println(produto.getNome());
        System.out.println(produto.getCodigo());
        System.out.println(produto.getPreco());
        System.out.println(produto.getDescricao());


    }
}
