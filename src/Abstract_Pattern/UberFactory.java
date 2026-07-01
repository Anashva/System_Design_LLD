package Abstract_Pattern;

public interface UberFactory {
    Payment createPayment();

    Notification createNotification();

    Invoice createInvoice();
}
