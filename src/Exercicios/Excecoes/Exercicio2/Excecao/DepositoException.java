package Exercicios.Excecoes.Exercicio2.Excecao;

import java.io.Serial;

public class DepositoException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public DepositoException(String msg){
        super(msg);
    }
}
