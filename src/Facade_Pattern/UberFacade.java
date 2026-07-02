package Facade_Pattern;

public class UberFacade {
    private DriverService driver;
    private NotificationService notif;
    private PaymentService payment;
    private RideServies ride;
    public UberFacade(){
        driver=new DriverService();
        payment =new PaymentService();
        ride =new RideServies();
        notif=new NotificationService();
    }
    void bookRide(int amount){
        driver.assignDriver();
        payment.payment(amount);
        notif.sendNotification();
        ride.startRide();

    }
}
