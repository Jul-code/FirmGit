package base;

public interface Sale {

    double calculateSale(int quantity, double price);
    double calculateTax(double sale);
}
