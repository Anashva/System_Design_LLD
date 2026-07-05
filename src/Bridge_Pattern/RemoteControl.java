package Bridge_Pattern;

public abstract  class RemoteControl {
    protected Device device;
    public RemoteControl(Device device){
        this.device=device;
    }
    public abstract void pressPower();
}
