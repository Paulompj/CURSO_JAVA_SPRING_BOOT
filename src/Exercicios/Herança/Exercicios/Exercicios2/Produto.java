package Exercicios.Herança.Exercicios.Exercicios2;

public class Produto {
    protected String Nome;
    protected Double Preco;
    public Produto(String nome, Double preco){
        this.Nome = nome;
        this.Preco = preco;
    }
    public String EtiquetaDePreco(){
        String x = "Nome: "+Nome+"\n"+"Preço: "+Preco;
        return x;
    }
}
