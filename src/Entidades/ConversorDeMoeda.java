package Entidades;

public class ConversorDeMoeda {
    public static double Conversor(double cotacao,double compra){
        return (cotacao*compra) + ((double) 6/100 * compra)*3.10;
    }
}
