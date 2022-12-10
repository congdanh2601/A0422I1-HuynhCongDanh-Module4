package codegym.vn.ex_blog.repository;

import codegym.vn.ex_blog.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

}
