package codegym.vn.repository;

import codegym.vn.bean.Song;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class SongRepository implements ISongRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Song> showAll() {
        return entityManager.createQuery("select s from Song s").getResultList();
    }

    @Override
    public void upload(Song song) {
        entityManager.persist(song);
    }

    @Override
    public void update(Song song) {
        entityManager.merge(song);
    }

    @Override
    public void delete(int id) {
        entityManager.createQuery("delete from Song s where s.id = :id").setParameter("id", id).executeUpdate();
    }
}
