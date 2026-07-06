package FlyWeight_Factory;

public class TreeType implements Tree{
    private String type;
    private String color;
    public TreeType(String type,String color){
        this.color=color;
        this.type=type;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + type + " tree of color " + color + " at (" + x + ", " + y + ")");
    }
}
