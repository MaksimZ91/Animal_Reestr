package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;

public abstract class HomeAnimals extends Animal {
    private ArrayList <Animal> homeAnimalsList;
    public HomeAnimals(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
