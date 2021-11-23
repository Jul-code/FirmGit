package models;

import base.Salary;
import base.Sale;

public class Seller implements Salary, Sale {

    // Model.
// Применение интерфейсов.

    private String name;
    private int hours;
    private double hourlyRate;
    private int quantity;
    private double price;
    private final static int TAX_RATE = 15;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Расчёт суммы зарплаты.
    @Override
    public double calculateSalary(int hours, double hourlyRate) {
        return hours * hourlyRate;
    }

    // Расчёт платежа, без учета налога.
    @Override
    public double calculateSale(int quantity, double price) {
        return quantity * price;
    }

    // Расчёт налога.
    @Override
    public double calculateTax(double sale) {
        return sale * TAX_RATE / 100;
    }
}
