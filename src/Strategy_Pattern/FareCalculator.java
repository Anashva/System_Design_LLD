package Strategy_Pattern;

public class FareCalculator {
    private FareStrategy strategy;//context depend on abstraction not on particular class
    public FareCalculator(FareStrategy strategy){
        this.strategy=strategy;
    }

    public double calculator(int km){
        return strategy.calculateFare(km);
    }
}
