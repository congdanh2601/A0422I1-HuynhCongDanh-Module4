package codegym.vn.ex_blog.controller;

import codegym.vn.ex_blog.bean.Blog;
import codegym.vn.ex_blog.bean.Category;
import codegym.vn.ex_blog.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("blog")
public class BlogController {
    private IService blogService;
    private IService categoryService;
    @Autowired
    public BlogController(IService blogService, IService categoryService) {
        this.blogService = blogService;
        this.categoryService = categoryService;
    }

    @GetMapping({"list", ""})
    public String showList(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("list", blogService.findAll());
        model.addAttribute("list2", categoryService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryService.findAll());
        return "create";
    }

    @PostMapping("create")
    public String save(Model model, @ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        model.addAttribute("list", blogService.findAll());
        model.addAttribute("mess", "Blog saved.");
        return "list";
    }

    @GetMapping("update")
    public String save(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "create";
    }

    @GetMapping("detail")
    public String viewDetail(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }

    @GetMapping("delete")
    public String delete(Model model, @RequestParam("id") int id) {
        blogService.delete(id);
        model.addAttribute("mess", "Blog deleted.");
        model.addAttribute("list", blogService.findAll());
        return "list";
    }
}
