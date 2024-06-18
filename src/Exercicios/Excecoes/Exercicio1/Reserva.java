package Exercicios.Excecoes.Exercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer Numero_Quarto;
    private Date Entrada;
    private Date Saida;
    static SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
    public Reserva(Integer num, Date entrada, Date saida){
        this.Entrada = entrada;
        this.Saida = saida;
        this.Numero_Quarto = num;
    }
    public long duracao(){
        long diff = Saida.getTime() - Entrada.getTime();//Diff = milissegundos
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }
    public void atualizarData(Date entrada, Date saida){
        this.Entrada = entrada;
        this.Saida = saida;
    }

    @Override
    public String toString() {
        return "Reserva: " + ", Numero do Quarto: "+Numero_Quarto+", Entrada: "+formatacao.format(Entrada)+", Saída: "+formatacao.format(Saida)+ ", "+duracao()+" noites";

    }
}
