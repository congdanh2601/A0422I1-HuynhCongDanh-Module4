package codegym.vn.ex_blog.controller;

import codegym.vn.ex_blog.bean.Blog;
import codegym.vn.ex_blog.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class BlogController {
    @Autowired
    IService service;

    @GetMapping({"list", ""})
    public String showList(Model model) {
        model.addAttribute("list", service.findAll());
        return "list";
    }

    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("create")
    public String save(Model model, @ModelAttribute("blog") Blog blog) {
        service.save(blog);
        model.addAttribute("list", service.findAll());
        model.addAttribute("mess", "Blog saved.");
        return "list";
    }

    @GetMapping("update")
    public String save(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", service.findById(id));
        return "create";
    }

    @GetMapping("detail")
    public String viewDetail(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", service.findById(id));
        return "detail";
    }

    @GetMapping("delete")
    public String delete(Model model, @RequestParam("id") int id) {
        service.delete(id);
        model.addAttribute("mess", "Blog deleted.");
        model.addAttribute("list", service.findAll());
        return "list";
    }
}
