package Decorator_Pattern;

public class CashbackDecorator extends PaymentDecorator{
    public CashbackDecorator(Payment payment){
        super(payment);
    }
    @Override
    public void pay(double amount) {

        payment.pay(amount);

        System.out.println("Cashback Earned: ₹50");
    }

}
