package Exercicios.Herança.Exercicios.Exercicios2;

public class ProdutoImportado extends Produto {
    private Double TaxaAlfandegaria;
    public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
        super(nome, preco);
        this.TaxaAlfandegaria = taxaAlfandegaria;
    }
    @Override
    public String EtiquetaDePreco(){
        String x = "Nome: "+Nome+"\n"+"Preço: Taxa Alfandegária + Preço do Produto ->  Total = "+totalPreco();
        return x;
    }
    public Double totalPreco(){return Preco + TaxaAlfandegaria;}

}
