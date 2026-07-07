package Vender_Machine;

public class StripePayment extends Payment{
    protected PaymentProvider provider;
    public StripePayment(PaymentProvider provider){
        super(provider);
    }
    @Override
    public boolean pay(double amount) {
        System.out.println("Stripe Payment");
        provider.processPayment(amount);
        return true;
    }
}
