package Observer_Pattern;

public class Subsribers implements Observer{
    private  String name;
    public Subsribers(String name){
        this.name=name;
    }

    @Override
    public void update(String vediotitle) {
        System.out.println(name+" recieved notification "+vediotitle);
    }
}
