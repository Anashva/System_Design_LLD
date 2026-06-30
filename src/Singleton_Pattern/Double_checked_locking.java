package Singleton_Pattern;

public class Double_checked_locking {
    private static volatile Double_checked_locking instance;
    private Double_checked_locking(){};
    public static Double_checked_locking getInstance(){
        if(instance==null){
            synchronized (Double_checked_locking.class){
                if (instance==null){
                    instance=new Double_checked_locking();
                }
            }
        }
        return instance;
    }
}
