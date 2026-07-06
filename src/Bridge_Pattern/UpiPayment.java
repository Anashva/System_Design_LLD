package Bridge_Pattern;

public class UpiPayment extends Payment{
    public UpiPayment(PaymentProvide provider){
        super(provider);
    }

    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment");
        provider.processpayment(amount);
    }
}
