package Factory_Pattern;

public class Dal implements Food{
    @Override
    public void serve() {
        System.out.println("serving dal ");
    }
}
