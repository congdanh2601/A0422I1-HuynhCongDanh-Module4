package codegym.vn.repository;

import codegym.vn.bean.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class CommentRepository implements ICommentRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Comment> findAll() {
        return entityManager.createQuery("select c from Comment as c")
                .getResultList();
    }

    @Override
    public void comment(Comment comment) {
        entityManager.persist(comment);
    }

    @Override
    public void like(int id) {
        entityManager.createQuery("update Comment c set c.like = c.like + 1 where c.id = :id")
                .setParameter("id", id).executeUpdate();
    }
}
