package State_Pattern;

public class RequestState implements RideState{
    @Override
    public void next(BookRide book) {
        System.out.println("Ride Request");
        book.setRide(new DriverState());
    }
}
