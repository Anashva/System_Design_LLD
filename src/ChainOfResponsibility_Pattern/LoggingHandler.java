package ChainOfResponsibility_Pattern;

public class LoggingHandler extends Handler{
    @Override
    public void handle(Request request) {
        System.out.println("Logging Request");
        if(next!=null){
//            System.out.println(request);
            next.handle(request);
        }
    }
}
