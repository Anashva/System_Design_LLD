package ChainOfResponsibility_Pattern;

public class ControllerHandler extends Handler{
    @Override
    public void handle(Request request) {
        System.out.println("Controller Executed");
    }
}
