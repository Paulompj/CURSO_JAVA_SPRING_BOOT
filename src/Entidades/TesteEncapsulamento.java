package Entidades;

public class TesteEncapsulamento {
    // CLASSE DE PRODUTOS//
    private String nome;
    private int codigo;
    private double preco;
    private String Descricao;
    public void init(String nome, int codigo, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    public void init(String nome, int codigo, double preco,String Descricao){
        this.init(nome,codigo,preco);
        this.Descricao = Descricao;
    }
    public void setNome(String nome){//Alterar nome do produto
        this.nome = nome;
    }
    public String getNome(){//Exibir nome do produto
        return nome;
    }
    public void setPreco(double preco){//Alterar preço do produto
        this.preco = preco;
    }
    public double getPreco(){//Exibir preço
        return preco;
    }
    public void setCodigo(int codigo){//Alterar preço do produto
        this.codigo = codigo;
    }
    public int getCodigo(){//Exibir preço
        return codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String toString(){
        return "Ficha do Produto:\n"+
                "Nome: "+nome+"\n"+
                "Codigo: "+codigo+"\n"+
                "Preço: "+preco;
    }
}
