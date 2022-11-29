package codegym.vn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CondimentController {
    @GetMapping({"index", "/condiment/result"})
    public String saveCondiments(Model model, @RequestParam(value = "condiment", defaultValue = "", required = false) String[] condiments) {
        model.addAttribute("condiments", condiments);
        return "/condiment/result";
    }
}
