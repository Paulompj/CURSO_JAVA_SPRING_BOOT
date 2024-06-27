package Exercicios.Arquivos.Estudo;
import java.nio.file.*;
public class E02_Diretorios {
    //Manipulando Diretórios
    public static void main(String[] args) {
    Path diretorio = Paths.get("C:/Users/PC/Desktop");
    if(Files.isDirectory(diretorio)){
        System.out.println("Esse Diretorio existe");
    }
    else{
        System.out.println("O diretorio nao existe");
    }
    Path arquivo = Paths.get("C:\\Users\\PC\\Desktop\\in.txt");
    if(Files.exists(arquivo)){
        System.out.println("Esse arquivo existe");
    }
    else{
        System.out.println("O arquivo nao existe");
    }

    }
}
