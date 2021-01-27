package ru.job4j; //заголовок класса

import java.time.LocalDate; //ссылка на класс time.LocalDate

public class Info { //объявление класса

    public static void main(String[] args) { //вход
        LocalDate localDate = LocalDate.now(); //метод работы с датой, выводит текущую дату
        System.out.println(localDate.toString()); //вывод текущей даты
    }
}



