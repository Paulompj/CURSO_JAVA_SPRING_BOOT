package Exercicios.Excecoes.Exercicio2.Entidades;

import Exercicios.Excecoes.Exercicio2.Excecao.DepositoException;
import Exercicios.Excecoes.Exercicio2.Excecao.SaqueException;

public class Account {

    protected Integer numero;
    protected String nome;
    protected Double saldo;
    protected Double limiteSaque;
    public Account(Integer numero, String nome, Double saldo, Double LimiteSaque){
        this.limiteSaque = LimiteSaque;
        this.nome = nome;
        this.saldo = saldo;
        this.numero= numero;
    }
    public String Deposito(Double Valor) throws DepositoException{
        if(Valor <= 0){
            throw new DepositoException("Erro! Depósito inválido");
        }
        else{
            saldo+=Valor;
            return "Operação Realizada com Sucesso!";
        }
    }
    public String Saque(Double Valor) throws SaqueException {
        if(saldo == 0){
            throw new SaqueException("Erro! Seu saldo é R$0,00");
        }
        if(Valor > limiteSaque){
            throw new SaqueException("Erro! Tentativa de saque acima do limite estabelecido");
        }
        else{
            saldo+=Valor;
            return "Operação Concluída com Sucesso!";
        }
    }

}
