package org.example.UI;

import org.example.Animals.Animal;
import org.example.Controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UI {

    public Integer mainMenu() {
        Scanner in  = new Scanner(System.in);
        System.out.println(
                "1.Завести новое животное. \n" +
                "2.Просмотреть всхе домашних животных. \n" +
                "3.Просмотреть всех вьючных животных. \n" +
                "4.Выход."
        );
        System.out.println("Выберите требуемый пнкут меню: ");
        return in.nextInt();
    }

    public  Integer userRequestTypeAnimals(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Выбеоить какое животное вы хотели бы добавить: ");
        System.out.println(
                "1.Лошадь. \n" +
                        "2.Верблюд. \n" +
                        "3.Осел.\n" +
                        "4.Собака.\n" + "5.Кот.\n" + "5.Хомяк\n"
        );

        System.out.println("Выберите требуемый пнкут меню: ");
        return in.nextInt();
    }

    public HashMap<String, String> userRequestAnimalData(){
        Scanner in  = new Scanner(System.in);
        HashMap<String, String> animalData = new HashMap<String, String>();
        System.out.println("Введите имя животного: ");
        String name = in.nextLine();
        System.out.println("Введите дату рождения животного: ");
        String date = in.nextLine();
        animalData.put("name", name);
        animalData.put("date", date);
        return  animalData;
    }

    public void printList(ArrayList<Animal> data){
        if (!data.isEmpty()){
            int index = 1;
            System.out.println("№     Имя     Дата Рождения");
            for (Animal item: data) {
                System.out.println(index + " " + item.getName() + " " + item.getDateOfBirth());
                index++;
            }
        } else {
            System.out.println("Список пуст!");
        }


    }




}
