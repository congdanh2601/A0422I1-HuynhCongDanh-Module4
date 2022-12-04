package codegym.vn.controller;

import codegym.vn.bean.Setting;
import codegym.vn.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SettingController {
    @Autowired
    ISettingService service;

    @GetMapping("setting")
    public String showForm(Model model) {
        Setting setting = new Setting("English", 25, false, "Thor King, Asgard");
        model.addAttribute("setting", setting);
        return "setting";
    }

    @PostMapping("setting")
    public String update(Model model, @ModelAttribute("setting")Setting setting) {
        service.update(setting);
        model.addAttribute("setting", setting);
        return "setting";
    }
}
