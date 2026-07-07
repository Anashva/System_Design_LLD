package Vender_Machine;

public class PaypalProvider implements PaymentProvider{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing rs."+amount+" using paypal");
    }
}
