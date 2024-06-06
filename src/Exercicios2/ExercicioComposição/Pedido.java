package Exercicios2.ExercicioComposição;

import Exercicios2.Date;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private Date momento;
    private StatusPedido status;
    ArrayList<ItemPedido> produtos = new ArrayList<>();
    public Pedido(Cliente cliente, Date momento, StatusPedido status){
        this.cliente = cliente;
        this.momento = momento;
        this.status = status;
    }
    public void addItem(ItemPedido pedido){produtos.add(pedido);}
    public void removeItem(ItemPedido pedido){produtos.remove(pedido);}
    public double total(){
        if (produtos.isEmpty()){return 0;}
        else{
            double total = 0.0;
            for (int i = 0; i < produtos.size(); i += 1){
                total += produtos.get(i).subTotal();
            }
            return total;
        }
    }

    public String toString() {
        return "Pedido: " + "\n"+
                "Cliente = " + cliente + "\n"+
                "Momento = " + momento + "\n"+
                "Status = " + status + "\n"+
                "Produtos = " + produtos;
    }
}
