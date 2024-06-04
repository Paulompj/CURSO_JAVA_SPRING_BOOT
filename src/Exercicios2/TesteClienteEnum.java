package Exercicios2;

import Entidades.Cliente;
import Entidades.Enums.Tipo_Pagamento;

public class TesteClienteEnum {
    public static void main(String[] args) {
        String x = String.format("Credito").toUpperCase();
        Cliente cliente1 = new Cliente("Paulo", Tipo_Pagamento.valueOf(x));
        System.out.println(cliente1);
    }
}
