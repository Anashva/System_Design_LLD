package Factory_Pattern;


public class Pizza implements Food {

    @Override
    public void serve() {
        System.out.println("Serving Pizza");
    }
}