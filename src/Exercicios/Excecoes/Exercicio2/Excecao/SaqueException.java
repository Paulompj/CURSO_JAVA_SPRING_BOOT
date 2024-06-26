package Exercicios.Excecoes.Exercicio2.Excecao;

import java.io.Serial;

public class SaqueException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;
    public SaqueException(String msg){
        super(msg);
    }
}
