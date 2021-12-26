package com.petstore;

import java.time.LocalDate;

public class Dog extends Animal {

    private long pedigreeId;

    private LocalDate chipDate;

    public LocalDate getChipDate() {
        return chipDate;
    }

    public void setChipDate(LocalDate chipDate) {
        this.chipDate = chipDate;
    }

    public Dog(String name, String owner, String breed, AnimalType animalType, long pedigreeId) {
        super(name, owner, breed, animalType);
        this.pedigreeId = pedigreeId;
    }

    public static void examineAnimal() {
        System.out.println("examine a dog");
    }
}
