package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;

public class Registry {
   private ArrayList <Animal> homeAnimalList;

    public Registry() {
        this.homeAnimalList = new ArrayList<Animal>();
        this.packAnimalList = new ArrayList<Animal>();
    }

    private ArrayList <Animal> packAnimalList;


    public void add(Animal animal){
        if (animal instanceof HomeAnimals){
            homeAnimalList.add(animal);
        } else {
            packAnimalList.add(animal);
        }
    }

    public ArrayList <Command> viewCommandAnimals(Animal animal){

        return animal.getCommands();
    }

    public ArrayList<Animal> getHomeAnimalList() {
        return homeAnimalList;
    }

    public void setHomeAnimalList(ArrayList<Animal> homeAnimalList) {
        this.homeAnimalList = homeAnimalList;
    }

    public ArrayList<Animal> getPackAnimalList() {
        return packAnimalList;
    }

    public void setPackAnimalList(ArrayList<Animal> packAnimalList) {
        this.packAnimalList = packAnimalList;
    }
}
