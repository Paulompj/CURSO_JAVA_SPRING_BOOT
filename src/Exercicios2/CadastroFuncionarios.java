package Exercicios2;

import Entidades.Contrato_Por_Hora;
import Entidades.Enums.Nivel_Trabalho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroFuncionarios {
    static Scanner input = new Scanner(System.in);
    public static String CadastrarNome() {
        System.out.print("Nome do funcionario: ");
        String nome = input.nextLine();
        return nome;
    }
    public static Nivel_Trabalho CadastrarNvlTrabalho(){
        System.out.println("Nivel Trabalho: ");
        System.out.print("\tOpcões: \n\t°JUNIOR\n\t°PLENO\n\t°SENIOR\n");
        System.out.print("Escolha: ");
        String nvl = input.nextLine();
        Nivel_Trabalho nivelTrabalho = Nivel_Trabalho.valueOf(nvl);
        return nivelTrabalho;
    }
    public static double CadastrarSalario(){
        System.out.print("Base Salarial: ");
        double BaseSalarial = input.nextDouble();
        input.nextLine();
        return BaseSalarial;
    }
    public static String CadastrarDepartamento(){
        System.out.print("Departamento: ");
        String departamento = input.nextLine();

        return departamento;
    }
    public static Contrato_Por_Hora CadastrarContrato(){
        System.out.print("Informe a data do contrato: ");
        String data = input.nextLine();
        Date an = new Date(data);
        System.out.print("Digite o valor/Hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();
        input.nextLine();
        Contrato_Por_Hora x = new Contrato_Por_Hora(an,valorHora,horasTrabalhadas);
        return x;
    }

    }

