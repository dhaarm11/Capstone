package Vamos.Vamos.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import Vamos.Vamos.models.User;
import Vamos.Vamos.models.data.UserDao;

import javax.validation.Valid;
import java.util.Properties;

@Controller
@RequestMapping({"signup"})
public class SignupController {


    @RequestMapping({""})
    public String signup(Model model) {

        model.addAttribute("title", "Create An Account");

        return "signup";
    }

    @RequestMapping(
            value = {"add"},
            method = {RequestMethod.POST}
    )
    public String AddUser(Model model, @ModelAttribute @Valid User user, Error errors,
                          @RequestParam String username, @RequestParam String firstname,
                          @RequestParam String lastname, @RequestParam String email,
                          @RequestParam String password) {
        user = new User(username, firstname, lastname, email, password);
        return "/home";
    }
}
