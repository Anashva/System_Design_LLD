package Vending_Machine;

public class CardPayment implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        System.out.println("Card Payment : "+amount);
        return true;
    }
}
