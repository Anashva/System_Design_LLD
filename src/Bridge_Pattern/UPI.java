package Bridge_Pattern;

public class UPI implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount+ " through upi completed");
    }
}
