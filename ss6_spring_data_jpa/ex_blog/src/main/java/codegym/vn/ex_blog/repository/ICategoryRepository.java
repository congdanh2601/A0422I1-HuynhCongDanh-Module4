package codegym.vn.ex_blog.repository;

import codegym.vn.ex_blog.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, String> {
}
