package Exercicios.Herança.Exercicios;

public class Herança {
    public static void main(String[] args) {
        int[] notas = {3,4,5,6};
        Aluno aluno1 = new Aluno("Paulo",Genero.MASCULINO,Funcoes.ALUNO,3,notas);
        System.out.println(aluno1);

    }
}
