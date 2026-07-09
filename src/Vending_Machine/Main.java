package Vending_Machine;

public class Main {

    public static void main(String[] args) {

        Product coke = ProductFactory.createProduct("A1","Coke",40);
        Product pepsi = ProductFactory.createProduct("A2","Pepsi",35);
        Product chips = ProductFactory.createProduct("B1","Chips",20);
        Product biscuit = ProductFactory.createProduct("B2","Biscuit",15);


        Slot slot1 = new Slot(coke,5);
        Slot slot2 = new Slot(pepsi,4);
        Slot slot3 = new Slot(chips,8);
        Slot slot4 = new Slot(biscuit,10);

        VendingMachine machine = new VendingMachine();

        machine.getInventory().addSlot("A1",slot1);
        machine.getInventory().addSlot("A2",slot2);
        machine.getInventory().addSlot("B1",slot3);
        machine.getInventory().addSlot("B2",slot4);

        machine.setPayment(new UpiPayment());
        machine.insertMoney(50);
        machine.selectProduct("A1");
        machine.dispense();

    }

}