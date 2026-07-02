package Proxy_Pattern;

public class RealUserServices implements UserServices{
    @Override
    public void getUser(String userId) {
        System.out.println("Fetching user "+userId+" from database");
    }
}
