package Exercicios.Excecoes;

import Exercicios.Excecoes.Exercicio1.Reserva;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class teste {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero do quarto: ");
        int numQuarto = input.nextInt();
        input.nextLine();
        System.out.println("Digite a data de ENTRADA:");
        Date entrada = formatacao.parse(input.nextLine());
        System.out.println("Digite a data de SAÍDA:");
        Date saida = formatacao.parse(input.nextLine());
        if (entrada.after(saida)){
            System.out.println("Erro! Entrada esta depois da saída");
        }
        else{
            Reserva quarto1 = new Reserva(numQuarto,entrada,saida);
            System.out.println(quarto1);
        }



        input.close();
}
}
