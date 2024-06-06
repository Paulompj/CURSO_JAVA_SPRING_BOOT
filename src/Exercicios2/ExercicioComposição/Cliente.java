package Exercicios2.ExercicioComposição;

import Exercicios2.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNascimento;
    public Cliente(String nome, String email, Date dataNascimento){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    public String toString(){
        return "Cliente: "+"\n"+
                "Nome: " + nome + "\n" +
                "Email: "+ email + "\n" +
                "Data De Nascimento: " + dataNascimento + "\n";
    }
}
