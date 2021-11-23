import controllers.ClientController;
import controllers.SellerController;
import models.Client;
import models.Seller;
import views.ClientView;
import views.SellerView;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        ClientView clientView = new ClientView(client);
        ClientController clientController = new ClientController(client, clientView);

        Seller seller = new Seller();
        SellerView sellerView = new SellerView(seller);
        SellerController sellerController = new SellerController(seller, sellerView);

        // Запуск программы/приложения
//        clientController.runApp();
        sellerController.runApp();
    }
}
