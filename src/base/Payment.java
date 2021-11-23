package base;

public interface Payment {

    double calculatePayment(int quota, double price);

    double calculatePaymentWithDiscount(double payment, double discount);

}
