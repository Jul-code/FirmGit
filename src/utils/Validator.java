package utils;

import java.util.Scanner;

public class Validator {
    // Валидация ввода имени
    public static String validateName(Scanner scanner, String job) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("Пусто! Введите имя " + job + ": ");//добавлен
            // параметр "job" в метод, чтобы использовать один
            // метод для продавца и клиента одновременно
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static double validatePriceInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите цену!: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print("Неверное значение! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите цену!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }

    // Валидация ввода количества часов
    public static int validateHoursInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество часов!: ");
        }
        int hours = scanner.nextInt();
        while (hours <= 0) {
            System.out.print("Неверное значение! Введите количество часов!: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество часов!: ");
            }
            hours = scanner.nextInt();
        }
        return hours;
    }

    //Валидация ввода часовой ставки
    public static double validateHourlyRateInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите часовую ставку!: ");
        }
        double hourlyRate = scanner.nextDouble();
        while (hourlyRate <= 0) {
            System.out.print("Неверное значение! Введите часовую ставку!: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите часовую ставку!: ");
            }
            hourlyRate = scanner.nextDouble();
        }
        return hourlyRate;
    }
}

