package codegym.vn.ex_blog.controller;

import codegym.vn.ex_blog.bean.Category;
import codegym.vn.ex_blog.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("category")
public class CategoryController {
    private IService categoryService;
    @Autowired
    public CategoryController(IService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("create")
    public String createCategory(@RequestParam("name") String name) {
        int size = categoryService.findAll().size();
        categoryService.save(new Category(size + 1, name));
        return "redirect:/blog/list";
    }

    @PostMapping("update")
    public String update(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        return "redirect:/blog/list";
    }

    @GetMapping("delete")
    public String delete(@RequestParam("id") int id) {
        categoryService.delete(id);
        return "redirect:/blog/list";
    }
}
