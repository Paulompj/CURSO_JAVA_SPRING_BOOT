package Exercicios.Arquivos.Estudo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
//LENDO OS DADOS DO TXT COM SCANNER
public class E01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PC\\Desktop\\in.txt");
        Scanner input = null;
        try{
            input = new Scanner(file);
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }

        } catch (IOException e) {
            System.err.println("Erro: "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            if(input != null){
                input.close();
            }
        }
    }
}
