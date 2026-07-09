package State_Pattern;

public class BookRide {
    private RideState ride;

    public BookRide() {
        ride = new RequestState();
    }

    public void setRide(RideState ride) {
        this.ride = ride;
    }
    public void next(){
        ride.next(this);
    }
}
