package State_Pattern;

public class DriverState implements RideState{
    @Override
    public void next(BookRide book) {
        System.out.println("Driver accepts the request");
        book.setRide(new RideStart());
    }
}
