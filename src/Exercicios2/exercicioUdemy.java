package Exercicios2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicioUdemy {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, Bem vindo ao sistema de cadastros");
        System.out.print("Digite quantos funcionários voce deseja cadastrar: ");
        int escolha = input.nextInt();
        input.nextLine();
        ArrayList<Pessoa> Lista = new ArrayList<Pessoa>();
        for(int indice = 0; indice < escolha; indice += 1){
            System.out.printf("\nCadastre o funcionário %d°:\n",indice+1);
            System.out.print("Digite o nome: ");
            String nome = input.nextLine();
            System.out.print("Digite o id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Digite o salário: ");
            double salario = input.nextDouble();
            input.nextLine();
            Lista.add(new Pessoa(nome,id,salario));
            System.out.printf("%d° funcionario adicionado com sucesso!\n",indice+1);
            if (indice == escolha-1){
                System.out.println("Todos os Funcionários foram cadastrados com sucesso");
            }
            else{}
        }
        System.out.println("\nFuncionarios Cadastrados: ");
        for(int indice = 0; indice < escolha; indice += 1){
            System.out.printf("\tFuncionário %d: \n",indice +1);
            System.out.println(Lista.get(indice));
        }
        System.out.println("Digite o id do funcionario que deseja aumentar o salário: ");
        int id = input.nextInt();
        input.nextLine();
        if (posicao(Lista,id) == null){
            System.out.println("Esse Funcionário nao existe");
        }
        else{
            System.out.println("Digite quantos % deseja aumentar o salario: ");
            double aumento = input.nextDouble();
            Lista.get(posicao(Lista,id)).aumentaSalario(aumento);
            System.out.println("Aumento realizado com sucesso!");
            System.out.println(Lista.get(posicao(Lista,id)).toString());
        }
        input.close();
    }
    public static Integer posicao(ArrayList<Pessoa> Lista, int id){
        for(int indice = 0; indice < Lista.size(); indice += 1){
            if (Lista.get(indice).getId() == id){
                return indice;
            }
        }
        return null;
    }
}
