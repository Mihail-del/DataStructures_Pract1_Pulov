package org.example;

import java.util.Objects;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, AnimalSex sex, int age, String breed) {
        super(name, sex, age);
        this.breed = breed;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(breed);
    }
}
