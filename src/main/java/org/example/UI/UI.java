package org.example.UI;

import org.example.Animals.Animal;
import org.example.Comands.Command;
import org.example.Controller.Controller;
import org.example.MyExeption.DateExceptions;
import org.example.Validator.Validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UI {

    public Integer mainMenu() {
        Scanner in  = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(
                "1.Завести новое животное. \n" +
                "2.Просмотреть всех домашних животных.\n" +
                "3.Просмотреть всех вьючных животных.\n" +
                "4.Обчуить животное новой команде.\n" +
                "5.Просмотреть команды которым обученно животное.\n" +
                "0. Выход"

        );
        System.out.println("Выберите требуемый пнкут меню: ");
        return in.nextInt();
    }

    public  Integer userRequestTypeAnimals(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Выбеоить какое животное вы хотели бы добавить: ");
        System.out.println(
                """
                        1.Лошадь.
                        2.Верблюд.
                        3.Осел.
                        4.Собака.
                        5.Кот.
                        6.Хомяк
                        """
        );

        System.out.println("Выберите требуемый пнкут меню: ");
        return in.nextInt();
    }

    public HashMap<String, String> userRequestAnimalData() throws Exception{
        Scanner in  = new Scanner(System.in);
        Validator vl = new Validator();
        HashMap<String, String> animalData = new HashMap<String, String>();
        System.out.println("Введите имя животного: ");
        String name = in.nextLine();
        System.out.println("Введите дату рождения животного в формате dd.mm.yyyy: ");
        String date = in.nextLine();
        vl.validate(date);
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
            System.out.println(" ");
        } else {
            System.out.println("Список пуст!");
        }
    }
    public Animal userRequestUpdateAnimalCommand(ArrayList<Animal> animals){
        Scanner in  = new Scanner(System.in);
        printList(animals);
        System.out.print("Выберите животное которое хотите обучить новой команде: ");
        int index = in.nextInt();
        return animals.get(index-1);
    }

    public HashMap<String, String> userRequestNewCommand(){
        HashMap<String, String> result = new HashMap<String, String>();
        Scanner in  = new Scanner(System.in);
        System.out.print("Введите название команды: ");
        String name = in.nextLine();
        System.out.print("Введите описание команды: ");
        String description = in.nextLine();
        result.put("name", name);
        result.put("description", description);
        return result;
    }

    public void printCommandList(ArrayList<Command> commands){
        if (!commands.isEmpty()){
            int index = 1;
            System.out.println("№     Название     Описание");
            for (Command command: commands) {
                System.out.println(index + " " + command.getName() + " " + command.getDescription());
                index++;
            }
        } else {
            System.out.println("Список пуст!");
        }

    }




}
