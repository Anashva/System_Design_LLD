package Vending_Machine;

public class Product {
    private String code;
    private String name;
    private int price;
    public Product(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
