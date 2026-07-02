package Adaptor_Pattern;

public class PayPalAdaptor implements Payment{
    PayPalGateway paypal;
    public PayPalAdaptor(){
        paypal=new PayPalGateway();
    }

    public void pay(double amount){

        paypal.makepayment(amount);
    }
}
