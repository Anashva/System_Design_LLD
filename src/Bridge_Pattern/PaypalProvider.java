package Bridge_Pattern;

public class PaypalProvider  implements PaymentProvide{
    @Override
    public void processpayment(double amount) {
        System.out.println("processing rs"+amount+" using paypal");
    }
}
