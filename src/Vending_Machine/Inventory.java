package Vending_Machine;

import java.util.HashMap;

public class Inventory {
    private HashMap<String,Slot> slots;
    public Inventory(){
        slots=new HashMap<>();
    }

    public void addSlot(String code,Slot slot){

        slots.put(code,slot);
    }

    public Slot getSlot(String code){

        return slots.get(code);

    }

    public boolean isAvailable(String code){
        Slot slot=slots.get(code);
        return slot!=null && slot.isAvailable();
    }
}
