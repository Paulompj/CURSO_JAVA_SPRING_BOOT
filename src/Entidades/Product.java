package Entidades;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;
    public double ValorEmEstoque(){
        return quantidade * preco;
    }
    public void AdicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    public void RemoverProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    public String toString(){
        return "------ Ficha------\nNome: "+nome+"\n"
                +"Preço: "+String.format("%.2f",preco)+"\n"
                +"Quantidade no estoque:"+this.quantidade;
    }

}
