package State_Pattern;

public class CompletedState implements RideState {

    @Override
    public void next(BookRide book) {

        System.out.println("Ride already completed.");

    }
}