package Singleton_Pattern;

public class Eager_Singleton {
    private Eager_Singleton(){};
    private static final Eager_Singleton INSTANCE=new Eager_Singleton();
    public static Eager_Singleton getInstance(){
        return INSTANCE;
    }

}
