package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Owner;
import org.example.zoo.Species;

public class Main {
    public static void main(String[] args) {

        Owner carsten = new Owner("Carsten", 56, "Musterstraße 123, 12345 Musterhausen");
        Owner santaclaus = new Owner("Santa Claus",9999,"Wolkenweg 1, 00000 Himmel");

        Species cat = new Species("Cat", 200);
        Species reindeer = new Species("Reindeer", 9999);

        Animal froschi = new Animal(1, "Froschi",cat, 15, carsten);
        Animal xenia = new Animal(2,"Xenia", cat, 16, carsten);

        Animal benni = new Animal(1,"Froschi", cat, 15, carsten);

        Animal rudolph = new Animal(0,"Rudolph", reindeer,9999,santaclaus);

        System.out.println(froschi);
        System.out.println(xenia);
        System.out.println(benni);
        System.out.println(rudolph);

        if (froschi.equals(benni)) {
            System.out.println("Froschi ist Benni");
        } else {
            System.out.println("Froschi ist NICHT Benni");
        }
    }



}