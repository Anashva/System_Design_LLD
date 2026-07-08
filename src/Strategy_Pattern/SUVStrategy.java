package Strategy_Pattern;

public class SUVStrategy implements FareStrategy{
    @Override
    public double calculateFare(int km) {
        return 200+km*20;
    }
}
