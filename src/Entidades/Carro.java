package Entidades;

public class Carro {
    private String modelo;
    private String marca;
    private int anoDeLancamento;
    private String Placa;
    public Carro(String modelo,String marca,int anoDeLancamento){
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeLancamento = anoDeLancamento;
        Placa = "Nao informada";
    }
    public Carro(String modelo,String marca,int anoDeLancamento,String Placa){
        this(modelo,marca,anoDeLancamento);
        this.Placa = Placa;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public String toString(){
        return "Ficha do carro:"+"\n"+
                "Modelo: "+modelo+"\n"+
                "Marca: "+marca+"\n"+
                "Ano de lançamento: "+anoDeLancamento+"\n"+
                "Placa: "+Placa;
    }
}
