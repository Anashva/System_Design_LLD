package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    private String name;
    private List<FileSystem> files;
    public Folder(String name){
        this.name=name;
        files=new ArrayList<>();
    }

    void add(FileSystem file){
        files.add(file);
    }

    void remove(FileSystem file){
        files.remove(file);
    }


    @Override
    public int getsize() {
        int total=0;
        for (FileSystem fs:files){
            total+=fs.getsize();
        }
        return total;
    }

    @Override
    public void showdetails(String indent) {
        System.out.println(indent+"[Folder] "+name);
        for (FileSystem fs:files){
            fs.showdetails(indent+"  ");
        }
    }
}
