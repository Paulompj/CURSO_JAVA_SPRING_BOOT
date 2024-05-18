package Exercicios;

public class ex18 {
    public static void main(String[] args) {
        int a = 1;
        Pessoa p1 = new Pessoa();
        p1.setNome("Paulo");
        System.out.println("Antes da funcao: "+a);
        TrocaNumero(a);
        System.out.println("Depois da função: "+a);
        System.out.println("--------------------------");
        System.out.println("Antes da funcao: "+p1.getNome());
        TrocaNome(p1);
        System.out.println("Depois da função: "+p1.getNome());
    }
    public static void TrocaNumero(int x){
        x = 20;
    }
    public static void TrocaNome(Pessoa a){
        a.setNome("Mario");
    }
}
