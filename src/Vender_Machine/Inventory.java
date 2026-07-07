package Vender_Machine;

import java.util.HashMap;


public class Inventory {
    protected HashMap<Integer,Product> slots;
    public Inventory(){
        slots = new HashMap<>();
    }
    void addProduct(Product product){
        int slotId = slots.size()+1;
        slots.put(slotId,product);

    }

    boolean checkAvailability(int slotId){
        if(!slots.containsKey(slotId)){
            return false;
        }
        Product product=slots.get(slotId);
        return product.quantity>0;
    }


    Product getProduct(int slotId){
        return slots.get(slotId);
    }



    void removeProduct(int slotId){
        Product product=slots.get(slotId);
        if(product == null){
            System.out.println("Invalid Slot");
            return;

        }

        product.quantity--;
        if(product.getQuantity()==0){
            System.out.println(product.getProductName()+ " is out of stock");

        }
    }
    public void displayInventory(){
        System.out.println("\n------ Inventory ------");

        for(Integer slotId : slots.keySet()) {
            System.out.print("Slot " + slotId + " : ");
            slots.get(slotId).print();

        }


    }

}