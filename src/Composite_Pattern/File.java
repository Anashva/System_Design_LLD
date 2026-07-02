package Composite_Pattern;

public class File implements FileSystem{
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }

    @Override
    public int getsize() {
        return size;
    }

    @Override
    public void showdetails(String indent) {
        System.out.println(indent+name+" ("+size+" mb)");
    }
}
