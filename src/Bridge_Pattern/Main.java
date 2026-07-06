package Bridge_Pattern;

public class Main {
    public static void main(String[] args) {
//        Device tv=new TV();
//        RemoteControl remote1=new BasicRemote(tv);
//        remote1.pressPower();
//
//        System.out.println();
//        Device radio=new Radio();
//        RemoteControl remote2=new AdvanceRemote(radio);
//        remote2.pressPower();


        Payment p1=new CardPayment(new PaypalProvider());
        p1.pay(5000);
        System.out.println();
        Payment p2=new UpiPayment(new StripeProvider());// upi does'nt inherit stripe  as it has stripe-composiotn
        p2.pay(6000);
    }
}
