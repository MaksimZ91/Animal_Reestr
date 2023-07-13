package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;

public abstract class PackAnimals extends Animal {
    private ArrayList <Animal> packAnimalsList;
    public PackAnimals(String name, ArrayList<Command> commands, String dateOfBirth) {
        super(name, commands, dateOfBirth);
    }
}
