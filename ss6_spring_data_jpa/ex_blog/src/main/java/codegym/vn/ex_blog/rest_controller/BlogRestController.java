package codegym.vn.ex_blog.rest_controller;

import codegym.vn.ex_blog.bean.Blog;
import codegym.vn.ex_blog.bean.Category;
import codegym.vn.ex_blog.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class BlogRestController {
    private IService blogService;
    private IService categoryService;

    @Autowired
    public BlogRestController(IService blogService, IService categoryService) {
        this.blogService = blogService;
        this.categoryService = categoryService;
    }

    @GetMapping("categories")
    public ResponseEntity<List<Category>> getCategories() {
        return new ResponseEntity<List<Category>>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("blogs")
    public ResponseEntity<List<Blog>> getBlogs() {
        return new ResponseEntity<List<Blog>>(blogService.findAll(), HttpStatus.OK);
    }

    @GetMapping("categories/{id}")
    public ResponseEntity<List<Blog>> getBlogsInCategory (@PathVariable int id) {
        Category category = (Category) categoryService.findById(id);
        if(category == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        List<Blog> blogs = blogService.findAllByCategory_Id(id);
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/blogs/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable int id) {
        return new ResponseEntity<>((Blog) blogService.findById(id), HttpStatus.OK);
    }
}
