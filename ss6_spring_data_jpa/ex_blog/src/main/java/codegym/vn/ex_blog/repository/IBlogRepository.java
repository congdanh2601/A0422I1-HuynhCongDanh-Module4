package codegym.vn.ex_blog.repository;

import codegym.vn.ex_blog.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

}
