package Vending_Machine;

public class DispensingState implements State{
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        System.out.println("Please Wait...");
    }

    @Override
    public void selectProduct(VendingMachine machine, String code) {
        System.out.println("Dispensing Product...");
    }

    @Override
    public void dispense(VendingMachine machine) {
        Product product=machine.getProduct();
        Slot slot=machine.getInventory().getSlot(product.getCode());
        slot.removeQuantity();

        int change=machine.getBalance()-product.getPrice();
        System.out.println("Dispensed : "+product.getName());

        System.out.println("Change returned : "+change);

        machine.setBalance(0);
        machine.setState(new IdleState());
        machine.setProduct(null);
    }
}
