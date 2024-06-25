package Exercicios.Excecoes.Try_Catch;

import Exercicios.Excecoes.Exercicio1.Exception.DomainException;

public class PropagacaoException {
    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoException e) {
           e.printStackTrace();
        }
    }
    public static void teste() throws DivisaoException {
        throw new DivisaoException("DIVISAO POR ZERO DETECTADA!");
    }
}
