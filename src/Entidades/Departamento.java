package Entidades;

public class Departamento {
    private String nome;
    public Departamento(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Departamento = " +nome+"\n";
    }
}
