package Bridge_Pattern;

public class RazorPayProvide implements PaymentProvide{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing rs."+amount+" using razorpay");
    }
}
