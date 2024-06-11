package Exercicios2.ExercicioComposição;

import Exercicios2.Date;

public class teste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new Cliente("Paulo","paulompj010@gmail.com",new Date("20/07/2004")),new Date("05/06/2024"),StatusPedido.PAGAMENTO_PENDENTE);
        System.out.println(pedido);
        pedido.addItem(new ItemPedido(new Produto("Bola",20.0),2));
        System.out.println("-------------------------");
        System.out.println(pedido);
    }
}
