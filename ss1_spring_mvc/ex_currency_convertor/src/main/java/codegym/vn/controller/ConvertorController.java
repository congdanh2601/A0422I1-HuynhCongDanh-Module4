package codegym.vn.controller;

import codegym.vn.service.ConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/convertor")
public class ConvertorController {
    @Autowired
    ConvertorService service;

    @GetMapping("/result")
    public String convert(Model model, @RequestParam(value = "usd", defaultValue = "0", required = false) float usd) {
        model.addAttribute("vnd", service.convert(usd));
        model.addAttribute("usd", usd);
        return "/convertor/result";
    }
}
