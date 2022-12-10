package codegym.vn.ex_blog.service;

import codegym.vn.ex_blog.bean.Blog;
import codegym.vn.ex_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository repository;

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
//        MX-001
        String stringId = "MX-011";
        return repository.findById(Integer.valueOf(stringId.substring(3))).orElse(null);
    }
}
