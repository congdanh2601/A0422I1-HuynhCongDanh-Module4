package codegym.vn.repository;

import codegym.vn.bean.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository implements ISongRepository {
    private static List<Song> songList;
    static {
        songList = new ArrayList<>();
        songList.add(new Song("Tự Tình 2", "Trung Quân Idol", "V-Pop", "Tu-Tinh-2.mp3"));
        songList.add(new Song("Lucifer", "SHINee", "K-Pop", "Lucifer.wav"));
        songList.add(new Song("As Long As You Love Me", "Justin Bieber", "US-UK", "As-Long-As-You-Love-Me.ogg"));
    }

    @Override
    public List<Song> showAll() {
        return songList;
    }

    @Override
    public void upload(Song song) {
        songList.add(song);
    }
}
