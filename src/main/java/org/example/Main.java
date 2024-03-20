package org.example;

public class Main {
    public static void main(String[] args) {

        Animal froschi = new Animal(1, "Froschi","Cat", 15);
        Animal xenia = new Animal(2,"Xenia", "Cat", 16);

        Animal benni = new Animal(1,"Froschi", "Cat", 15);

        System.out.println(froschi);
        System.out.println(xenia);
        System.out.println(benni);

        if (froschi.equals(benni)) {
            System.out.println("Froschi ist Benni");
        } else {
            System.out.println("Froschi ist NICHT Benni");
        }
    }



}