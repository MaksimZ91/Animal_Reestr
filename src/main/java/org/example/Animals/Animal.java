package org.example.Animals;


import org.example.Comands.Command;

import java.util.ArrayList;

public abstract class Animal {
   private String name;
   private ArrayList <Command> commands;
   private String dateOfBirth;


    public Animal(String name,  String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = new ArrayList<Command>();
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

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
