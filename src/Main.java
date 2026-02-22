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
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для " + (clientOS == 0 ? "iOS" : "Android") + " по ссылке:");
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
        int deliveryDistanse = 95;
        if (deliveryDistanse <= 20) {
            int deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistanse > 20 && deliveryDistanse <= 60) {
            int deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistanse > 60 && deliveryDistanse <= 100) {
            int deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется.");
        }
    }
}