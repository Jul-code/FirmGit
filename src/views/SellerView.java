package views;

import models.Seller;
import utils.Validator;
import java.util.Scanner;

public class SellerView {

        Seller model;
        String title;
        String name;
        int quantity;
        double price;
        Scanner scanner;

        // Конструктор
        public SellerView(Seller model) {
            this.model = model;
        }

        // Ввод данных
        public void getInputs() {

            // Создаем экземпляр Scanner
            scanner = new Scanner(System.in);

            // Ввод и валидация данных

            title = "Введите имя продавца: ";
            System.out.print(title);
            name = Validator.validateName(scanner, "продавца");
            model.setName(name);

            title = "Введите количество: ";
            System.out.print(title);
            quantity = Validator.validateQuantityInput(scanner);
            model.setQuantity(quantity);

            title = "Введите цену: ";
            System.out.print(title);
            price = Validator.validatePriceInput(scanner);
            model.setPrice(price);

            title = "Рейт: ";
            System.out.print(title);
            double hourlyRate = Validator.validateHourlyRateInput(scanner);
            model.setHourlyRate(hourlyRate);

            title = "Часы работы: ";
            System.out.print(title);
            int hours = Validator.validateHoursInput(scanner);
            model.setHours(hours);


            // Закрываем Scanner
            scanner.close();
        }

        // Вывод данных
        public void getOutput(String output) {
            System.out.println(output);
        }
}
