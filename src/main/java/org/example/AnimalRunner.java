package org.example;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Dog("Buffy", AnimalSex.MALE, 3, "Retriver");
        System.out.println(animal);

        if (animal instanceof Dog dog) {
            dog.eat();
        }
    }
}
