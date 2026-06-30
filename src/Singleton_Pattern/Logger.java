package Singleton_Pattern;

public class Logger {
    private Logger(){};
    private static class Holder{
        private static final Logger Instance=new Logger();
    }
    public static Logger getInstance(){
        return Holder.Instance;
    }
    public void log(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Logger.getInstance().log("ride created");
    }
}
