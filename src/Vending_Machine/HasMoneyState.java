package Vending_Machine;


//it only check balance
public class HasMoneyState implements State{
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        machine.setBalance(machine.getBalance()+amount);
        System.out.println("Balance : "+machine.getBalance());
    }

    @Override
    public void selectProduct(VendingMachine machine, String code) {
        if(!machine.getInventory().isAvailable(code)){
            System.out.println("Product out of stock");
            return;
        }
        Product product=machine.getInventory().getSlot(code).getProduct();
        if(machine.getBalance()<product.getPrice()){
            System.out.println("Insufficient Balance");
            return;
        }
        if(machine.getPayment().pay(product.getPrice())){
            machine.setProduct(product);
            System.out.println(product.getName()+" selected");
            machine.setState(new ProductSelectedState());
        }
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Select product first..");
    }
}
