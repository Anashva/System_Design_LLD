package Vending_Machine;

public class CashPayment implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        System.out.println("Cash Payment : ?"+amount);
        return true;
    }
}
