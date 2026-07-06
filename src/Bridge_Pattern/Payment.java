package Bridge_Pattern;

//All payment types share the same PaymentProvider field and constructor. Keeping them in an abstract class avoids code duplication and provides a common base implementation. If there were no shared state or behavior, I would prefer an interface
public abstract class Payment {
    protected PaymentProvide provider;
    public Payment(PaymentProvide provider){
        this.provider=provider;
    }
    public abstract void pay(double amount);
}
