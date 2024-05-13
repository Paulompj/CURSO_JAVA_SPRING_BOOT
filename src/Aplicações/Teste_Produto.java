package Aplicações;

import Entidades.Produto;

public class Teste_Produto {
    public static void main(String[] args) {
        Produto p1,p2;
        p1 = new Produto("Paulo");
        p2 = new Produto("Jesus");
        System.out.println(p1);
        System.out.println(p2);
        p1 = p2;
        System.out.println("Depois da mudança");
        System.out.println(p1);
        System.out.println(p2);
    }
}
