package org.example.Controller;

import org.example.Animals.Registry;
import org.example.UI.UI;

public class Controller {
    public void start(){
        UI mmenu = new UI();
        Registry rg = new Registry();
        switch (mmenu.mainMenu()) {
            case 1 -> System.out.println("заглушка");
            case 2 -> System.out.println(rg.getHomeAnimalList());
            case 3 -> System.out.println(rg.getPackAnimalList());
            default -> {return;}
        }


    }
}
