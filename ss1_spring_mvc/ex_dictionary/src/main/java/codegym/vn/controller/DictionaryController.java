package codegym.vn.controller;

import codegym.vn.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    DictionaryService service;

    @GetMapping("/result")
    public String translate(Model model, @RequestParam(value = "eng", defaultValue = "", required = false) String eng) {
        model.addAttribute("vie", service.translate(eng));
        model.addAttribute("eng", eng);
        return "/dictionary/result";
    }
}
