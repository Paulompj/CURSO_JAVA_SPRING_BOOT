import Entidades.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Estudante estudante;
        estudante = new Estudante();
        System.out.println("Bem vindo");
        System.out.println("Notas máxima que um aluno poderá obter em cada trimestre:");
        System.out.println("Nota 1: Máximo de 30pts");
        System.out.println("Nota 2: Máximo de 35pts");
        System.out.println("Nota 3: Máximo de 35pts");
        System.out.print("Digite o nome do aluno: ");
        estudante.nome = input.nextLine();
        System.out.print("Digite a nota 1 do aluno: ");
        estudante.nota1 = input.nextDouble();
        System.out.print("Digite a nota 2 do aluno: ");
        estudante.nota2 = input.nextDouble();
        System.out.print("Digite a nota 3 do aluno: ");
        estudante.nota3 = input.nextDouble();
        if(estudante.MediaAluno()>=60.0){
            System.out.println("Aprovado");
            System.out.println("Sua media: "+estudante.MediaAluno());
        }
        else{
            System.out.println("Reprovado");
            System.out.println("Sua média: "+estudante.MediaAluno());
            System.out.printf("Faltaram %.2f pontos para passar",60.0 - estudante.MediaAluno());
        }






    }
}
