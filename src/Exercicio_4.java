public class Exercicio_4 {
    public static void main(String[] args) {
        int a,b;
        double resultado;
        a=5;
        b=2;
        //Inteiro com inteiro o comp acha que o resultado vai ser inteiro
        //Precisa colocar o (double) para informar que quer as casas decimais
        resultado= (double) a/b;
        System.out.println(resultado);
    }
}
