package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        double horaIncio,horaFinal,horasJogadas;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a hora que voce começou a jogar:");
        horaIncio = input.nextDouble();
        if(horaIncio < 0.0 || horaIncio > 24.0){
            System.out.println("Hora inválida");
        }
        System.out.print("Digite a hora que voce terminou de jogar:");
        horaFinal = input.nextDouble();
        if(horaFinal < 0.0 || horaFinal > 24.0){
            System.out.println("Hora inválida");
        }

        if(horaFinal<horaIncio){
            horasJogadas = 24 - (horaIncio-horaFinal);
            System.out.printf("Horas jogadas: %.1f",horasJogadas);
        }
        else if(horaFinal>horaIncio){
            horasJogadas = horaFinal - horaIncio;
            System.out.printf("Horas jogadas: %.1f hora",horasJogadas);
        }
        input.close();

    }
}
