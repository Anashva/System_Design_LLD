package ChainOfResponsibility_Pattern;

public class AuthenticationHandler extends Handler{
    @Override
    public void handle(Request request) {
        if(!request.isAuthenticated()){
            System.out.println("Authentication failed");
            return;
        }
        System.out.println("Authentication success");
        if(next!=null){
            next.handle(request);
        }
    }
}
