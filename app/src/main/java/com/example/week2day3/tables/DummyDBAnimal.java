package com.example.week2day3.tables;

import com.example.week2day3.Animal;

import java.util.ArrayList;

public class DummyDBAnimal {
    //Artic
    Animal penguin = new Animal("Penguin", "Bird", "Artic", "sound");
    Animal polarBear = new Animal("Polar Bear", "Mammal", "Artic", "sound");
    Animal walrus = new Animal("Walrus", "Mammal", "Artic", "sound");

    //Forest
    Animal fox = new Animal("Fox", "Mammal", "Forest","sound");
    Animal owl = new Animal("Owl", "Bird", "Forest", "sound");
    Animal mountainLion = new Animal("MountainLion", "Mammal", "Forest", "sound");
    Animal wolf = new Animal("Wolf", "Mammal", "Forest", "sound");

    //Desert
    Animal lizard = new Animal("Desert Chameleon", "Reptile", "Desert", "sound");
    Animal camel = new Animal("Camel", "Mammal", "Desert", "sound");
    Animal snake = new Animal("Rattlesnake", "Reptile", "Desert", "sound");

    //Jungle
    Animal monkey = new Animal("Monkey", "Mammal", "Jungle", "sound");
    Animal croc = new Animal("Crocodile", "Reptile", "Jungle", "sound");

    public ArrayList<Animal> getallAnimals(){
        ArrayList<Animal> animalsInList = new ArrayList<>();
        animalsInList.add(penguin);
        animalsInList.add(polarBear);
        animalsInList.add(walrus);
        animalsInList.add(fox);
        animalsInList.add(owl);
        animalsInList.add(mountainLion);
        animalsInList.add(wolf);
        animalsInList.add(lizard);
        animalsInList.add(camel);
        animalsInList.add(snake);
        animalsInList.add(monkey);
        animalsInList.add(croc);

        return animalsInList;
    }

    public ArrayList<Animal> getAnimalsByCategory(String category) {

        ArrayList<Animal> animalsInList = new ArrayList<>();

    if (category.equals("Artic")) {
        animalsInList.add(penguin);
        animalsInList.add(polarBear);
        animalsInList.add(walrus);
    }
    if (category.equals("Forest")) {
        animalsInList.add(fox);
        animalsInList.add(owl);
        animalsInList.add(mountainLion);
        animalsInList.add(wolf);
    }
    if (category.equals("Desert")) {
        animalsInList.add(lizard);
        animalsInList.add(camel);
        animalsInList.add(snake);
    }

    if (category.equals("Jungle")) {
        animalsInList.add(monkey);
        animalsInList.add(croc);
    }

    if (category.equals("Mammal")) {
        animalsInList.add(fox);
        animalsInList.add(monkey);
        animalsInList.add(mountainLion);
        animalsInList.add(camel);
        animalsInList.add(wolf);
        animalsInList.add(polarBear);
    }
    if (category.equals("Reptile")) {
        animalsInList.add(snake);
        animalsInList.add(croc);
        animalsInList.add(lizard);
    }

    if (category.equals("Bird")) {
        animalsInList.add(penguin);
        animalsInList.add(owl);
    }

        return animalsInList;
    }

    public Animal getAnimalsByName(String animalName) {
       ArrayList<Animal> allAnimals = getallAnimals();
       Animal animal = new Animal();
        for(int i = 0; i < allAnimals.size();i++){
            if(allAnimals.get(i).getName().equals(animalName)){
                animal = allAnimals.get(i);
            }
        }

        return animal;
    }

}
