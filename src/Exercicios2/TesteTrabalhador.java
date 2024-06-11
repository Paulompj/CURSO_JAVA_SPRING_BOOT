package Exercicios2;

import Entidades.Departamento;
import Entidades.Trabalhador;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteTrabalhador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int escolha;
        ArrayList<Trabalhador> Funcionarios = new ArrayList<>();
        do{
            System.out.println("\tBem vindo");
            System.out.println("1 - Cadastrar Funcionario\n2 - Visualizar Funcionários\n3 - Cadastrar Contratos\n4 - Sair");
            System.out.print("Escolha: ");
            escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:
                    Funcionarios.add(new Trabalhador(CadastroFuncionarios.CadastrarNome(),CadastroFuncionarios.CadastrarNvlTrabalho(),CadastroFuncionarios.CadastrarSalario(),new Departamento(CadastroFuncionarios.CadastrarDepartamento()),CadastroFuncionarios.CadastrarContrato()));
                    break;
                case 2:
                    if(Funcionarios.isEmpty()){
                        System.out.println("\nNenhum Funcionário Cadastrado\n");
                    }
                    else{
                        ExibirFuncionario.Exibir(Funcionarios);
                    }
                    break;
                case 3:
                    if(Funcionarios.isEmpty()){
                        System.out.println("\nNenhum Funcionário Cadastrado\n");
                    }
                    else{
                        System.out.println("\t1 - Vizualizar todos os contratos\n\t2 - Vizualizar contrato específico");
                        System.out.print("Escolha: ");
                        int escolha1 = input.nextInt();
                        input.nextLine();
                        switch (escolha1){
                            case 1:
                                for(int i = 0; i < Funcionarios.size(); i += 1){
                                    Funcionarios.get(i).VisualizarContratos();
                                }
                                break;
                            case 2:
                                System.out.printf("Existem %d funcionários cadastrados\n",Funcionarios.size());
                                if (Funcionarios.size() == 1){
                                    System.out.printf("\nContrato pertencente a %s",Funcionarios.getFirst().getNome());
                                    Funcionarios.getFirst().VisualizarContratos();
                                }
                                else{
                                    ExibirFuncionario.Exibir(Funcionarios);
                                    System.out.println("Digite de qual Funcionario voce quer ver os contratos: ");
                                    System.out.print("Escolha: ");
                                    int escolha2 = input.nextInt();
                                    input.nextLine();
                                    Funcionarios.get(escolha2-1).VisualizarContratos();
                                }


                        }
                    }

            }


        }while (escolha != 4);
        input.close();



    }
}
