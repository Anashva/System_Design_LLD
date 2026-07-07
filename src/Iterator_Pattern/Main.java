package Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> songs=new ArrayList<>();
        songs.add("let me love you");
        songs.add("believer");
        songs.add("perfect");
        songs.add("shape of you");
        Playlist playlist=new Playlist(songs);


        Iterator iterator= playlist.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
