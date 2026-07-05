package Bridge_Pattern;

public class AdvanceRemote extends RemoteControl{
    public AdvanceRemote(Device device) {

        super(device);

    }

    @Override
    public void pressPower() {

        System.out.println("Advanced Remote");

        device.on();

    }
}
