package Bridge_Pattern;

public class BasicRemote extends RemoteControl{
    public BasicRemote(Device device){
        super(device);
    }

    @Override
    public void pressPower() {
        device.on();
    }
}
