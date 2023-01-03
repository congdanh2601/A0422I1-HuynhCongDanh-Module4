package codegym.vn.ex_blog.service;

import codegym.vn.ex_blog.bean.Blog;

import java.util.List;

public interface IService<E> {
    void save(E e);
    List<E> findAll();
    void delete(int id);
    E findById(int id);
    List<E> findAllByCategory_Id(int id);
}
