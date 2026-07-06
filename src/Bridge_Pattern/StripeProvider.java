package Bridge_Pattern;

public class StripeProvider implements PaymentProvide{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing rs"+amount+" using Stripe");
    }
}
