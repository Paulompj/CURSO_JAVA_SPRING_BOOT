package Entidades.Enums;

public enum Tipo_Pagamento {
    DEBITO(0),CREDITO(1);
    private int codigoPagamento;
    Tipo_Pagamento(int codigoPagamento){
        this.codigoPagamento = codigoPagamento;
    }

    public int getCodigoPagamento() {
        return codigoPagamento;
    }
}
