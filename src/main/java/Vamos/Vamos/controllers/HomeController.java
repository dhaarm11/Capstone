package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({""})
public class HomeController {
    public HomeController() {
    }

    @RequestMapping({""})
    public String index(Model model) {
        return "home";
    }
}
