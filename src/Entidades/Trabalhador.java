package Entidades;

import Entidades.Enums.Nivel_Trabalho;
import Exercicios2.Date;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trabalhador {
    private String nome;
    private Nivel_Trabalho nivelTrabalho;
    private double baseSalarial;
    private int codigoNivelTrabalho;
    private Departamento departamento;
    ArrayList<Contrato_Por_Hora> Contratos = new ArrayList<>();

    public Trabalhador(String nome, Nivel_Trabalho nivelTrabalho, double baseSalarial, Departamento departamento, Contrato_Por_Hora x){
        this.nome = nome;
        this.nivelTrabalho = nivelTrabalho;
        this.codigoNivelTrabalho = nivelTrabalho.getCodigoNivelTrabalho();
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
        Contratos.add(new Contrato_Por_Hora(x.getData(),x.getValorPorHora(),x.getHorasTrabalhadas()));
    }
    public void AdicionarContrato(Date data, double valorPorHora, double horasTrabalhadas){
        Contratos.add(new Contrato_Por_Hora(data,valorPorHora,horasTrabalhadas));
    }
    public boolean ContratoCheioVazio(){
        if (Contratos.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void VisualizarContratos(){
        if(Contratos.isEmpty()){
            System.out.println("Nenhum contrato vigente");
        }
        else{
            for(int i = 0; i < Contratos.size(); i+=1){
                System.out.printf("%nContrato %d:\n%s%n",i+1,Contratos.get(i)).toString();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Trabalhador" +"\n"+
                "Nome = " + nome +"\n"+
                "NivelTrabalho = " + nivelTrabalho +"\n"+
                "BaseSalarial = " + baseSalarial +"\n"+
                "CodigoNivelTrabalho = " + codigoNivelTrabalho +"\n"+
                departamento+"\n";
    }
}
