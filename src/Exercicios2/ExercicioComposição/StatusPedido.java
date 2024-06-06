package Exercicios2.ExercicioComposição;

public enum StatusPedido {
    PAGAMENTO_PENDENTE(0),PROCESSANDO(1),ENVIADO(2),ENTREGUE(3);
    private int codigoPedido;
    StatusPedido(int i){
        this.codigoPedido = i;
    }
    public int getCodigoPedido(){return codigoPedido;}
}
