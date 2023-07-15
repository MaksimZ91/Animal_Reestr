package org.example.Validator;

import org.example.MyExeption.DateExceptions;



public class Validator {
    public boolean validate(String data) throws Exception{
        return validateYearOfBirth(data);
    }
    private boolean validateYearOfBirth(String yearOfBirth) throws Exception{
        String[] date = yearOfBirth.split("\\.");
        if (date.length < 3){
            throw new DateExceptions("Неверный формат даты! Дата должна быть в формате dd.mm.yyyy!");
        }
        try {
            int day = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);
            if ((day < 1 || day > 31) || (month < 1 || month > 12) || year < 1900)
                throw new DateExceptions("Неверный формат даты! Введенное значение не является числом!");
            return true;
        } catch (NumberFormatException | DateExceptions e){
            throw new DateExceptions(e.getMessage());
        }
    }
}
