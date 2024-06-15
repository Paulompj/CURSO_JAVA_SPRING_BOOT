package Exercicios.Herança.Exercicios.Exercicios2;

import Exercicios2.Date;

public class TESTE {
    public static void main(String[] args) {
        Produto x = new ProdutoImportado("Peteca",15.0,5.0);
        System.out.println(x.EtiquetaDePreco());
    }
}
