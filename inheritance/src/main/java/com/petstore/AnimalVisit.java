package com.petstore;

public class AnimalVisit {
    public static void main(String[] args) {
        Dog pug = new Dog("Biron", "Pug Owner", "Pug", Animal.AnimalType.DOG, 12345);
        System.out.println(pug);
        Animal.examineAnimal();
        Dog.examineAnimal();

        Animal.commonMethod();
        Dog.commonMethod();
    }
}
