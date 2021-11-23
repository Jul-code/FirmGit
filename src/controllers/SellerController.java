package controllers;

import models.Seller;
import utils.Rounder;
import views.SellerView;

public class SellerController {
    Seller model;
    SellerView view;

    public SellerController(Seller model, SellerView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getInputs();

        String name = model.getName();

        double saleInitial = model.calculateSale(model.getQuantity(), model.getPrice());
        String saleInitialRounded = Rounder.roundValue(saleInitial);

        double tax = model.calculateTax(saleInitial);
        String taxRounded = Rounder.roundValue(tax);

        double salary = model.calculateSalary(model.getHours(), model.getHourlyRate());
        String salaryRounded = Rounder.roundValue(salary);

        String output = "------------------------------\n" +
                "Имя продавца: " + name + "\n" +
                "Сумма продаж (грн.): " + saleInitialRounded + "\n" +
                "Сумма налога (грн.): " + taxRounded + "\n" +
                "Зарплата (грн.): " + salaryRounded;

        view.getOutput(output);
    }
}