package Vender_Machine;



public abstract class Payment {
    protected PaymentProvider provider;
    public Payment(PaymentProvider provider){
        this.provider=provider;
    }
    public abstract boolean pay(double amount);
}
