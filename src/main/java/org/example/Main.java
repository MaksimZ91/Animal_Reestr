package org.example;

import org.example.Animals.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Registry rg = new Registry();
        Cats ct = new Cats("me", "11.08.2022");
        Horse hr = new Horse("uj", "11.08.2021");

        rg.add(ct);
        ct.educateCommand("ktf0", "ffg");


        rg.add(hr);
        System.out.println(rg.getHomeAnimalList());
        System.out.println(rg.getPackAnimalList());
        System.out.println(rg.viewCommandAnimals(ct));



    }
}