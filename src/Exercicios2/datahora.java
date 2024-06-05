package Exercicios2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class datahora {
    public static void main(String[] args) {
        /*LocalDate x = LocalDate.now();
        System.out.println("USANDO APENAS LocalDate E FORMATAÇÃO: ");
        System.out.println("Data antes de formatar: "+x);
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Depois da formatação: "+formatoBR.format(x));

        System.out.println("-----------------------------------------------------------");
        System.out.println("USANDO APENAS LocalDateTime E FORMATAÇÃO");
        LocalDateTime y = LocalDateTime.now();
        System.out.println("Antes da formatação: "+y);
        DateTimeFormatter formatoBR2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Depois da formatação: "+formatoBR2.format(y));

        System.out.println("------------------------------------------------------------");
        System.out.println("USANDO APENAS Instant, Fuso E FORMATAÇÃO");
        Instant z = Instant.now();
        System.out.println("Hora com Fuso sem format: "+z);
        DateTimeFormatter fmtFuso = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmtFusoPORTUGAL = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Portugal"));
        LocalDateTime fusoBR = LocalDateTime.ofInstant(z,ZoneId.systemDefault());
        System.out.println("Hora com fuso e com format: "+fmtFuso.format(z));
        System.out.println("fuso funcionando BR: "+ fmtFuso.format(fusoBR));
        System.out.println("Fuso de portugal: "+fmtFusoPORTUGAL.format(z));

        System.out.println("------------------------------------------------------------");
        System.out.println("LocalDate com Calculo de hora(Aumentar ou diminuir dia,mes ou ano)");
        System.out.println("O QUE ESTÁ ABAIXO FUNCIONA PARA O LocalDateTime");
        LocalDate hour = LocalDate.now();
        System.out.println("Data de hoje -> Aumentando uma semana: "+formatoBR.format(hour.plusWeeks(1)));
        System.out.println("Data de hoje -> Aumentando uma 2 dias: "+formatoBR.format(hour.plusDays(2)));
        System.out.println("Data de hoje -> Diminuindo uma semana: "+formatoBR.format(hour.minusWeeks(1)));
        System.out.println("Data de hoje -> Diminuindo 2 dias: "+formatoBR.format(hour.minusDays(2)));

        System.out.println("------------------------------------------------------------");
        System.out.println("Instant com Calculo de hora(Aumentar ou diminuir dia,mes ou ano)");
        Instant teste = Instant.now();
        System.out.println("Data de hoje -> Aumentando uma semana: "+fmtFuso.format(teste.plus(7, ChronoUnit.DAYS)));
        System.out.println("Data de hoje -> Aumentando uma 2 dias: "+fmtFuso.format(teste.plus(2,ChronoUnit.DAYS)));
        System.out.println("Data de hoje -> Diminuindo uma semana: "+fmtFuso.format(teste.minus(7,ChronoUnit.DAYS)));
        System.out.println("Data de hoje -> Diminuindo 2 dias: "+fmtFuso.format(teste.minus(2,ChronoUnit.DAYS)));
        System.out.println("-------------------------");*/
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate an = LocalDate.parse("2018-08-18");
        System.out.println(an);




    }
}
