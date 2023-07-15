package org.example.Controller;

import org.example.Animals.Animal;
import org.example.Animals.Registry;
import org.example.Comands.Command;
import org.example.UI.UI;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    private final UI ui;
   private final Registry rg;
   public Controller(){
       this.ui = new UI();
       this.rg = new Registry();
   }
    public boolean start() throws Exception {
        switch (ui.mainMenu()) {
            case 1 -> addAnimal();
            case 2 -> ui.printList(rg.getHomeAnimalList());
            case 3 -> ui.printList(rg.getPackAnimalList());
            case 4 -> setNewCommand();
            case 5 -> viewAnimalCommands();
            default -> {return false;}
        }
        return true;
    }
    private void addAnimal() throws Exception {
        int typeAnimal = ui.userRequestTypeAnimals();
        HashMap<String, String> data = ui.userRequestAnimalData();
        rg.add(data, typeAnimal);
    }

    private void setNewCommand(){
        Animal animal = ui.userRequestUpdateAnimalCommand(rg.getAllAnimals());
        HashMap<String, String> newCommand = ui.userRequestNewCommand();
        animal.educateCommand(newCommand.get("name"), newCommand.get("description"));
    }

    private void viewAnimalCommands(){
        Animal animal = ui.userRequestUpdateAnimalCommand(rg.getAllAnimals());
        ArrayList<Command> commands = animal.getCommands();
        ui.printCommandList(commands);
    }



}
