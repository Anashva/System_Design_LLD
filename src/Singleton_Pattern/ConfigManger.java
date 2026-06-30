package Singleton_Pattern;

//problem solve by singleton using creating multiple object
//lazy loading
public class ConfigManger {
    private static ConfigManger instance;
    private ConfigManger(){

    }
    public static ConfigManger getInstance(){
        if(instance==null){
            instance=new ConfigManger();
        }
        return instance;
    }

    public static void main(String[] args) {
        ConfigManger c1=ConfigManger.getInstance();
        ConfigManger c2=ConfigManger.getInstance();
        System.out.println(c1==c2);
    }
}
