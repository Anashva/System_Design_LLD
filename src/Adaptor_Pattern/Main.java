package Adaptor_Pattern;

public class Main {
    public static void main(String[] args) {
        Payment p1=new PayPalAdaptor();
        p1.pay(2002);
        Payment p2=new PhonePayAdaptor();
        p2.pay(234);
    }
}
