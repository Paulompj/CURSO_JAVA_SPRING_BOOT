package Exercicios.Herança.Exercicios;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        //System.out.println(animal.barulho());
        Cachorro pink = new Cachorro("Pink");
        //System.out.println(pink.barulho());
        Animal x = new Cachorro("Dogao");
        Cachorro rabito = new Cachorro("Rabito");
    }
    public static String Animal(Animal y){
        if (y instanceof Cachorro){
            return "É CACHORRO";
        }
        return "É animal";
    }
}

