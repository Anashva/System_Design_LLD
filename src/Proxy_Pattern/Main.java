package Proxy_Pattern;

public class Main {
    public static void main(String[] args) {
//        Image image=new ImageProxy("Vacation.jpg");
//        System.out.println("Object Created");
//        image.display();
//        image.display();

        UserServices services=new AuthenticationProxy(new LoggingProxy(new CacheProxy(new RealUserServices())));
        services.getUser("101");
        System.out.println();
        services.getUser("101");
    }
}
