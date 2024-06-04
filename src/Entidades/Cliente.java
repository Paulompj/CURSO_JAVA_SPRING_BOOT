package Entidades;

import Entidades.Enums.Tipo_Pagamento;

public class Cliente {
    private String nome;
    Tipo_Pagamento Tipo_Pagamento;
    private int codigoPagamento;
    public Cliente(String nome, Tipo_Pagamento Tipo_Pagamento){
        this.nome = nome;
        this.Tipo_Pagamento = Tipo_Pagamento;
        this.codigoPagamento = Tipo_Pagamento.getCodigoPagamento();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Tipo_Pagamento=" + Tipo_Pagamento +
                ", codigoPagamento=" + codigoPagamento +
                '}';
    }
}
