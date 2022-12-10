package codegym.vn.ex_blog.service;

import codegym.vn.ex_blog.bean.Blog;

import java.util.List;

public interface IBlogService {
    void save(Blog blog);
    List<Blog> findAll();
    void delete(int id);
    Blog findById(int id);
}
