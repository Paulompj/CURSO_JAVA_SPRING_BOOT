package Entidades;

public class Person {
    private String nome;
    private int id;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person() {
    }

    public Person(String nome, int id,double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
    public String AumentaSalario(double x){
        salario = salario + salario*(x/100);
        return "Aumento bem-sucedido!";
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }
}
