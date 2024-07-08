package Exercicios.Arquivos.JavaJR.Entidades;

public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private Double altura;
    public Usuario(String nome, String email, int idade, Double altura){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "altura=" + altura +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }
}
