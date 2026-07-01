package Factory_Pattern;

public class IndianFactory implements RestaurantFactory{
    @Override
    public Drink createDrink() {
        return new Lassi();
    }

    @Override
    public Food createFood() {
        return new Dal();
    }
}
