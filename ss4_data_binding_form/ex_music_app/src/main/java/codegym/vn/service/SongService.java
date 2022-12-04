package codegym.vn.service;

import codegym.vn.bean.Song;
import codegym.vn.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    private final String PATH_REGEX = "^.*\\.(mp3|wav|ogg|m4p)$";
    @Autowired
    ISongRepository repository;

    @Override
    public List<Song> showAll() {
        return repository.showAll();
    }

    @Override
    public String update(Song song) {
        String mess;
        if(song.getPath().matches(PATH_REGEX)) {
            repository.upload(song);
            mess = "Song Uploaded.";
        } else {
            mess = "Only accept file with these extension: .mp3, .wav, .ogg, .m4p.";
        }
        return mess;
    }
}
