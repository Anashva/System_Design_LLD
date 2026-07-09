package Vending_Machine;

public interface State {
    void insertMoney(VendingMachine machine,int amount);
    void selectProduct(VendingMachine machine,String code);
    void dispense(VendingMachine machine);
}
