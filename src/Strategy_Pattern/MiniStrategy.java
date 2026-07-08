package Strategy_Pattern;

public class MiniStrategy implements FareStrategy{
    @Override
    public double calculateFare(int km) {
        return 50+km*10;
    }
}
