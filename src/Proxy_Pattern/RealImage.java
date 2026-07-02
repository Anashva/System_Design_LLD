package Proxy_Pattern;

public class RealImage implements Image{
    private String filename;
    public RealImage(String filename){
        this.filename=filename;
        loadfromDisk();
    }
    private void loadfromDisk(){
        System.out.println("Loading image : "+filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image : "+filename);
    }
}
