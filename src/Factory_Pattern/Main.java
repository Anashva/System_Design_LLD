package Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        BurgerFactory factory=new VegBburgerFactory();
        Burger burger=factory.createBurger();
        burger.prepare();
        System.out.println();
        RestaurantFactory factory1=new IndianFactory();
        Food food=factory1.createFood();
        Drink drink=factory1.createDrink();
        food.serve();
        drink.serve();
    }
}
