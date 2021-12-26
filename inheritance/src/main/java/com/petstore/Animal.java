package com.petstore;

import java.time.LocalDate;

public class Animal {
    private String name;
    private String owner;
    private String breed;
    private AnimalType animalType = AnimalType.UNKNOWN;

    private LocalDate chipDate;

    public static enum AnimalType {
        UNKNOWN,
        CAT,
        DOG,
        HORSE,
        HAMSTER,
        GOAT,
        SHEEP;
    }

    public Animal(String name, String owner, String breed, AnimalType animalType) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", breed='" + breed + '\'' +
                ", animalType=" + animalType +
                ", chipDate=" + chipDate +
                '}';
    }

    public static void examineAnimal() {
        System.out.println("check body");
        System.out.println("check head");
        System.out.println("check eyes");
    }

    public static void commonMethod() {
        System.out.println("Animal common method");
    }
}
