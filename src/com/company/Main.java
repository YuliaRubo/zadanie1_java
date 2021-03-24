package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1990;
        int monthOfBirthday = 01;
        int dayOfBirthday = 06;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println ("Сумма моего года, месяца и дня рождения:"+" " + sum);
        boolean monthBiggerDay;
        if (monthOfBirthday>dayOfBirthday)
            monthBiggerDay = true;
        else
            monthBiggerDay = false;
        System.out.println ("Месяц моего рождения больше даты рождения:"+" " +  monthBiggerDay);
        char ch1, ch2, ch3;

        ch1 = 'Ю';
        ch2 = 'л';
        ch3 = 'я';
        System.out.println("Массив с моим именем: " + ch1 + ch2 + ch3);
        double myAge = 31;
        double partYear = 2.0 / 12.0;
        double sum1 = myAge + partYear;
        System.out.println("Мне " + sum1 + "лет");

        }	// write your code here
    }

