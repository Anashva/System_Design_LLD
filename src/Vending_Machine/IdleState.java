package Vending_Machine;

public class IdleState implements State{
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        machine.setBalance(machine.getBalance()+amount);
        System.out.println("Money inserted : "+amount);
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine, String code) {
        System.out.println("insert money first..;");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("No Product Selected");
    }
}
