package com.example.ex_form_validation.controller;

import com.example.ex_form_validation.bean.User;
import com.example.ex_form_validation.service.IService;
import com.example.ex_form_validation.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    private IService<User> service;

    @Autowired
    public UserController(IService<User> service) {
        this.service = service;
    }

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("save")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult result) {
        UserValidator validator = new UserValidator();
        validator.validate(user, result);
        if (result.hasErrors()) {
            return "index";
        }
            service.save(user);
            return "result";
    }
}
