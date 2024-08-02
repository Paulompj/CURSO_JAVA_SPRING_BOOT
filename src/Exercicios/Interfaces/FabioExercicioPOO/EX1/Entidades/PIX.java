package Exercicios.Interfaces.FabioExercicioPOO.EX1.Entidades;

import Exercicios.Interfaces.FabioExercicioPOO.EX1.INTERFACE.Transferencia;

public class PIX implements Transferencia {
    public PIX() {
    }

    @Override
    public void transferir(Double valor, String DadosBancarios) {
        System.out.println("\t---------Transferencia PIX---------");
        System.out.println("Valor: R$"+valor);
        System.out.println("Dados Bancários: "+DadosBancarios);
    }
}
