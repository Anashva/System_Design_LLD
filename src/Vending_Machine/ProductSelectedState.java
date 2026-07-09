package Vending_Machine;

public class ProductSelectedState implements State{
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        System.out.println("product already selected");

    }

    @Override
    public void selectProduct(VendingMachine machine, String code) {
        System.out.println("product alreasy selected..");
    }

    @Override
    public void dispense(VendingMachine machine) {
        machine.setState(new DispensingState());
        machine.dispense();
    }
}
