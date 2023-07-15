package org.example.Animals;

import org.example.Comands.Command;

import java.util.ArrayList;
import java.util.HashMap;



public class Registry {
   private ArrayList <Animal> homeAnimalList;

    public Registry() {
        this.homeAnimalList = new ArrayList<Animal>();
        this.packAnimalList = new ArrayList<Animal>();
    }

    private ArrayList <Animal> packAnimalList;


    public void add(HashMap<String, String> data, int typeAnimal){
        System.out.println(data.get("name") + data.get("date") + typeAnimal);
        switch (typeAnimal) {
            case 1 -> packAnimalList.add(new Horse(data.get("name"), data.get("date")));
            case 2 -> packAnimalList.add(new Camel(data.get("name"), data.get("date")));
            case 3 -> packAnimalList.add(new Donkey(data.get("name"), data.get("date")));
            case 4 -> homeAnimalList.add(new Dogs(data.get("name"), data.get("date")));
            case 5 -> homeAnimalList.add(new Cats(data.get("name"), data.get("date")));
            case 6 -> homeAnimalList.add(new Homyaks(data.get("name"), data.get("date")));
        }
        System.out.println(homeAnimalList);
        System.out.println(packAnimalList);
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
