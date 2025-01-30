package hw2;

public class Main {
    public static void main(String[] args) {
        // Змінні для замовлень
        String client1 = "Alice";
        String product1 = "smartphone";
        double price1 = 305.99;
        String address1 = "Moon Street, 10";

        String client2 = "Tom";
        String product2 = "laptop";
        double price2 = 570.95;
        String address2 = "Terra Street, 17";

        // Виведення інформації про перше замовлення
        System.out.println("Order No 1 Client: " + client1 + ".");
        System.out.println("Product: " + product1 + ",");
        System.out.println("price EUR " + price1 + ".");
        System.out.println("Address: " + address1 + ".");

        // Виведення інформації про друге замовлення
        System.out.println("Order No 2 Client: " + client2 + ".");
        System.out.println("Product: " + product2 + ",");
        System.out.println("price EUR " + price2 + ".");
        System.out.println("Address: " + address2 + ".");
    }
}