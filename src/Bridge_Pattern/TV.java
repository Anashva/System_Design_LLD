package Bridge_Pattern;

public class TV implements Device{
    @Override
    public void on() {
        System.out.println("TV is On");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }
}
