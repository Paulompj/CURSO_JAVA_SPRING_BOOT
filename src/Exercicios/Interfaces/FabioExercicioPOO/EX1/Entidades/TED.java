package Exercicios.Interfaces.FabioExercicioPOO.EX1.Entidades;

import Exercicios.Interfaces.FabioExercicioPOO.EX1.INTERFACE.Transferencia;

public class TED implements Transferencia {
    public TED() {
    }

    @Override
    public void transferir(Double valor, String DadosBancarios) {
        System.out.println("\t---------Transferencia TED---------");
        System.out.println("Valor: R$"+valor);
        System.out.println("Dados Bancários: "+DadosBancarios);
    }
}
