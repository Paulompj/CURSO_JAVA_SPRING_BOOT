package Exercicios.Arquivos.Estudo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E05_LendoArq_FILE_E_BUFFER {
    public static void main(String[] args) {
        String path = "C:/Users/PC/Desktop/paulo.txt";
        FileReader fr = null;
        BufferedReader bf = null;
        try{
            fr = new FileReader(path);
            bf = new BufferedReader(fr);
            String linha1 = bf.readLine();
            while (linha1!=null){
                System.out.println(linha1);
                linha1 = bf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(fr != null && bf != null){
                    fr.close();
                    bf.close();
                }
            }catch (IOException e){
                System.err.println("Erro: "+e.getMessage());
            }
        }


    }
}
