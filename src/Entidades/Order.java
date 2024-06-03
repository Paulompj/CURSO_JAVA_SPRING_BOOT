package Entidades;

import Entidades.Enums.OrderStatus;
import Exercicios2.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(){}
    public Order(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    public String toString(){
        return "ID: "+id+"\n"+
                "Data: "+moment+"\n"+
                "Status do Pedido: "+status+"\n";

    }


}
