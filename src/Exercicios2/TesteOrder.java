package Exercicios2;

import Entidades.Enums.OrderStatus;
import Entidades.Order;

public class TesteOrder {
    public static void main(String[] args) {
        Order pedido = new Order(1,new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(pedido);

    }
}
