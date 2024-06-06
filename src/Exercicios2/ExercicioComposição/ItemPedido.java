package Exercicios2.ExercicioComposição;

public class ItemPedido {
    private Produto produto;
    private Integer quantidade;
    private double preco;
    public ItemPedido(Produto produto, Integer quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.getPreco()*quantidade;
    }
    public double subTotal(){return preco;}

    @Override
    public String toString() {
        return "ItemPedido: " + "\n"+
                "Produto = " + produto +"\n"+
                "Quantidade = " + quantidade + "\n"+
                "Preço = " + preco + "\n";
    }
}
