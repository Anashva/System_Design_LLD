package Iterator_Pattern;

import java.util.*;

public class PlayListIterator implements Iterator{
    private List<String> songs;
    private int index=0;
    public PlayListIterator(List<String> songs){
        this.songs=songs;
    }

    @Override
    public boolean hasNext() {
        return index<songs.size();
    }

    @Override
    public Object next() {
        return songs.get(index++);
    }
}
