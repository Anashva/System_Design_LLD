package Strategy_Pattern;

public class SedanStrategy implements FareStrategy{
    @Override
    public double calculateFare(int km) {
        return 50+15*km;
    }
}
