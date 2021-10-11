package com.company;

public class Main {

    public static void main(String[] args) {
//создание массива
        Colleague[] colleagues = {
                new Colleague(
                        "Филиппов Федор Николаевич",
                        "manager",
                        "Rogaikopita@gmail.com",
                        "89201123",
                        55000,
                        45
                ),
                new Colleague(
                        "Karloson kotoriy Jivet",
                        "manager",
                        "abrakadabra@vf.rt",
                        "89341212",
                        65789,
                        35
                ),
                new Colleague(
                        "Pup Kin",
                        "boss",
                        "sdjskjdkj@fjf.ru",
                        "4567890",
                        456789,
                        56
                ),
                new Colleague(
                        " Ivan Ivanov",
                        "Pirate",
                        "djfhhghg@gmail.com",
                        "964562367",
                        78900,
                        67
                ),
                new Colleague(
                        "Alex malex",
                        "Captain's assistant",
                        "alexghf@kom.ku",
                        "8904586823",
                        350000,
                        38
                )

        };
        int minAge = 40;
        for(Colleague colleague : colleagues){
            if (colleague.Age > minAge){
                colleague.printInfo();
                System.out.println();
            }
        }
    }}

