package Exercicios2;

public class Fatura {
    private String nome;
    private String Descricao;
    private int quantidade;
    private double preco;
    public Fatura(String nome, String Descricao, int quantidade, double preco){
        this.nome = nome;
        this.Descricao = Descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public double valorFatura(){
        if(quantidade == 0 || preco == 0.0){
            return 0.0;
        }
        else{
        return quantidade*preco;
        }
    }
    public String toString(){
        return "Fatura:\n"+
                "\tNome do Produto: "+ nome +"\n"+
                "\tDescricão: "+Descricao+"\n"+
                "\tQuantidade Comprada: "+quantidade+"\n"+
                "\tPreço/Unid: "+preco+"\n"+
                "\tTotal a Pagar: "+valorFatura();
    }
}
