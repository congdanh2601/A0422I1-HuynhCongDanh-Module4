package com.example.song_validation.controller;

import com.example.song_validation.bean.Song;
import com.example.song_validation.repository.ISongRepository;
import com.example.song_validation.validator.SongValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SongController {
    private ISongRepository repository;
    @Autowired
    public SongController(ISongRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("song", new Song());
        return "index";
    }

    @PostMapping("validate")
    public String validate(@Valid @ModelAttribute("song") Song song, BindingResult bindingResult, Model model) {
        SongValidator validator = new SongValidator();
        validator.validate(song, bindingResult);
        if(bindingResult.hasErrors()) {
            return "index";
        }
        model.addAttribute("mess", "Tất cả thuộc tính đều hợp lệ");
        return "index";
    }
}
