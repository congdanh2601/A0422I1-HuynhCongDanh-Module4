package codegym.vn.ex_blog.repository;

import codegym.vn.ex_blog.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllByCategory_Id(int id);
    List<Blog> findByName(String name);
}
