package Vending_Machine;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    private  PaymentStrategy payment;
    private Product product;
    private int balance;
    public VendingMachine(){
        inventory=new Inventory();
        state=new IdleState();
    }

//    state will slect its next state accoding to behaivor
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    //    customer will choose pyment later so we will not make constructor of it
    public void setPayment(PaymentStrategy payment) {
        this.payment = payment;
    }
    public PaymentStrategy getPayment(){
        return payment;
    }

//    idle state need monen to insert
    public int getBalance() {
        return balance;
    }

//    dispense will set the balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

//    its crrated once ,never replaced
    public Inventory getInventory() {
        return inventory;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product=product;
    }


    public void insertMoney(int amount){
        state.insertMoney(this,amount);
    }

    public void selectProduct(String code){
        state.selectProduct(this,code);
    }

    public void dispense(){
        state.dispense(this);
    }
}
