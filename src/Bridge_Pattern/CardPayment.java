package Bridge_Pattern;

public class CardPayment extends Payment{
    public CardPayment(PaymentProvide provider){
        super(provider);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment");

        provider.processpayment(amount);
    }
}
