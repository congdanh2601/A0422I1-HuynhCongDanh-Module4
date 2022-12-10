package codegym.vn.controller;

import codegym.vn.bean.Song;
import codegym.vn.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
        service.upload(song);
        model.addAttribute("mess", "Song uploaded");
        model.addAttribute("list", service.showAll());
        return "list";
    }

    @GetMapping("update")
    public String showFormUpdate(Model model, @RequestParam int id) {
        List<Song> songList = service.showAll();
        for (Song s : songList) {
            if(s.getId() == id) {
                model.addAttribute("song", s);
                break;
            }
        }
        return "update";
    }

    @PostMapping("update")
    public String saveUpdate(Model model, @ModelAttribute Song song) {
        service.update(song);
        model.addAttribute("mess", "Song updated");
        model.addAttribute("list", service.showAll());
        return "list";
    }

    @GetMapping("delete")
    public String delete(Model model, @RequestParam("id") int id) {
        service.delete(id);
        model.addAttribute("mess", "Song deleted");
        model.addAttribute("list", service.showAll());
        return "list";
    }
}
