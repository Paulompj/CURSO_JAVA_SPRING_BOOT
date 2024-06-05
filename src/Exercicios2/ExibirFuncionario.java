package Exercicios2;

import Entidades.Trabalhador;

import java.util.ArrayList;

public class ExibirFuncionario {
    public static void Exibir(ArrayList<Trabalhador> Funcionarios){
        for(int i = 0; i < Funcionarios.size(); i += 1){
            System.out.printf("\n\tFuncionário %d:\n%s",i+1,Funcionarios.get(i));
        }
    }
}
