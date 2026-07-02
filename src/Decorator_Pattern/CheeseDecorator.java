package Decorator_Pattern;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza  pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" "+"cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+50;
    }
}
