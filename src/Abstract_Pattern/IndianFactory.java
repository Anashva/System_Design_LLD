package Abstract_Pattern;

public class IndianFactory implements UberFactory{
    public Payment createPayment(){

        return new UPI();
    }

    public Notification createNotification(){

        return new SMSNotif();
    }

    public Invoice createInvoice(){

        return new RupeeInvoice();
    }
}
