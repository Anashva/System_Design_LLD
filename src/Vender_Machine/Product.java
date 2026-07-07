package Vender_Machine;

public class Product {
    protected String product_name;
    protected int quantity;
    protected double price;
    public Product(String product_name, double price, int quantity) {

        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;

    }
    public String getProductName() {
        return product_name;
    }


    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

    void print(){
        System.out.println(this.product_name+" ->"+this.quantity+" "+this.price);
    }
}
