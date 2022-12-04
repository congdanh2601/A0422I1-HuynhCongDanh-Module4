package codegym.vn.service;

import codegym.vn.bean.Song;

import java.util.List;

public interface ISongService {
    List<Song> showAll();
    String update (Song song);
}
