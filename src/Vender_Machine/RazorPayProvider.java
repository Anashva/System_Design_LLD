package Vender_Machine;

public class RazorPayProvider implements PaymentProvider{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing rs."+amount+" using razorpay");
    }
}
