package org.example.UI;

import java.util.Scanner;

public class UI {
    public Integer mainMenu() {
        System.out.println(
                "1.Завести новое животное. \n" +
                "2.Просмотреть всхе домашних животных. \n" +
                "3.Просмотреть всех вьючных животных. \n" +
                "4.Выход."
        );
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите требуемый пнкут меню: ");
        return in.nextInt();
    }
}
