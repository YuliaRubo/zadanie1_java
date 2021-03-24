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

        }	// write your code here
    }

