package Exercicios.Arquivos.JavaJR.Exception;

import java.io.Serial;

public class IdadeException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public IdadeException(String msg){
        super(msg);
    }
}
