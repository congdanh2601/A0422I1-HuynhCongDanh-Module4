package codegym.vn.controller;

import codegym.vn.bean.Song;
import codegym.vn.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    @Autowired
    ISongService service;

    @GetMapping("list")
    public String showList(Model model) {
        model.addAttribute("list", service.showAll());
        return "list";
    }

    @GetMapping("upload")
    public String showFormUpload(Model model) {
        model.addAttribute("song", new Song());
        return "upload";
    }

    @PostMapping("upload")
    public String saveUpload(Model model, Song song) {
        model.addAttribute("mess", service.update(song));
        model.addAttribute("list", service.showAll());
        return "list";
    }
}
