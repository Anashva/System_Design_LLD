package Factory_Pattern;

public class VegBburgerFactory extends BurgerFactory{
    public Burger createBurger(){
        return new VegBurger();
    }
}
