package Exercicios.Arquivos.Estudo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class E010_CRIANDO_PASTAS {
    public static void main(String[] args) {
        if(Files.isDirectory(Path.of("C:/Users/PC/Desktop/CRIADA"))){
            System.out.println("Pasta ja existe");
        }
        else{
            boolean x = new File("C:/Users/PC/Desktop"+"/CRIADA").mkdir();
            System.out.println(x);
        }
    }
}
