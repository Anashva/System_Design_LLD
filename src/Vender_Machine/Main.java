package Vender_Machine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product coke = new Product("Coke", 40, 10);
        Product pepsi = new Product("Pepsi", 35, 5);
        Product chips = new Product("Chips", 20, 20);

        Inventory inventory = new Inventory();

        inventory.addProduct(coke);
        inventory.addProduct(pepsi);
        inventory.addProduct(chips);

        inventory.displayInventory();

        int selectedSlot = sc.nextInt();

        if (inventory.checkAvailability(selectedSlot)) {

            Product product = inventory.getProduct(selectedSlot);
            product.print();

            double userAmount = 50;

            Payment payment = new UpiPayment(new PaypalProvider());

            if (userAmount >= product.getPrice()) {

                payment.pay(userAmount);

                System.out.println("Payment Successful");

                inventory.removeProduct(selectedSlot);

                System.out.println("Dispensing " + product.getProductName());

                double change = userAmount - product.getPrice();

                if (change > 0)
                    System.out.println("Return Change : " + change);

            }
            else {

                System.out.println("Insufficient Amount");
                System.out.println("Refund : " + userAmount);

            }

        }
        else {

            System.out.println("Product Not Available");

        }

        inventory.displayInventory();
    }
}