package codegym.vn.service;

import codegym.vn.bean.Song;

import java.util.List;

public interface ISongService {
    List<Song> showAll();
    void upload(Song song);
    void update(Song song);
    void delete(int id);
}
