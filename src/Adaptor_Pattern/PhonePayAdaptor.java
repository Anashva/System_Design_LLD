package Adaptor_Pattern;

public class PhonePayAdaptor implements Payment{

    PhonePay phonePay;
    public PhonePayAdaptor(){
        phonePay=new PhonePay();
    }

    public void pay(double amount){
        phonePay.payment(amount);
    }
}
