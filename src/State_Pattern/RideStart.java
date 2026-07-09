package State_Pattern;

public class RideStart implements RideState{
    @Override
    public void next(BookRide book) {
        System.out.println("Ride started");
        book.setRide(new StartedState());
    }
}
