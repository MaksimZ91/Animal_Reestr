package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;

public abstract class HomeAnimals extends Animal {
    private ArrayList <Animal> homeAnimalsList;
    public HomeAnimals(String name, ArrayList<Command> commands, String dateOfBirth) {
        super(name, commands, dateOfBirth);
    }
}
