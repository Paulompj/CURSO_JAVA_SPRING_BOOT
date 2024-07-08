package Exercicios.Arquivos.Estudo;

import Exercicios.Arquivos.JavaJR.Entidades.views;

import java.io.File;

public class E09_Manipulando_Pastas {
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\PC\\Desktop");
        //Visualizando Diretórios//
        /*System.out.println("\tDIRETÓRIOS E FILES");
        for(File x: caminho.listFiles()){
            System.out.println(x);
        }*/
        System.out.println("\tAPENAS FILES");
        views.listarUsuarios();
        /*System.out.println("\tAPENAS DIRETÓRIOS");
        for(File x: caminho.listFiles(File::isDirectory)){
            System.out.println(x);
        }*/
    }
}
