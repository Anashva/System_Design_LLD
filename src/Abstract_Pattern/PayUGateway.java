package Abstract_Pattern;

public class PayUGateway implements PaymentGateway {
    @Override
    public void process(double amount) {
        System.out.println("payu "+amount);
    }
}
