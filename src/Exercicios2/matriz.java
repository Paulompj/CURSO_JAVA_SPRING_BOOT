package Exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Sua matriz terá quantas linhas:  ");
        int linhaecolha = input.nextInt();
        input.nextLine();
        System.out.print("E quantas colunas: ");
        int colunaescolha = input.nextInt();
        input.nextLine();
        int[][] matriz = new int[linhaecolha][colunaescolha];
        for (int linha = 0; linha < matriz.length; linha += 1){
            for (int coluna = 0; coluna < colunaescolha; coluna += 1){
                System.out.print("Linha " +linha+" Coluna " +coluna+":");
                matriz[linha][coluna] = input.nextInt();
                input.nextLine();
            }
        }
        System.out.println("Digite um número que pertença a matriz: ");
        int numero = input.nextInt();
        input.nextLine();
        int linhanum = 0;
        int colunanum = 0;
        for (int linha = 0; linha < matriz.length; linha += 1){
            for (int coluna = 0; coluna < colunaescolha; coluna += 1){
                if(matriz[linha][coluna] == numero){
                    linhanum = linha;
                    colunanum = coluna;
                    System.out.printf("O número %d está localizado na posiçao\nLinha = %d\nColuna = %d\n",numero,linha,coluna);
                }
            }
        }
        if ((colunanum - 1) < 0){
            System.out.println("A esquerda: Null");
        }
        else {
            System.out.println("Do lado esquerdo: "+matriz[linhanum][colunanum-1]);
        }
        if ((colunanum + 1) > colunaescolha-1){
            System.out.println("A direita: Null");
        }
        else{
            System.out.println("Do lado direito: "+matriz[linhanum][colunanum+1]);
        }
        if ((linhanum-1) < 0){
            System.out.println("Acima: Null");
        }
        else {
            System.out.println("Acima: "+matriz[linhanum-1][colunanum]);
        }
        if(linhanum+1 > linhaecolha ){
            System.out.println("Abaixo: Null");
        }
        else{
            System.out.println("Abaixo: "+matriz[linhanum+1][colunanum]);
        }




        input.close();
    }
}
