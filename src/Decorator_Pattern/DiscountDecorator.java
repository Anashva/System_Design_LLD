package Decorator_Pattern;

public class DiscountDecorator extends PaymentDecorator{
    public DiscountDecorator(Payment payment){
        super(payment);
    }
    @Override
    public void pay(double amount) {

        amount = amount - 100;
        System.out.println("Discount Applied: ₹100");
        payment.pay(amount);
    }
}
