package Vending_Machine;

public class ProductFactory {
    public static Product createProduct(String code,String name,int price){
        return new Product(code, name,price);
    }
}
