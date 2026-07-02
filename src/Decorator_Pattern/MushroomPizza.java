package Decorator_Pattern;

public class MushroomPizza extends PizzaDecorator{
    public MushroomPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" "+"mushroom";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+70;
    }
}
