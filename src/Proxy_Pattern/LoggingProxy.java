package Proxy_Pattern;

public class LoggingProxy implements UserServices{
    private UserServices services;
    public LoggingProxy(UserServices services){
        this.services=services;
    }

    @Override
    public void getUser(String userId) {
        System.out.println("Logging Request : "+userId);
        services.getUser(userId);
        System.out.println("Logging Completed");
    }
}
