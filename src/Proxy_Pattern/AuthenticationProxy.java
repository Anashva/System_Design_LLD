package Proxy_Pattern;

public class AuthenticationProxy implements UserServices{
    private UserServices service;//it doest not know next object simple forward request
    public AuthenticationProxy(UserServices service){
        this.service=service;
    }

    @Override
    public void getUser(String userId) {
        System.out.println("Checking JWT Token..");

        boolean authenticated=true;
        if(!authenticated){
            System.out.println("Authentication failed");

            return;
        }
        service.getUser(userId);
    }
}
