package Factory_Pattern;

public class ChikenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing chiken burger");
    }
}
