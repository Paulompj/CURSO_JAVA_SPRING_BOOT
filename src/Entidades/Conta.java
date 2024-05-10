package Entidades;

public class Conta {
    private String nome;
    private int numeroDeMod = 0;
    private int  numeroConta;
    private double depositoIncial;
    private double saldoConta = 0.00;//Opcional ao criar o objeto
    public Conta(String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
        depositoIncial = 0.0;
        saldoConta+=depositoIncial;
        this.toString();
    }
    public Conta(String nome, int numeroConta, double depositoIncial){
        this(nome,numeroConta);
        this.depositoIncial = depositoIncial;
        saldoConta+=depositoIncial;
        toString();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void adicionar(double quantidade){
        saldoConta = saldoConta - 5.00;
        this.saldoConta+=quantidade;
        System.out.println("Adicionado com sucesso");
        this.toString();
    }
    public void saque(double quantidade){
        this.saldoConta-=quantidade;
        System.out.println("Saque realizado com sucesso!\nSaldo atual: "+saldoConta);
        this.toString();
    }
    public String toString(){
        return "Ficha do Cliente:"+"\n"+
                "Nome: "+nome+"\n"+
                "Numero da conta: "+numeroConta+"\n"+
                "Saldo: "+saldoConta+"\n";
    }

}
