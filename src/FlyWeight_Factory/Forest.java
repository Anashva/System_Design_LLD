package FlyWeight_Factory;

import java.util.*;
import java.util.Arrays;

public class Forest {
    private List<Tree> trees=new ArrayList<>();
    public void plantTree(int x,int y,String type,String color){
        Tree tree=TreeFactory.getTree(type,color);// it will return treetype
        trees.add(tree);
        tree.draw(x,y);
    }
}
