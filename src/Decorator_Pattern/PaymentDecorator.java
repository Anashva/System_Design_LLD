package Decorator_Pattern;

abstract class PaymentDecorator implements Payment{
    protected Payment payment;
    public PaymentDecorator(Payment payment){
        this.payment=payment;
    }
}
