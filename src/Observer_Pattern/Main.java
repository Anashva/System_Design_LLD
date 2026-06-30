package Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel=new Channel();
        Subscriber alice=new User("alice");
        Subscriber deepti=new User("deepti");
        Subscriber anashva=new User("anashva");
        Subscriber ayushi=new User("ayushi");
        Subscriber manasvi=new User("manasvi");
        channel.subscribe(alice);
        channel.subscribe(anashva);
        channel.subscribe(deepti);
        channel.subscribe(ayushi);
        channel.subscribe(manasvi);
        channel.getnotify("song of as");

        System.out.println();

        channel.unsubscribe(deepti);
        channel.getnotify("song of shreya");

    }
}
