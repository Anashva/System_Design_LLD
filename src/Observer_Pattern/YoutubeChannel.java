package Observer_Pattern;

public interface YoutubeChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void getnotify(String vedio);
}
