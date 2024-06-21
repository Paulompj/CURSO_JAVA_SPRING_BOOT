package Exercicios.Excecoes.Try_Catch;

public class DivisaoException extends Exception{
    public DivisaoException(){
        super("DIVISAO INVALIDA");
    }
    public DivisaoException(String msg){
        super(msg);
    }

}
