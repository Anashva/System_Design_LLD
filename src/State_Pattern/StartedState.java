package State_Pattern;

public class StartedState implements RideState{
    @Override
    public void next(BookRide book) {
        System.out.println("Riding state");
        book.setRide(new RideEnd());
    }
}
