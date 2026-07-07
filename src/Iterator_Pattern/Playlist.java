package Iterator_Pattern;

import java.util.List;

public class Playlist implements Collection{
    private List<String> songs;
    public Playlist(List<String> songs){
        this.songs=songs;
    }

    @Override
    public Iterator createIterator() {
        return new PlayListIterator(songs);
    }
}
