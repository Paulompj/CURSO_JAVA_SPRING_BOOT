package Exercicios2;

public class TesteFrequenciaCardiaca {
    public static void main(String[] args) {
        Date p1 = new Date(20,7,2004);
        HeartRates Paciente1 = new HeartRates("Paulo","Moraes",p1);
        System.out.println(Paciente1.frequenciaCardiacaAlvo());

    }
}
