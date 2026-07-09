package ChainOfResponsibility_Pattern;

public class Request {
    private boolean authenticated;
    private boolean authorized;
    public Request(boolean authenticated,boolean authorized){
        this.authenticated=authenticated;
        this.authorized=authorized;
    }
    public boolean isAuthenticated(){
        return authenticated;
    }
    public boolean isAuthorized(){
        return authorized;

    }
}
