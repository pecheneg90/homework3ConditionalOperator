package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        // Ниже вариант выполнения первого задания.
        int clientOs = 0;
        if (clientOs > 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println();

        System.out.println("Задание 2");
        // Ниже вариант выполнения второго задания.
        int clientDeviceYear = 2017;
        if (clientOs > 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию приложения для Android по ссылке");
        } else if (clientOs > 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs < 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию приложения для iOS по ссылке");
        } else if (clientOs < 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        System.out.println();

        System.out.println("Задание 3");
        // Ниже вариант выполнения третьего задания.
        int year = 1700;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " это високосный год");
        } else {
            System.out.println("Ура! " + year + " год не является високосным");
        }

        System.out.println();

        System.out.println("Задание 4");
        // Ниже вариант выполнения четвертого задания.
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance >= 1 && deliveryDistance <= 20) {
            deliveryTime++;
            System.out.println("Доставка банковской карты возможна в пределах " + deliveryTime + " дня");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime += 2;
            System.out.println("Доставка банковской карты возможна в пределах " + deliveryTime + " дней");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 3;
            System.out.println("Доставка банковской карты возможна в пределах " + deliveryTime + " дней");
        } else {
            System.out.println("Извините доставка товара не производится");
        }


        System.out.println();

        System.out.println("Задание 5");
        // Ниже выполнение пятого задания.
        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Сезон неизвестен на планете - Земля");
        }
    }
}



