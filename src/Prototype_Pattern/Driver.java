package Prototype_Pattern;

public class Driver implements Cloneable{
    private String name;
    private String vehicle;
    private double rating;
    public Driver(String name,String vehicle,double rating){
        this.name=name;
        this.rating=rating;
        this.vehicle=vehicle;
    }

    public void setName(String name){
        this.name=name;
    }

    public Driver clone(){
        try{
            return (Driver) super.clone();//create another object with same field values
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public String toString(){
        return name+" " +vehicle+" " +rating;
    }

    public static void main(String[] args) {
        Driver original =new Driver("Rahul","Swift",4.9);
        Driver copy=original.clone();
        copy.setName("Amit");
        System.out.println(original);
        System.out.println(copy);
    }
}

// super.clone() -provide new memory ,copy all fields values, return new object
