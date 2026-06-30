package Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        Payment p=new LogginDecorator(
                new CashbackDecorator(
                        new DiscountDecorator(
                                new CreditCardPayment()
                        )
                )
        );
        p.pay(100);
    }
}
