package Exercicios2;

public class Account {
    private String nome;
    private double Saldo;
    public Account(String nome, double Saldo){
        this.nome = nome;
        if(Saldo > 0.0){
            this.Saldo = Saldo;
        }
        else{
            this.Saldo = 0.0;
        }
    }
    public String getNome(){
        return nome;
    }

    public double getSaldo() {
        return Saldo;
    }
    public void Deposito(double deposito){
        Saldo = getSaldo() + deposito;
        System.out.println("Saldo Atualizado");
    }
    public void Retirada(double retirada){
        if(getSaldo() < retirada){
            System.out.println("Saldo Insulficiente");
        }
        else{
            Saldo = getSaldo() - retirada;
            System.out.println("Saldo Atualizado");
        }
    }



}
