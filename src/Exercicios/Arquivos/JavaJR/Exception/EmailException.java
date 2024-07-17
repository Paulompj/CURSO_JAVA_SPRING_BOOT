package Exercicios.Arquivos.JavaJR.Exception;

import java.io.Serial;

public class EmailException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public EmailException(String msg){
        super(msg);
    }
}
