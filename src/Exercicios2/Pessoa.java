package Exercicios2;

public class Pessoa {
    private String nome;
    private int id;
    private double salario;
    public Pessoa(String nome, int id, double salario){
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
    public String aumentaSalario(double aumento){
        salario = salario + salario * (aumento/100);
        return "Aumento realizado com sucesso";
    }
    public String toString(){
        return "Dados "+"\n"+
                "Nome:"+nome+"\n"+
                "Id: "+id+"\n"+
                "Salário: "+salario;

    }

}
