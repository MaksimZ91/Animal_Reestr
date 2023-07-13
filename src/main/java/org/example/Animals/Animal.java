package org.example.Animals;


import org.example.Comands.Command;

import java.util.ArrayList;

public abstract class Animal {
   private String name;
   private ArrayList <Command> commands;
   private String dateOfBirth;


    public Animal(String name, ArrayList<Command> commands, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void educateCommand(String nameCommand, String descriptionCommand){
        Command command = new Command(nameCommand, descriptionCommand);
        commands.add(command);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
