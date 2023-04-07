import java.time.LocalDate;

public class Main {

    public static void determineLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineApplication(int clientOS, int clientDeviceYear) {
        int currentYear;
        currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int deliveryDistance() {
        deliveryDistance(2);
        int day = 0;

        return day;
    }

    public static int  deliveryDistance(int deliveryDistance) {
        int day=0;
        if (deliveryDistance > 100) {
            System.out.println(" Доставка не осуществляется");}
        else if (deliveryDistance<=20) {
            day=day+1;
            System.out.println(day);
        }
        else if
        (deliveryDistance > 20 && deliveryDistance < 60) {
            day=day+2;
            System.out.println(day);
        } else {
            day=day+3;
            System.out.println(day);
        }
        return day;
    }





    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        determineLeapYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        defineApplication(clientOS, clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
        deliveryDistance();

    }




}