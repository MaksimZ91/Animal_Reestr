package org.example.Animals;
import org.example.Comands.Command;
import org.example.Counter.Counter;

import java.util.ArrayList;
import java.util.HashMap;



public class Registry {
   private ArrayList <Animal> homeAnimalList;
    private ArrayList <Animal> packAnimalList;

    public Registry() {
        this.homeAnimalList = new ArrayList<Animal>();
        this.packAnimalList = new ArrayList<Animal>();
    }


    public void add(HashMap<String, String> data, int typeAnimal) throws Exception {
        try(Counter ct = new Counter()) {
            if (data.get("name").length() == 0)
                throw new Exception("Введены не полные данные!");
            switch (typeAnimal) {
                case 1 -> packAnimalList.add(new Horse(data.get("name"), data.get("date")));
                case 2 -> packAnimalList.add(new Camel(data.get("name"), data.get("date")));
                case 3 -> packAnimalList.add(new Donkey(data.get("name"), data.get("date")));
                case 4 -> homeAnimalList.add(new Dogs(data.get("name"), data.get("date")));
                case 5 -> homeAnimalList.add(new Cats(data.get("name"), data.get("date")));
                case 6 -> homeAnimalList.add(new Homyaks(data.get("name"), data.get("date")));
            }
            ct.add();
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public  ArrayList<Animal> getAllAnimals(){
        ArrayList<Animal> result = new ArrayList<Animal>(packAnimalList);
        result.addAll(homeAnimalList);
        return result;
    }

    public ArrayList<Animal> getHomeAnimalList() {
        return homeAnimalList;
    }

    public ArrayList<Animal> getPackAnimalList() {
        return packAnimalList;
    }

}
