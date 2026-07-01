package Abstract_Pattern;

public class Main {
    public static void main(String[] args) {
        UberFactory factory=new IndianFactory();
        Payment payment=factory.createPayment();
        Invoice invoice=factory.createInvoice();
        Notification notify=factory.createNotification();
        payment.pay();
        invoice.generateInvoice();
        notify.send();

    }
}
