package Exercicios.Herança.Exercicios.Exercicios2;

import Exercicios2.Date;

public class ProdutoUsado extends Produto {
    private Date DataDeFabricacao;

    public ProdutoUsado(String nome, Double preco, Date DataDeFabricao) {
        super(nome, preco);
        this.DataDeFabricacao = DataDeFabricao;
    }

    @Override
    public String EtiquetaDePreco(){
        String x ="Nome: " + Nome + "\n" + "Preço: R$"+Preco+"\nData De Fabricação: %s"+DataDeFabricacao;
        return x;
    }

}
