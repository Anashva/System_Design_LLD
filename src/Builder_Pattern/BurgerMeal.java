package Builder_Pattern;

public class BurgerMeal {
    private String buntype;
    private String patty;
    private boolean cheese;
    private String drink;

    private BurgerMeal(BurgerBuilder builder){//only burger class can create object
        this.buntype=builder.buntype;
        this.cheese= builder.cheese;
        this.drink= builder.drink;
        this.patty=builder.patty;
    }
    public static class BurgerBuilder{
        private String buntype;
        private String patty;
        private boolean cheese;
        private String drink;

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;//returning burgerbuilder class
        }
// we are retuning object as due to method chaining as all method have same object
        public BurgerBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public BurgerBuilder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder setBuntype(String buntype) {
            this.buntype = buntype;
            return this;
        }
        public BurgerMeal build(){
            return new BurgerMeal(this);//object of outer class
        }

    }

    public static void main(String[] args) {
        BurgerMeal meal=new BurgerMeal.BurgerBuilder().setDrink("cold-drink").build();
        System.out.println(meal.drink);
    }
}
