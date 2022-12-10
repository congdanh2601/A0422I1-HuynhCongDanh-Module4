package codegym.vn.service;

import codegym.vn.bean.Song;
import codegym.vn.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    ISongRepository repository;

    @Override
    public List<Song> showAll() {
        return repository.showAll();
    }

    @Override
    public void upload(Song song) {
        repository.upload(song);
    }

    @Override
    public void update(Song song) {
        repository.update(song);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
