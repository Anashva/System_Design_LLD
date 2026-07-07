package Vender_Machine;


public class UpiPayment extends Payment{
    public UpiPayment(PaymentProvider provider){

        super(provider);
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("UPI Payment");
        provider.processPayment(amount);
        return true;
    }
}
