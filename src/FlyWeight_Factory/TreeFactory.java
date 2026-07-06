package FlyWeight_Factory;


import java.util.HashMap;
import java.util.Map;

//it will used for common share data of objects
public class TreeFactory {
    private static Map<String ,Tree> treeMap=new HashMap<>();
    public static Tree getTree(String type,String color){
        String key=type+"|"+color;
        if(!treeMap.containsKey(key)){
            treeMap.put(key,new TreeType(type,color));
            System.out.println("creating new tree: "+key);

        }
        return treeMap.get(key);
    }
}
