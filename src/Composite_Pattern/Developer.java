package Composite_Pattern;

public class Developer implements Employee{
    private String name;
    public Developer(String name){
        this.name=name;
    }

    @Override
    public void showdetails() {
        System.out.println("developer : "+name);
    }
}
