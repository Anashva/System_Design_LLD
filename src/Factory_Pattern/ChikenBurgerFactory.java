package Factory_Pattern;

public class ChikenBurgerFactory extends BurgerFactory{
    public Burger createBurger(){
        return new ChikenBurger();
    }
}
