package Factory_Pattern;


//concrete product
public class VegBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("veg burger preparing");
    }
}
