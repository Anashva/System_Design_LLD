package Bridge_Pattern;

public class Main {
    public static void main(String[] args) {
        Device tv=new TV();
        RemoteControl remote1=new BasicRemote(tv);
        remote1.pressPower();

        System.out.println();
        Device radio=new Radio();
        RemoteControl remote2=new AdvanceRemote(radio);
        remote2.pressPower();
    }
}
