package org.example.Controller;

import org.example.Animals.Registry;
import org.example.UI.UI;

import java.util.HashMap;

public class Controller {

    private final UI ui;
   private final Registry rg;
   public Controller(){
       this.ui = new UI();
       this.rg = new Registry();
   }
    public boolean start(){
        switch (ui.mainMenu()) {
            case 1 -> addAnimal();
            case 2 -> ui.printList(rg.getHomeAnimalList());
            case 3 -> ui.printList(rg.getPackAnimalList());
            default -> {return false;}
        }
        return true;
    }
    private void addAnimal(){
        int typeAnimal = ui.userRequestTypeAnimals();
        HashMap<String, String> data = ui.userRequestAnimalData();
        rg.add(data, typeAnimal);
    }
}
