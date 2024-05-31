package Exercicios2;

public class DisplayAccount {
    public static String Exibir(Account x){
        return "Nome: "+ x.getNome()+"\n\t"+
                "Saldo: "+ x.getSaldo();
    }
}
