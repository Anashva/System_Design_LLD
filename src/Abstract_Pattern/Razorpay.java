package Abstract_Pattern;

public class Razorpay implements PaymentGateway{
    @Override
    public void process(double amount) {
        System.out.println("prcoess oayment through razorpay "+amount);
    }
}
