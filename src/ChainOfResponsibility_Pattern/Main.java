package ChainOfResponsibility_Pattern;

public class Main {
    public static void main(String[] args) {
        Handler auth=new AuthenticationHandler();
        Handler authorize=new AuthorizationHandler();
        Handler logging=new LoggingHandler();
        Handler controller=new ControllerHandler();
        auth.setNext(authorize);
        authorize.setNext(logging);
        logging.setNext(controller);
        Request request=new Request(true,true);
        auth.handle(request);

    }
}
