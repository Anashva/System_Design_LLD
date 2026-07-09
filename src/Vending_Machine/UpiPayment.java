package Vending_Machine;

public class UpiPayment implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        System.out.println("UPI payment : "+amount);
        return true;
    }
}
