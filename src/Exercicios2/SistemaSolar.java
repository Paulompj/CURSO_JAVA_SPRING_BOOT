package Exercicios2;

import Entidades.Enums.Planeta;

public class SistemaSolar {
    public static String Autenticar(String PlanetaDigitado){
         return "Nome do Planeta: "+Planeta.valueOf(PlanetaDigitado);
    }
}
