package Bridge_Pattern;

public class Radio implements Device{

    @Override
    public void on() {
        System.out.println("Radio is On");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }
}
