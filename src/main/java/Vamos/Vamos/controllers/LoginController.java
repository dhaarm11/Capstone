package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"login"})
public class LoginController {

    @RequestMapping({""})
    public String login(Model model) {

        model.addAttribute("title", "Log In");

        return "login";
    }
}
