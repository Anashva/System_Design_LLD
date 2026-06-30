package Decorator_Pattern;

public class LogginDecorator extends PaymentDecorator{
    public LogginDecorator(Payment payment){
        super(payment);
    }


    @Override
    public void pay(double amount) {

        System.out.println("Payment Started");

        payment.pay(amount);

        System.out.println("Payment Completed");
    }
}
