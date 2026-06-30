package Factory_Pattern;

public class WhatasppNotification implements Notification{
    @Override
    public void sendnotification() {
        System.out.println("send whastapp notification");
    }
}
