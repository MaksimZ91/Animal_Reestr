package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;

public class Registry {
   private ArrayList <Animal> homeAnimalList;
   private ArrayList <Animal> packAnimalList;


    public void add(Animal animal){
        if (animal instanceof HomeAnimals)
            homeAnimalList.add(animal);
        packAnimalList.add(animal);
    }

    public ArrayList <Command> viewCommandAnimals(Animal animal){

        return animal.getCommands();
    }
}
