package codegym.vn.repository;

import codegym.vn.bean.Song;

import java.util.List;

public interface ISongRepository {
    List<Song> showAll();
    void upload(Song song);
    void update(Song song);
    void delete(int id);
}
