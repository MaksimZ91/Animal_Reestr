package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;

public abstract class PackAnimals extends Animal {
    private ArrayList <Animal> packAnimalsList;
    public PackAnimals(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
