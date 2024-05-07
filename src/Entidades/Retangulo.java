package Entidades;

public class Retangulo {
    public double altura,largura;
    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return altura*2 + largura*2;
    }

    public double DiagonalRetangulo() {
        return Math.sqrt(Math.pow(altura,2)+Math.pow(largura,2));
    }
    public String toString(){
        return "Ficha:\n" +
                "Altura: "+altura+"\n"
                +"Largura: "+largura+"\n"
                +"Area: "+area()+"\n"
                +"Perímetro: "+perimetro()+"\n"
                +"Diagonal do Retângulo: "+String.format("%.2f",DiagonalRetangulo())+"\n";
    }
}
