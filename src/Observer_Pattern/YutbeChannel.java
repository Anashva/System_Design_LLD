package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class YutbeChannel implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private String latestVideo;



    @Override
    public void subscribe(
            Observer observer) {

        observers.add(observer);

    }

    @Override
    public void unsubscribe(
            Observer observer) {

        observers.remove(observer);

    }



    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {

            observer.update(latestVideo);

        }

    }

    public void uploadVideo(
            String videoTitle) {

        latestVideo = videoTitle;

        System.out.println("Uploaded : " + videoTitle);
        notifyObservers();

    }

    public static void main(String[] args) {
        YutbeChannel c1=new YutbeChannel();
        Observer alice = new Subsribers("Alice");
        Observer bob = new Subsribers("Bob");
        Observer charlie = new Subsribers("Charlie");

        c1.subscribe(alice);
        c1.subscribe(bob);
        c1.subscribe(charlie);
        c1.uploadVideo("Observer Pattern Explained");
    }
}
