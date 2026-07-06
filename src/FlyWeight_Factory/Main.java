package FlyWeight_Factory;

public class Main {
    public static void main(String[] args) {
        Forest forest=new Forest();
        forest.plantTree(1,2,"Oak","Green");
        forest.plantTree(5,3,"Oak","Green");
        forest.plantTree(10, 6, "Pine", "Dark Green");
        forest.plantTree(7, 8, "Oak", "Green");
    }
}
