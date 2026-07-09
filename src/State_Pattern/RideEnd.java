package State_Pattern;

public class RideEnd implements RideState{
    @Override
    public void next(BookRide book) {
        System.out.println("Ride will be completing in min");
        book.setRide(new CompletedState());
    }
}
