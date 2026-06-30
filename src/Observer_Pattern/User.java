package Observer_Pattern;

public class User implements Subscriber{
    private String name;
    public User(String name){
        this.name=name;
    }

    @Override
    public void update(String vedio) {
        System.out.println(name+" get notification of new "+vedio);
    }
}
