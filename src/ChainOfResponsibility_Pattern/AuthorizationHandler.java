package ChainOfResponsibility_Pattern;

public class AuthorizationHandler extends Handler{
    @Override
    public void handle(Request request) {
        if(!request.isAuthorized()){
            System.out.println("Authorization Failed");
            return;
        }

        System.out.println("Authorization Success");

        if(next!=null){
            next.handle(request);

        }
    }
}
