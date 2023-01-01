package com.example.shopping_cart.controller;

import com.example.shopping_cart.entity.Cart;
import com.example.shopping_cart.entity.Product;
import com.example.shopping_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("cart")
public class ProductController {
    private IProductService service;
    @Autowired
    public ProductController(IProductService service) {
        this.service = service;
    }

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/")
    public String showShop(Model model) {
        model.addAttribute("list", service.findAll());
        return "/shop";
    }

    @GetMapping("/add")
    public String addToCart(@RequestParam Long id, @ModelAttribute("cart") Cart cart, Model model) {
        Product product = service.findById(id);
        cart.addProduct(product);
        model.addAttribute("mess", "Product " + product.getName() + " added to cart");
        model.addAttribute("list", service.findAll());
        return "/shop";
    }

    @GetMapping("/show-add")
    public String add(@RequestParam Long id, @ModelAttribute("cart") Cart cart) {
        Product product = service.findById(id);
        cart.addProduct(product);
        return "redirect:/cart";
    }

    @GetMapping("/decrease")
    public String decrease(@RequestParam Long id, @ModelAttribute("cart") Cart cart) {
        Product product = service.findById(id);
        cart.decreaseProduct(product);
        return "redirect:/cart";
    }

    @GetMapping("cart")
    public String showCart(@ModelAttribute("cart") Cart cart) {
        return "cart";
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam Long id) {
        model.addAttribute("product", service.findById(id));
        return "detail";
    }
}
