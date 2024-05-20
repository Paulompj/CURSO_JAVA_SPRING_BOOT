package Exercicios;

import Entidades.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class teste3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ArrayList<Person> vetpessoas = new ArrayList<Person>();
        System.out.print("Digite a quantidade de funcionários que voce deseja cadastrar: ");
        int escolha = input.nextInt();
        input.nextLine(); // Limpa buffer
        for(int indice = 0; indice < escolha; indice +=1){
            System.out.printf("Cadastre o %d° funcionário: \n",indice +1);
            System.out.print("Digite o nome: ");
            String nome = input.nextLine();
            System.out.print("Digite o id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Digite o salário: ");
            double salario = input.nextDouble();
            input.nextLine();
            Person pessoa = new Person(nome,id,salario);
            vetpessoas.add(pessoa);
        }
        for(int indice = 0; indice < escolha; indice += 1){
            System.out.println(vetpessoas.get(indice).toString());
        }
        System.out.print("Digite o id do funcionario que deseja aumentar o salario: ");
        int id = input.nextInt();
        input.nextLine();//Limpa buffer
        if(posicao(vetpessoas,id) == null){
            System.out.println("Nao existe");
        }
        else{
            System.out.print("Digite em quantos % deseja aumentar o salario:");
            double aumento = input.nextDouble();
            input.nextLine();
            vetpessoas.get(posicao(vetpessoas,id)).AumentaSalario(aumento);
            System.out.println(vetpessoas.get(posicao(vetpessoas,id)).toString());
        }

        input.close();
    }
    public static Integer posicao(ArrayList<Person> list,int id){
        for(int i = 0; i < list.size(); i+=1){
            if(list.get(i).getId() == id){
                return i;
            }
            else{}
        }
        return null;
    }
}
