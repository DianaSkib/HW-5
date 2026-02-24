//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// #1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        ///#2
        clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для " + (clientOs == 0 ? "iOS" : "Android") + " по ссылке:");
        }
        /// #3
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не является високосным.");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        /// #4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            int deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется.");
        }

        /// #5
        int monthNumber = 12;
        switch (monthNumber) {
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
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}