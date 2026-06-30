package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements YoutubeChannel{
    private List<Subscriber> subscribers=new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    @Override
    public void getnotify(String vedio) {
        for (Subscriber ss:subscribers){
            ss.update(vedio);
        }
    }
}
