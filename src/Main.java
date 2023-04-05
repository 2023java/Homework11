public class Main {

    public static void determineLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineApplication(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void determineDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней:");
            if (deliveryDistance <= 20) {
                System.out.println(" 1");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println(" 2");
            } else {
                System.out.println(" 3");
            }
        }
        if (deliveryDistance > 100) {
            System.out.println(" Доставка не осуществляется");
        }
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
        int deliveryDistance = 101;
        determineDeliveryDays(deliveryDistance);

    }
}